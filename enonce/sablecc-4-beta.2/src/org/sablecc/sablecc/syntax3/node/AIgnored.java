/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AIgnored extends PIgnored
{
    private TIgnoredKeyword _ignoredKeyword_;
    private final LinkedList<PUnit> _unit_ = new LinkedList<PUnit>();

    public AIgnored()
    {
        // Constructor
    }

    public AIgnored(
        @SuppressWarnings("hiding") TIgnoredKeyword _ignoredKeyword_,
        @SuppressWarnings("hiding") List<PUnit> _unit_)
    {
        // Constructor
        setIgnoredKeyword(_ignoredKeyword_);

        setUnit(_unit_);

    }

    @Override
    public Object clone()
    {
        return new AIgnored(
            cloneNode(this._ignoredKeyword_),
            cloneList(this._unit_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIgnored(this);
    }

    public TIgnoredKeyword getIgnoredKeyword()
    {
        return this._ignoredKeyword_;
    }

    public void setIgnoredKeyword(TIgnoredKeyword node)
    {
        if(this._ignoredKeyword_ != null)
        {
            this._ignoredKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ignoredKeyword_ = node;
    }

    public LinkedList<PUnit> getUnit()
    {
        return this._unit_;
    }

    public void setUnit(List<PUnit> list)
    {
        this._unit_.clear();
        this._unit_.addAll(list);
        for(PUnit e : list)
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
            + toString(this._ignoredKeyword_)
            + toString(this._unit_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ignoredKeyword_ == child)
        {
            this._ignoredKeyword_ = null;
            return;
        }

        if(this._unit_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ignoredKeyword_ == oldChild)
        {
            setIgnoredKeyword((TIgnoredKeyword) newChild);
            return;
        }

        for(ListIterator<PUnit> i = this._unit_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PUnit) newChild);
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
