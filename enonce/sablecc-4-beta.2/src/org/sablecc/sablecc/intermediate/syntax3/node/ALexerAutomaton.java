/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ALexerAutomaton extends PLexerAutomaton
{
    private final LinkedList<PLexerState> _lexerStates_ = new LinkedList<PLexerState>();
    private final LinkedList<TString> _markers_ = new LinkedList<TString>();

    public ALexerAutomaton()
    {
        // Constructor
    }

    public ALexerAutomaton(
        @SuppressWarnings("hiding") List<PLexerState> _lexerStates_,
        @SuppressWarnings("hiding") List<TString> _markers_)
    {
        // Constructor
        setLexerStates(_lexerStates_);

        setMarkers(_markers_);

    }

    @Override
    public Object clone()
    {
        return new ALexerAutomaton(
            cloneList(this._lexerStates_),
            cloneList(this._markers_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALexerAutomaton(this);
    }

    public LinkedList<PLexerState> getLexerStates()
    {
        return this._lexerStates_;
    }

    public void setLexerStates(List<PLexerState> list)
    {
        this._lexerStates_.clear();
        this._lexerStates_.addAll(list);
        for(PLexerState e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<TString> getMarkers()
    {
        return this._markers_;
    }

    public void setMarkers(List<TString> list)
    {
        this._markers_.clear();
        this._markers_.addAll(list);
        for(TString e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lexerStates_)
            + toString(this._markers_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lexerStates_.remove(child))
        {
            return;
        }

        if(this._markers_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PLexerState> i = this._lexerStates_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PLexerState) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<TString> i = this._markers_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TString) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
