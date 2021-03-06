/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ASingleElementType extends PElementType
{
    private PSingleType _singleType_;

    public ASingleElementType()
    {
        // Constructor
    }

    public ASingleElementType(
        @SuppressWarnings("hiding") PSingleType _singleType_)
    {
        // Constructor
        setSingleType(_singleType_);

    }

    @Override
    public Object clone()
    {
        return new ASingleElementType(
            cloneNode(this._singleType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASingleElementType(this);
    }

    public PSingleType getSingleType()
    {
        return this._singleType_;
    }

    public void setSingleType(PSingleType node)
    {
        if(this._singleType_ != null)
        {
            this._singleType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._singleType_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._singleType_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._singleType_ == child)
        {
            this._singleType_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._singleType_ == oldChild)
        {
            setSingleType((PSingleType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
