/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NE_Neg
    extends NE {

  private final int line;
  private final int pos;
  private final N$9 e$9;
  private final NEm eEm;

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
    walker.inE_Neg(this);
    walker.caseE_Neg(this);
    walker.outE_Neg(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.e$9.apply(walker);
    this.eEm.apply(walker);
  }

  NE_Neg(int line, int pos, N$9 p$9, NEm pEm) {
    this.line = line;
    this.pos = pos;
    this.e$9 = p$9;
    this.eEm = pEm;
  }

  @Override
  public Type getType() {
    return Type.T_E_Neg;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_E;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_E_Neg;
  }

  public NEm get_Em() {
    return this.eEm;
  }

  N$9 internalGet$9() {
    return this.e$9;
  }

  NEm internalGetEm() {
    return this.eEm;
  }
}
