/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ASeparatedIntervalExponentExpression extends PExpression
{
    private PExpression _base_;
    private TSeparatorKeyword _separatorKeyword_;
    private PExpression _separator_;
    private TCaret _caret_;
    private TNumber _from_;
    private TTwoDots _twoDots_;
    private TNumber _to_;

    public ASeparatedIntervalExponentExpression()
    {
        // Constructor
    }

    public ASeparatedIntervalExponentExpression(
        @SuppressWarnings("hiding") PExpression _base_,
        @SuppressWarnings("hiding") TSeparatorKeyword _separatorKeyword_,
        @SuppressWarnings("hiding") PExpression _separator_,
        @SuppressWarnings("hiding") TCaret _caret_,
        @SuppressWarnings("hiding") TNumber _from_,
        @SuppressWarnings("hiding") TTwoDots _twoDots_,
        @SuppressWarnings("hiding") TNumber _to_)
    {
        // Constructor
        setBase(_base_);

        setSeparatorKeyword(_separatorKeyword_);

        setSeparator(_separator_);

        setCaret(_caret_);

        setFrom(_from_);

        setTwoDots(_twoDots_);

        setTo(_to_);

    }

    @Override
    public Object clone()
    {
        return new ASeparatedIntervalExponentExpression(
            cloneNode(this._base_),
            cloneNode(this._separatorKeyword_),
            cloneNode(this._separator_),
            cloneNode(this._caret_),
            cloneNode(this._from_),
            cloneNode(this._twoDots_),
            cloneNode(this._to_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeparatedIntervalExponentExpression(this);
    }

    public PExpression getBase()
    {
        return this._base_;
    }

    public void setBase(PExpression node)
    {
        if(this._base_ != null)
        {
            this._base_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._base_ = node;
    }

    public TSeparatorKeyword getSeparatorKeyword()
    {
        return this._separatorKeyword_;
    }

    public void setSeparatorKeyword(TSeparatorKeyword node)
    {
        if(this._separatorKeyword_ != null)
        {
            this._separatorKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._separatorKeyword_ = node;
    }

    public PExpression getSeparator()
    {
        return this._separator_;
    }

    public void setSeparator(PExpression node)
    {
        if(this._separator_ != null)
        {
            this._separator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._separator_ = node;
    }

    public TCaret getCaret()
    {
        return this._caret_;
    }

    public void setCaret(TCaret node)
    {
        if(this._caret_ != null)
        {
            this._caret_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caret_ = node;
    }

    public TNumber getFrom()
    {
        return this._from_;
    }

    public void setFrom(TNumber node)
    {
        if(this._from_ != null)
        {
            this._from_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._from_ = node;
    }

    public TTwoDots getTwoDots()
    {
        return this._twoDots_;
    }

    public void setTwoDots(TTwoDots node)
    {
        if(this._twoDots_ != null)
        {
            this._twoDots_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._twoDots_ = node;
    }

    public TNumber getTo()
    {
        return this._to_;
    }

    public void setTo(TNumber node)
    {
        if(this._to_ != null)
        {
            this._to_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._to_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._base_)
            + toString(this._separatorKeyword_)
            + toString(this._separator_)
            + toString(this._caret_)
            + toString(this._from_)
            + toString(this._twoDots_)
            + toString(this._to_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._base_ == child)
        {
            this._base_ = null;
            return;
        }

        if(this._separatorKeyword_ == child)
        {
            this._separatorKeyword_ = null;
            return;
        }

        if(this._separator_ == child)
        {
            this._separator_ = null;
            return;
        }

        if(this._caret_ == child)
        {
            this._caret_ = null;
            return;
        }

        if(this._from_ == child)
        {
            this._from_ = null;
            return;
        }

        if(this._twoDots_ == child)
        {
            this._twoDots_ = null;
            return;
        }

        if(this._to_ == child)
        {
            this._to_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._base_ == oldChild)
        {
            setBase((PExpression) newChild);
            return;
        }

        if(this._separatorKeyword_ == oldChild)
        {
            setSeparatorKeyword((TSeparatorKeyword) newChild);
            return;
        }

        if(this._separator_ == oldChild)
        {
            setSeparator((PExpression) newChild);
            return;
        }

        if(this._caret_ == oldChild)
        {
            setCaret((TCaret) newChild);
            return;
        }

        if(this._from_ == oldChild)
        {
            setFrom((TNumber) newChild);
            return;
        }

        if(this._twoDots_ == oldChild)
        {
            setTwoDots((TTwoDots) newChild);
            return;
        }

        if(this._to_ == oldChild)
        {
            setTo((TNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
