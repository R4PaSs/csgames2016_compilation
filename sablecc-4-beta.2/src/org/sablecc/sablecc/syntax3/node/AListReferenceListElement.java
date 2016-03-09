/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AListReferenceListElement extends PListElement
{
    private PElementReference _elementReference_;
    private TThreeDots _threeDots_;

    public AListReferenceListElement()
    {
        // Constructor
    }

    public AListReferenceListElement(
        @SuppressWarnings("hiding") PElementReference _elementReference_,
        @SuppressWarnings("hiding") TThreeDots _threeDots_)
    {
        // Constructor
        setElementReference(_elementReference_);

        setThreeDots(_threeDots_);

    }

    @Override
    public Object clone()
    {
        return new AListReferenceListElement(
            cloneNode(this._elementReference_),
            cloneNode(this._threeDots_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListReferenceListElement(this);
    }

    public PElementReference getElementReference()
    {
        return this._elementReference_;
    }

    public void setElementReference(PElementReference node)
    {
        if(this._elementReference_ != null)
        {
            this._elementReference_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementReference_ = node;
    }

    public TThreeDots getThreeDots()
    {
        return this._threeDots_;
    }

    public void setThreeDots(TThreeDots node)
    {
        if(this._threeDots_ != null)
        {
            this._threeDots_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._threeDots_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementReference_)
            + toString(this._threeDots_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementReference_ == child)
        {
            this._elementReference_ = null;
            return;
        }

        if(this._threeDots_ == child)
        {
            this._threeDots_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementReference_ == oldChild)
        {
            setElementReference((PElementReference) newChild);
            return;
        }

        if(this._threeDots_ == oldChild)
        {
            setThreeDots((TThreeDots) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
