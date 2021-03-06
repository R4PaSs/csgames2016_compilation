/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AExpectedSelection extends PExpectedSelection
{
    private TString _parseProduction_;
    private TString _parseAlternative_;

    public AExpectedSelection()
    {
        // Constructor
    }

    public AExpectedSelection(
        @SuppressWarnings("hiding") TString _parseProduction_,
        @SuppressWarnings("hiding") TString _parseAlternative_)
    {
        // Constructor
        setParseProduction(_parseProduction_);

        setParseAlternative(_parseAlternative_);

    }

    @Override
    public Object clone()
    {
        return new AExpectedSelection(
            cloneNode(this._parseProduction_),
            cloneNode(this._parseAlternative_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpectedSelection(this);
    }

    public TString getParseProduction()
    {
        return this._parseProduction_;
    }

    public void setParseProduction(TString node)
    {
        if(this._parseProduction_ != null)
        {
            this._parseProduction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parseProduction_ = node;
    }

    public TString getParseAlternative()
    {
        return this._parseAlternative_;
    }

    public void setParseAlternative(TString node)
    {
        if(this._parseAlternative_ != null)
        {
            this._parseAlternative_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parseAlternative_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parseProduction_)
            + toString(this._parseAlternative_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parseProduction_ == child)
        {
            this._parseProduction_ = null;
            return;
        }

        if(this._parseAlternative_ == child)
        {
            this._parseAlternative_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parseProduction_ == oldChild)
        {
            setParseProduction((TString) newChild);
            return;
        }

        if(this._parseAlternative_ == oldChild)
        {
            setParseAlternative((TString) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
