/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TIntervalValueKeyword extends Token
{
    public TIntervalValueKeyword()
    {
        super.setText("interval_value");
    }

    public TIntervalValueKeyword(int line, int pos)
    {
        super.setText("interval_value");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIntervalValueKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIntervalValueKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIntervalValueKeyword text.");
    }
}
