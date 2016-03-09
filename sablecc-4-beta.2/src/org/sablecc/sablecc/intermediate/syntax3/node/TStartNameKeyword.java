/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TStartNameKeyword extends Token
{
    public TStartNameKeyword()
    {
        super.setText("start_name");
    }

    public TStartNameKeyword(int line, int pos)
    {
        super.setText("start_name");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStartNameKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStartNameKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStartNameKeyword text.");
    }
}
