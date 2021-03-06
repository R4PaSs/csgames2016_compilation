/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AProductionParserTransition extends PParserTransition
{
    private TString _parseProduction_;
    private TString _target_;

    public AProductionParserTransition()
    {
        // Constructor
    }

    public AProductionParserTransition(
        @SuppressWarnings("hiding") TString _parseProduction_,
        @SuppressWarnings("hiding") TString _target_)
    {
        // Constructor
        setParseProduction(_parseProduction_);

        setTarget(_target_);

    }

    @Override
    public Object clone()
    {
        return new AProductionParserTransition(
            cloneNode(this._parseProduction_),
            cloneNode(this._target_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProductionParserTransition(this);
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

    public TString getTarget()
    {
        return this._target_;
    }

    public void setTarget(TString node)
    {
        if(this._target_ != null)
        {
            this._target_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._target_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parseProduction_)
            + toString(this._target_);
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

        if(this._target_ == child)
        {
            this._target_ = null;
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

        if(this._target_ == oldChild)
        {
            setTarget((TString) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
