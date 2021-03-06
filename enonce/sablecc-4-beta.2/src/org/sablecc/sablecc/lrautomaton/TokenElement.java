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

public class TokenElement
        extends Element {

    private final Token token;

    TokenElement(
            Alternative alternative,
            int position,
            String shortName,
            Token token) {

        super(alternative, position, shortName);
        this.token = token;
    }

    public Token getToken() {

        return this.token;
    }

    @Override
    public String toString() {

        return "[" + getName() + ":]" + this.token.getName();
    }
}
