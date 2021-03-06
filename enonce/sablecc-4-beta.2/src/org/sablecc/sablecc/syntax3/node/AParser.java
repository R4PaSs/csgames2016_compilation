/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AParser extends PParser
{
    private TParserKeyword _parserKeyword_;
    private PStart _start_;
    private PRestartable _restartable_;
    private final LinkedList<PParserContext> _parserContexts_ = new LinkedList<PParserContext>();
    private PInlined _inlined_;

    public AParser()
    {
        // Constructor
    }

    public AParser(
        @SuppressWarnings("hiding") TParserKeyword _parserKeyword_,
        @SuppressWarnings("hiding") PStart _start_,
        @SuppressWarnings("hiding") PRestartable _restartable_,
        @SuppressWarnings("hiding") List<PParserContext> _parserContexts_,
        @SuppressWarnings("hiding") PInlined _inlined_)
    {
        // Constructor
        setParserKeyword(_parserKeyword_);

        setStart(_start_);

        setRestartable(_restartable_);

        setParserContexts(_parserContexts_);

        setInlined(_inlined_);

    }

    @Override
    public Object clone()
    {
        return new AParser(
            cloneNode(this._parserKeyword_),
            cloneNode(this._start_),
            cloneNode(this._restartable_),
            cloneList(this._parserContexts_),
            cloneNode(this._inlined_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParser(this);
    }

    public TParserKeyword getParserKeyword()
    {
        return this._parserKeyword_;
    }

    public void setParserKeyword(TParserKeyword node)
    {
        if(this._parserKeyword_ != null)
        {
            this._parserKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parserKeyword_ = node;
    }

    public PStart getStart()
    {
        return this._start_;
    }

    public void setStart(PStart node)
    {
        if(this._start_ != null)
        {
            this._start_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._start_ = node;
    }

    public PRestartable getRestartable()
    {
        return this._restartable_;
    }

    public void setRestartable(PRestartable node)
    {
        if(this._restartable_ != null)
        {
            this._restartable_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._restartable_ = node;
    }

    public LinkedList<PParserContext> getParserContexts()
    {
        return this._parserContexts_;
    }

    public void setParserContexts(List<PParserContext> list)
    {
        this._parserContexts_.clear();
        this._parserContexts_.addAll(list);
        for(PParserContext e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PInlined getInlined()
    {
        return this._inlined_;
    }

    public void setInlined(PInlined node)
    {
        if(this._inlined_ != null)
        {
            this._inlined_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inlined_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parserKeyword_)
            + toString(this._start_)
            + toString(this._restartable_)
            + toString(this._parserContexts_)
            + toString(this._inlined_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parserKeyword_ == child)
        {
            this._parserKeyword_ = null;
            return;
        }

        if(this._start_ == child)
        {
            this._start_ = null;
            return;
        }

        if(this._restartable_ == child)
        {
            this._restartable_ = null;
            return;
        }

        if(this._parserContexts_.remove(child))
        {
            return;
        }

        if(this._inlined_ == child)
        {
            this._inlined_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parserKeyword_ == oldChild)
        {
            setParserKeyword((TParserKeyword) newChild);
            return;
        }

        if(this._start_ == oldChild)
        {
            setStart((PStart) newChild);
            return;
        }

        if(this._restartable_ == oldChild)
        {
            setRestartable((PRestartable) newChild);
            return;
        }

        for(ListIterator<PParserContext> i = this._parserContexts_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParserContext) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._inlined_ == oldChild)
        {
            setInlined((PInlined) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
