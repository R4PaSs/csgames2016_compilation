/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AInlineTextValue extends PValue
{
    private final LinkedList<PInlineText> _inlineTexts_ = new LinkedList<PInlineText>();

    public AInlineTextValue()
    {
        // Constructor
    }

    public AInlineTextValue(
        @SuppressWarnings("hiding") List<PInlineText> _inlineTexts_)
    {
        // Constructor
        setInlineTexts(_inlineTexts_);

    }

    @Override
    public Object clone()
    {
        return new AInlineTextValue(
            cloneList(this._inlineTexts_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInlineTextValue(this);
    }

    public LinkedList<PInlineText> getInlineTexts()
    {
        return this._inlineTexts_;
    }

    public void setInlineTexts(List<PInlineText> list)
    {
        this._inlineTexts_.clear();
        this._inlineTexts_.addAll(list);
        for(PInlineText e : list)
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
            + toString(this._inlineTexts_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inlineTexts_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PInlineText> i = this._inlineTexts_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PInlineText) newChild);
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
