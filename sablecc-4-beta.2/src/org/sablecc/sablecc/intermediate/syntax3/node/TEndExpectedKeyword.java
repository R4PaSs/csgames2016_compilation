/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TEndExpectedKeyword extends Token
{
    public TEndExpectedKeyword()
    {
        super.setText("end_expected");
    }

    public TEndExpectedKeyword(int line, int pos)
    {
        super.setText("end_expected");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndExpectedKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndExpectedKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndExpectedKeyword text.");
    }
}
