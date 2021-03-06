/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.sablecc.lrautomaton;

import java.util.*;

import org.sablecc.exception.*;
import org.sablecc.util.*;

public class LRState {

    private static int nextId = 0;

    private final int id;

    private final LRAutomaton automaton;

    private final Set<Item> coreItemSet = new LinkedHashSet<Item>();

    private final Map<Item, Set<Item>> originatingCoreItemMap = new LinkedHashMap<Item, Set<Item>>();

    private final Set<Item> items = new LinkedHashSet<Item>();

    private final Map<Token, LRState> tokenTransitions = new LinkedHashMap<Token, LRState>();

    private final Map<Production, LRState> productionTransitions = new LinkedHashMap<Production, LRState>();

    private final Set<Item> shiftItems = new LinkedHashSet<Item>();

    private final Set<Item> reduceItems = new LinkedHashSet<Item>();

    private final Set<Action> actions = new LinkedHashSet<Action>();

    private final Map<Item, Set<LRState>> origins = new LinkedHashMap<Item, Set<LRState>>();

    private Map<Production, Map<Integer, Set<Item>>> productionToLookaheadMap = new LinkedHashMap<Production, Map<Integer, Set<Item>>>();

    LRState(
            LRAutomaton automaton,
            Set<Item> coreItemSet) {

        this.id = nextId++;
        this.automaton = automaton;
        this.coreItemSet.addAll(coreItemSet);

        for (Item coreItem : this.coreItemSet) {
            WorkSet<Item> workSet = new WorkSet<Item>();

            this.items.add(coreItem);
            workSet.add(coreItem);

            while (workSet.hasNext()) {
                Item item = workSet.next();

                if (item.getType() == ItemType.BEFORE_PRODUCTION) {
                    Production production = item.getProductionElement()
                            .getProduction();
                    for (Alternative alternative : production.getAlternatives()) {
                        Item newItem = alternative.getItem(0);
                        this.items.add(newItem);
                        workSet.add(newItem);
                        addOriginatingCoreItem(newItem, coreItem);
                    }
                }
            }
        }

        for (Item item : this.items) {
            switch (item.getType()) {
            case BEFORE_TOKEN:
                this.shiftItems.add(item);
                break;
            case END:
                this.reduceItems.add(item);
                break;
            }
        }
    }

    private void addOriginatingCoreItem(
            Item item,
            Item coreItem) {

        Set<Item> coreItems = this.originatingCoreItemMap.get(item);
        if (coreItems == null) {
            coreItems = new LinkedHashSet<Item>();
            this.originatingCoreItemMap.put(item, coreItems);
        }
        coreItems.add(coreItem);
    }

    private Set<Item> getOriginatingCoreItems(
            Item item) {

        if (!this.originatingCoreItemMap.containsKey(item)) {
            throw new InternalException("invalid item");
        }

        return this.originatingCoreItemMap.get(item);
    }

    private Set<Item> getGeneratingCoreItems(
            Item shiftItem) {

        if (shiftItem.getType() != ItemType.BEFORE_TOKEN) {
            throw new InternalException("shiftItem is not a shift item");
        }

        Set<Item> generatingCoreItems = new LinkedHashSet<Item>();

        Set<LRState> shiftItemOrigins = getOrigins(shiftItem);
        for (LRState origin : shiftItemOrigins) {
            generatingCoreItems.addAll(origin.getOriginatingCoreItems(shiftItem
                    .getAlternative().getItem(0)));
        }
        return generatingCoreItems;
    }

    void computeTransitions() {

        Map<Token, Set<Item>> tokenToItemSetMap = new LinkedHashMap<Token, Set<Item>>();
        Map<Production, Set<Item>> productionToItemSetMap = new LinkedHashMap<Production, Set<Item>>();

        for (Item sourceItem : this.items) {
            switch (sourceItem.getType()) {
            case BEFORE_TOKEN: {
                Token token = sourceItem.getTokenElement().getToken();
                Set<Item> itemSet = tokenToItemSetMap.get(token);
                if (itemSet == null) {
                    itemSet = new LinkedHashSet<Item>();
                    tokenToItemSetMap.put(token, itemSet);
                }
                itemSet.add(sourceItem.next());
                break;
            }
            case BEFORE_PRODUCTION: {
                Production production = sourceItem.getProductionElement()
                        .getProduction();
                Set<Item> itemSet = productionToItemSetMap.get(production);
                if (itemSet == null) {
                    itemSet = new LinkedHashSet<Item>();
                    productionToItemSetMap.put(production, itemSet);
                }
                itemSet.add(sourceItem.next());
                break;
            }
            default:
                break;
            }
        }

        for (Map.Entry<Token, Set<Item>> entry : tokenToItemSetMap.entrySet()) {
            Token token = entry.getKey();
            Set<Item> itemSet = entry.getValue();
            LRState destinationState = this.automaton.getState(itemSet);
            this.tokenTransitions.put(token, destinationState);
        }

        for (Map.Entry<Production, Set<Item>> entry : productionToItemSetMap
                .entrySet()) {
            Production production = entry.getKey();
            Set<Item> itemSet = entry.getValue();
            LRState destinationState = this.automaton.getState(itemSet);
            this.productionTransitions.put(production, destinationState);
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean first = true;
        for (Item item : this.coreItemSet) {
            if (first) {
                first = false;
            }
            else {
                sb.append(",");
            }

            sb.append(item);
        }
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

    void computeOrigins() {

        for (Item item : this.items) {
            if (item.getPosition() == 0) {
                LRState state = this;
                Item stateItem = item;
                state.addOrigin(stateItem, this);
                for (Element element : item.getAlternative().getElements()) {
                    if (element instanceof TokenElement) {
                        TokenElement tokenElement = (TokenElement) element;
                        state = state.getTarget(tokenElement.getToken());
                    }
                    else {
                        ProductionElement productionElement = (ProductionElement) element;
                        state = state.getTarget(productionElement
                                .getProduction());
                    }
                    stateItem = stateItem.next();
                    state.addOrigin(stateItem, this);
                }
            }
        }
    }

    void addOrigin(
            Item stateItem,
            LRState origin) {

        if (!this.items.contains(stateItem)) {
            throw new InternalException("invalid item");
        }

        Set<LRState> stateSet = this.origins.get(stateItem);
        if (stateSet == null) {
            stateSet = new LinkedHashSet<LRState>();
            this.origins.put(stateItem, stateSet);
        }
        stateSet.add(origin);
    }

    public LRState getTarget(
            Token token) {

        return this.tokenTransitions.get(token);
    }

    public LRState getTarget(
            Production production) {

        return this.productionTransitions.get(production);
    }

    public Set<LRState> getOrigins(
            Item item) {

        if (!this.items.contains(item)) {
            throw new InternalException("invalid item");
        }

        return this.origins.get(item);
    }

    void computeActions(
            Verbosity verbosity) {

        // LR(0) shift state
        if (this.reduceItems.size() == 0) {
            this.actions.add(new ShiftAction(null));

            switch (verbosity) {
            case VERBOSE:
                System.out.println("   - LR(0) shift state found");
                break;
            }

            return;
        }

        // LR(0) reduce state
        if (this.shiftItems.size() == 0 && this.reduceItems.size() == 1) {
            this.actions.add(new ReduceAction(null, this.reduceItems.iterator()
                    .next().getAlternative()));

            switch (verbosity) {
            case VERBOSE:
                System.out.println("   - LR(0) reduce state found");
                break;
            }

            return;
        }

        Set<Item> conflictItems = new LinkedHashSet<Item>();
        conflictItems.addAll(this.shiftItems);
        conflictItems.addAll(this.reduceItems);
        PairExtractor<Item> pairExtractor = new PairExtractor<Item>(
                conflictItems);

        switch (verbosity) {
        case VERBOSE:
            System.out.println("   - Analyzing "
                    + pairExtractor.getPairs().size() + " potential conflicts");
            break;
        }

        Map<Item, Map<Integer, Set<Item>>> itemToLookaheadMap = new LinkedHashMap<Item, Map<Integer, Set<Item>>>();
        Map<Item, Set<Item>> itemToRemoveLookaheadMap = new LinkedHashMap<Item, Set<Item>>();

        for (Pair<Item, Item> pair : pairExtractor.getPairs()) {
            Item leftItem = pair.getLeft();
            Item rightItem = pair.getRight();

            Map<Integer, Set<Item>> leftLookahead = itemToLookaheadMap
                    .get(leftItem);
            Map<Integer, Set<Item>> rightLookahead = itemToLookaheadMap
                    .get(rightItem);

            if (leftLookahead == null) {
                leftLookahead = new LinkedHashMap<Integer, Set<Item>>();
                itemToLookaheadMap.put(leftItem, leftLookahead);
            }

            if (rightLookahead == null) {
                rightLookahead = new LinkedHashMap<Integer, Set<Item>>();
                itemToLookaheadMap.put(rightItem, rightLookahead);
            }

            if (leftItem.getType() == ItemType.BEFORE_TOKEN
                    && rightItem.getType() == ItemType.BEFORE_TOKEN) {

                // shift/shift => no conflict

                if (!leftLookahead.containsKey(1)) {
                    Set<Item> itemSet = new LinkedHashSet<Item>();
                    itemSet.add(leftItem);
                    leftLookahead.put(1, itemSet);
                }

                if (!rightLookahead.containsKey(1)) {
                    Set<Item> itemSet = new LinkedHashSet<Item>();
                    itemSet.add(rightItem);
                    rightLookahead.put(1, itemSet);
                }

                continue;
            }

            switch (verbosity) {
            case VERBOSE:
                if (leftItem.getType() == ItemType.BEFORE_TOKEN
                        || rightItem.getType() == ItemType.BEFORE_TOKEN) {
                    System.out.println("    - Shift/reduce conflict found");
                }
                else {
                    System.out.println("    - Reduce/reduce conflict found");
                }
                break;
            }

            int distance = 0;
            boolean resolved = false;
            while (!resolved) {
                distance++;

                switch (verbosity) {
                case VERBOSE:
                    System.out.println("     Trying linear approximate LALR("
                            + distance + ")");
                    break;
                }

                Set<Item> leftLookItems = leftLookahead.get(distance);

                if (leftLookItems == null) {
                    leftLookItems = new LinkedHashSet<Item>();
                    Set<Farther> fartherSet = new LinkedHashSet<Farther>();
                    for (Ahead ahead : leftItem.look(distance)) {
                        if (ahead instanceof Item) {
                            leftLookItems.add((Item) ahead);
                        }
                        else {
                            fartherSet.add((Farther) ahead);
                        }
                    }
                    for (Farther farther : fartherSet) {
                        leftLookItems.addAll(lookBeyond(leftItem, farther
                                .getDistance()));
                    }

                    leftLookahead.put(distance, leftLookItems);
                }

                Set<Item> rightLookItems = rightLookahead.get(distance);

                if (rightLookItems == null) {
                    rightLookItems = new LinkedHashSet<Item>();
                    Set<Farther> fartherSet = new LinkedHashSet<Farther>();
                    for (Ahead ahead : rightItem.look(distance)) {
                        if (ahead instanceof Item) {
                            rightLookItems.add((Item) ahead);
                        }
                        else {
                            fartherSet.add((Farther) ahead);
                        }
                    }
                    for (Farther farther : fartherSet) {
                        rightLookItems.addAll(lookBeyond(rightItem, farther
                                .getDistance()));
                    }

                    rightLookahead.put(distance, rightLookItems);
                }

                // if shift/reduce on LOOK(1): look for priorities
                if (distance == 1
                        && (leftItem.getType() == ItemType.BEFORE_TOKEN || rightItem
                                .getType() == ItemType.BEFORE_TOKEN)) {

                    {
                        // create modifiable clones of left and right item sets
                        Set<Item> newLeftItems = new LinkedHashSet<Item>();
                        Set<Item> newRightItems = new LinkedHashSet<Item>();

                        newLeftItems.addAll(leftLookItems);
                        newRightItems.addAll(rightLookItems);

                        leftLookItems = newLeftItems;
                        rightLookItems = newRightItems;
                    }

                    Item shiftItem;
                    Item reduceItem;
                    Set<Item> shiftLookItems;
                    Set<Item> reduceLookItems;

                    if (leftItem.getType() == ItemType.BEFORE_TOKEN) {
                        shiftItem = leftItem;
                        reduceItem = rightItem;
                        shiftLookItems = leftLookItems;
                        reduceLookItems = rightLookItems;
                    }
                    else {
                        shiftItem = rightItem;
                        reduceItem = leftItem;
                        shiftLookItems = rightLookItems;
                        reduceLookItems = leftLookItems;
                    }

                    if (shiftItem.hasPriorityOver(reduceItem)) {
                        if (reduceLookItems.contains(shiftItem)) {
                            Set<Item> lookaheadToRemove = itemToRemoveLookaheadMap
                                    .get(reduceItem);
                            if (lookaheadToRemove == null) {
                                lookaheadToRemove = new LinkedHashSet<Item>();
                                itemToRemoveLookaheadMap.put(reduceItem,
                                        lookaheadToRemove);
                            }
                            lookaheadToRemove.add(shiftItem);
                            reduceLookItems.remove(shiftItem);
                            switch (verbosity) {
                            case VERBOSE:
                                System.out.println("     Applying priority");
                                break;
                            }
                        }
                    }
                    else if (reduceItem.hasPriorityOver(shiftItem)) {
                        Set<Item> generatingCoreItems = getGeneratingCoreItems(shiftItem);
                        if (generatingCoreItems.size() == 1
                                && generatingCoreItems.contains(reduceItem
                                        .getAlternative().getItem(
                                                reduceItem.getPosition() - 1))) {
                            Set<Item> lookaheadToRemove = itemToRemoveLookaheadMap
                                    .get(shiftItem);
                            if (lookaheadToRemove == null) {
                                lookaheadToRemove = new LinkedHashSet<Item>();
                                itemToRemoveLookaheadMap.put(shiftItem,
                                        lookaheadToRemove);
                            }
                            lookaheadToRemove.add(shiftItem);
                            shiftLookItems.remove(shiftItem);
                            switch (verbosity) {
                            case VERBOSE:
                                System.out.println("     Applying priority");
                                break;
                            }
                        }
                    }
                }

                Set<Token> leftTokens = new LinkedHashSet<Token>();
                Set<Token> rightTokens = new LinkedHashSet<Token>();

                for (Item item : leftLookItems) {
                    leftTokens.add(item.getTokenElement().getToken());
                }
                for (Item item : rightLookItems) {
                    rightTokens.add(item.getTokenElement().getToken());
                }

                Set<Token> intersection = new LinkedHashSet<Token>(leftTokens);
                intersection.retainAll(rightTokens);

                if (intersection.size() == 0) {
                    switch (verbosity) {
                    case VERBOSE:
                        System.out.println("     Conflict is resolved");
                        break;
                    }
                    resolved = true;
                }
                else {
                    for (Token token : intersection) {
                        if (token.getName().equals("$end")) {
                            throw new InternalException(
                                    "conflit confirmed between items "
                                            + leftItem + " and " + rightItem);
                        }
                    }
                }
            }
        }

        for (Item item : this.shiftItems) {
            Map<Integer, Set<Item>> lookahead = itemToLookaheadMap.get(item);
            Map<Integer, Set<Item>> distanceToItemSetMap = new LinkedHashMap<Integer, Set<Item>>();

            {
                Set<Item> items = new LinkedHashSet<Item>();
                items.addAll(lookahead.get(1));
                if (itemToRemoveLookaheadMap.containsKey(item)) {
                    items.removeAll(itemToRemoveLookaheadMap.get(item));
                }
                distanceToItemSetMap.put(1, items);
            }

            int maxDistance = lookahead.keySet().size();
            for (int distance = 2; distance <= maxDistance; distance++) {
                distanceToItemSetMap.put(distance, lookahead.get(distance));
            }

            this.actions.add(new ShiftAction(distanceToItemSetMap));
        }

        for (Item item : this.reduceItems) {
            Map<Integer, Set<Item>> lookahead = itemToLookaheadMap.get(item);
            Map<Integer, Set<Item>> distanceToItemSetMap = new LinkedHashMap<Integer, Set<Item>>();

            {
                Set<Item> items = new LinkedHashSet<Item>();
                items.addAll(lookahead.get(1));
                if (itemToRemoveLookaheadMap.containsKey(item)) {
                    items.removeAll(itemToRemoveLookaheadMap.get(item));
                }
                distanceToItemSetMap.put(1, items);
            }

            int maxDistance = lookahead.keySet().size();
            for (int distance = 2; distance <= maxDistance; distance++) {
                distanceToItemSetMap.put(distance, lookahead.get(distance));
            }

            this.actions.add(new ReduceAction(distanceToItemSetMap, item
                    .getAlternative()));
        }
    }

    private Set<Item> lookBeyond(
            Item item,
            int distance) {

        Set<Item> items = new LinkedHashSet<Item>();

        if (this.origins.get(item).size() == 0) {
            if (!item.getAlternative().getProduction().getName().equals(
                    "$Start")) {
                throw new InternalException("invalid item");
            }
            items.add(item.getAlternative().getItem(1));
            return items;
        }

        for (LRState state : this.origins.get(item)) {
            items.addAll(state.look(item.getAlternative().getProduction(),
                    distance));
        }

        return items;
    }

    public Set<Item> look(
            Production production,
            int distance) {

        Map<Integer, Set<Item>> lookahead = this.productionToLookaheadMap
                .get(production);

        if (lookahead == null) {
            lookahead = new LinkedHashMap<Integer, Set<Item>>();
            this.productionToLookaheadMap.put(production, lookahead);
        }

        Set<Item> items = lookahead.get(distance);

        if (items == null) {
            computeLook(production, distance);
            items = lookahead.get(distance);
        }

        return items;
    }

    void computeLook(
            Production production,
            int distance) {

        do {
            this.automaton.resetLookComputationData();
            tryLook(production, distance);
        }
        while (this.automaton.lookComputationDataHasChanged());

        this.automaton.storeLookComputationResults();
    }

    Set<Item> tryLook(
            Production production,
            int distance) {

        Map<Integer, Set<Item>> lookahead = this.productionToLookaheadMap
                .get(production);

        if (lookahead == null) {
            lookahead = new LinkedHashMap<Integer, Set<Item>>();
            this.productionToLookaheadMap.put(production, lookahead);
        }

        Set<Item> currentLookComputationData = lookahead.get(distance);

        if (currentLookComputationData != null) {
            return currentLookComputationData;
        }

        currentLookComputationData = this.automaton
                .getCurrentLookComputationData(this, production, distance);

        if (currentLookComputationData == null) {
            this.automaton.setCurrentLookComputationData(this, production,
                    distance, this.automaton.getPreviousLookComputationData(
                            this, production, distance));

            currentLookComputationData = new LinkedHashSet<Item>();
            for (Item item : this.items) {
                if (item.getType() == ItemType.BEFORE_PRODUCTION
                        && item.getProductionElement().getProduction() == production) {
                    Set<Farther> fartherSet = new LinkedHashSet<Farther>();
                    for (Ahead ahead : item.next().look(distance)) {
                        if (ahead instanceof Item) {
                            currentLookComputationData.add((Item) ahead);
                        }
                        else {
                            fartherSet.add((Farther) ahead);
                        }
                    }
                    for (Farther farther : fartherSet) {

                        if (this.origins.get(item).size() == 0) {
                            if (!item.getAlternative().getProduction()
                                    .getName().equals("$Start")) {
                                throw new InternalException("invalid item");
                            }
                            currentLookComputationData.add(item
                                    .getAlternative().getItem(1));
                            continue;
                        }

                        for (LRState state : this.origins.get(item)) {
                            currentLookComputationData.addAll(state.tryLook(
                                    item.getAlternative().getProduction(),
                                    farther.getDistance()));
                        }
                    }
                }
            }

            this.automaton.setCurrentLookComputationData(this, production,
                    distance, currentLookComputationData);
        }

        return currentLookComputationData;
    }

    void setLook(
            Production production,
            Integer distance,
            Set<Item> items) {

        Map<Integer, Set<Item>> lookahead = this.productionToLookaheadMap
                .get(production);

        if (lookahead == null) {
            lookahead = new LinkedHashMap<Integer, Set<Item>>();
            this.productionToLookaheadMap.put(production, lookahead);
        }

        if (lookahead.containsKey(distance)) {
            throw new InternalException("look data is already set");
        }

        lookahead.put(distance, items);
    }

    public String getName() {

        return "" + this.id;
    }

    public Map<Token, LRState> getTokenTransitions() {

        return this.tokenTransitions;
    }

    public Map<Production, LRState> getProductionTransitions() {

        return this.productionTransitions;
    }

    public Set<Action> getActions() {

        return this.actions;
    }

}
