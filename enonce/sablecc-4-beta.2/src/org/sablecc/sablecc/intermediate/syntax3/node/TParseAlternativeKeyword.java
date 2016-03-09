/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TParseAlternativeKeyword extends Token
{
    public TParseAlternativeKeyword()
    {
        super.setText("parse_alternative");
    }

    public TParseAlternativeKeyword(int line, int pos)
    {
        super.setText("parse_alternative");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TParseAlternativeKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParseAlternativeKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TParseAlternativeKeyword text.");
    }
}