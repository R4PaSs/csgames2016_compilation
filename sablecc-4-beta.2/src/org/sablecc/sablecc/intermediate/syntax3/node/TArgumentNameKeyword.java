/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TArgumentNameKeyword extends Token
{
    public TArgumentNameKeyword()
    {
        super.setText("argument_name");
    }

    public TArgumentNameKeyword(int line, int pos)
    {
        super.setText("argument_name");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TArgumentNameKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTArgumentNameKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TArgumentNameKeyword text.");
    }
}
