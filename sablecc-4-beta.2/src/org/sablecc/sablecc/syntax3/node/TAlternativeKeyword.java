/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TAlternativeKeyword extends Token
{
    public TAlternativeKeyword()
    {
        super.setText("Alternative");
    }

    public TAlternativeKeyword(int line, int pos)
    {
        super.setText("Alternative");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAlternativeKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAlternativeKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAlternativeKeyword text.");
    }
}
