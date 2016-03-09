/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AEpsilonUnit extends PUnit
{
    private TEpsilon _epsilon_;

    public AEpsilonUnit()
    {
        // Constructor
    }

    public AEpsilonUnit(
        @SuppressWarnings("hiding") TEpsilon _epsilon_)
    {
        // Constructor
        setEpsilon(_epsilon_);

    }

    @Override
    public Object clone()
    {
        return new AEpsilonUnit(
            cloneNode(this._epsilon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEpsilonUnit(this);
    }

    public TEpsilon getEpsilon()
    {
        return this._epsilon_;
    }

    public void setEpsilon(TEpsilon node)
    {
        if(this._epsilon_ != null)
        {
            this._epsilon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._epsilon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._epsilon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._epsilon_ == child)
        {
            this._epsilon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._epsilon_ == oldChild)
        {
            setEpsilon((TEpsilon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
