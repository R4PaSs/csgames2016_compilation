/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AEndExpression extends PExpression
{
    private TEndKeyword _endKeyword_;

    public AEndExpression()
    {
        // Constructor
    }

    public AEndExpression(
        @SuppressWarnings("hiding") TEndKeyword _endKeyword_)
    {
        // Constructor
        setEndKeyword(_endKeyword_);

    }

    @Override
    public Object clone()
    {
        return new AEndExpression(
            cloneNode(this._endKeyword_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEndExpression(this);
    }

    public TEndKeyword getEndKeyword()
    {
        return this._endKeyword_;
    }

    public void setEndKeyword(TEndKeyword node)
    {
        if(this._endKeyword_ != null)
        {
            this._endKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endKeyword_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._endKeyword_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._endKeyword_ == child)
        {
            this._endKeyword_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._endKeyword_ == oldChild)
        {
            setEndKeyword((TEndKeyword) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
