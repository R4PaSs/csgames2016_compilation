/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NInt
    extends Token {

  public NInt(String text, int line, int pos) {
    super(text, line, pos);
  }

  @Override
  public Type getType() {
    return Type.T_Int;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Int;
  }

  @Override
  public void apply(Walker walker) {
    walker.inInt(this);
    walker.caseInt(this);
    walker.outInt(this);
  }
}
