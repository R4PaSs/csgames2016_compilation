/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NCp_Eq
    extends NCp {

  private final int line;
  private final int pos;
  private final N$0 e$0;
  private final NE eRight;

  @Override
  public int getLine() {
    return this.line;
  }

  @Override
  public int getPos() {
    return this.pos;
  }

  @Override
  public String getText() {
    return null;
  }

  @Override
  public void apply(Walker walker) {
    walker.inCp_Eq(this);
    walker.caseCp_Eq(this);
    walker.outCp_Eq(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.e$0.apply(walker);
    this.eRight.apply(walker);
  }

  NCp_Eq(int line, int pos, N$0 p$0, NE pRight) {
    this.line = line;
    this.pos = pos;
    this.e$0 = p$0;
    this.eRight = pRight;
  }

  @Override
  public Type getType() {
    return Type.T_Cp_Eq;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Cp;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Cp_Eq;
  }

  public NE get_Right() {
    return this.eRight;
  }

  N$0 internalGet$0() {
    return this.e$0;
  }

  NE internalGetRight() {
    return this.eRight;
  }
}