/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TAtLeastValueKeyword extends Token
{
    public TAtLeastValueKeyword()
    {
        super.setText("at_least_value");
    }

    public TAtLeastValueKeyword(int line, int pos)
    {
        super.setText("at_least_value");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAtLeastValueKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAtLeastValueKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAtLeastValueKeyword text.");
    }
}
