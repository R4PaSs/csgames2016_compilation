/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AGrammar extends PGrammar
{
    private TLanguageKeyword _languageKeyword_;
    private TIdentifier _languageName_;
    private PLexer _lexer_;
    private PParser _parser_;
    private PTransformation _transformation_;
    private PTree _tree_;

    public AGrammar()
    {
        // Constructor
    }

    public AGrammar(
        @SuppressWarnings("hiding") TLanguageKeyword _languageKeyword_,
        @SuppressWarnings("hiding") TIdentifier _languageName_,
        @SuppressWarnings("hiding") PLexer _lexer_,
        @SuppressWarnings("hiding") PParser _parser_,
        @SuppressWarnings("hiding") PTransformation _transformation_,
        @SuppressWarnings("hiding") PTree _tree_)
    {
        // Constructor
        setLanguageKeyword(_languageKeyword_);

        setLanguageName(_languageName_);

        setLexer(_lexer_);

        setParser(_parser_);

        setTransformation(_transformation_);

        setTree(_tree_);

    }

    @Override
    public Object clone()
    {
        return new AGrammar(
            cloneNode(this._languageKeyword_),
            cloneNode(this._languageName_),
            cloneNode(this._lexer_),
            cloneNode(this._parser_),
            cloneNode(this._transformation_),
            cloneNode(this._tree_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGrammar(this);
    }

    public TLanguageKeyword getLanguageKeyword()
    {
        return this._languageKeyword_;
    }

    public void setLanguageKeyword(TLanguageKeyword node)
    {
        if(this._languageKeyword_ != null)
        {
            this._languageKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._languageKeyword_ = node;
    }

    public TIdentifier getLanguageName()
    {
        return this._languageName_;
    }

    public void setLanguageName(TIdentifier node)
    {
        if(this._languageName_ != null)
        {
            this._languageName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._languageName_ = node;
    }

    public PLexer getLexer()
    {
        return this._lexer_;
    }

    public void setLexer(PLexer node)
    {
        if(this._lexer_ != null)
        {
            this._lexer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lexer_ = node;
    }

    public PParser getParser()
    {
        return this._parser_;
    }

    public void setParser(PParser node)
    {
        if(this._parser_ != null)
        {
            this._parser_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parser_ = node;
    }

    public PTransformation getTransformation()
    {
        return this._transformation_;
    }

    public void setTransformation(PTransformation node)
    {
        if(this._transformation_ != null)
        {
            this._transformation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transformation_ = node;
    }

    public PTree getTree()
    {
        return this._tree_;
    }

    public void setTree(PTree node)
    {
        if(this._tree_ != null)
        {
            this._tree_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tree_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._languageKeyword_)
            + toString(this._languageName_)
            + toString(this._lexer_)
            + toString(this._parser_)
            + toString(this._transformation_)
            + toString(this._tree_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._languageKeyword_ == child)
        {
            this._languageKeyword_ = null;
            return;
        }

        if(this._languageName_ == child)
        {
            this._languageName_ = null;
            return;
        }

        if(this._lexer_ == child)
        {
            this._lexer_ = null;
            return;
        }

        if(this._parser_ == child)
        {
            this._parser_ = null;
            return;
        }

        if(this._transformation_ == child)
        {
            this._transformation_ = null;
            return;
        }

        if(this._tree_ == child)
        {
            this._tree_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._languageKeyword_ == oldChild)
        {
            setLanguageKeyword((TLanguageKeyword) newChild);
            return;
        }

        if(this._languageName_ == oldChild)
        {
            setLanguageName((TIdentifier) newChild);
            return;
        }

        if(this._lexer_ == oldChild)
        {
            setLexer((PLexer) newChild);
            return;
        }

        if(this._parser_ == oldChild)
        {
            setParser((PParser) newChild);
            return;
        }

        if(this._transformation_ == oldChild)
        {
            setTransformation((PTransformation) newChild);
            return;
        }

        if(this._tree_ == oldChild)
        {
            setTree((PTree) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}