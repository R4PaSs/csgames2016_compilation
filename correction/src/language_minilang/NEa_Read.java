/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NEa_Read
    extends NEa {

  private final int line;
  private final int pos;
  private final N$13 e$13;

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
    walker.inEa_Read(this);
    walker.caseEa_Read(this);
    walker.outEa_Read(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.e$13.apply(walker);
  }

  NEa_Read(int line, int pos, N$13 p$13) {
    this.line = line;
    this.pos = pos;
    this.e$13 = p$13;
  }

  @Override
  public Type getType() {
    return Type.T_Ea_Read;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Ea;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Ea_Read;
  }

  N$13 internalGet$13() {
    return this.e$13;
  }
}