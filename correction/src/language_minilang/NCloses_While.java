/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NCloses_While
    extends NCloses {

  private final int line;
  private final int pos;
  private final N$8 e$8;
  private final NC eC;
  private final NCloses eCloses;

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
    walker.inCloses_While(this);
    walker.caseCloses_While(this);
    walker.outCloses_While(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.e$8.apply(walker);
    this.eC.apply(walker);
    this.eCloses.apply(walker);
  }

  NCloses_While(int line, int pos, N$8 p$8, NC pC, NCloses pCloses) {
    this.line = line;
    this.pos = pos;
    this.e$8 = p$8;
    this.eC = pC;
    this.eCloses = pCloses;
  }

  @Override
  public Type getType() {
    return Type.T_Closes_While;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Closes;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Closes_While;
  }

  public NC get_C() {
    return this.eC;
  }

  public NCloses get_Closes() {
    return this.eCloses;
  }

  N$8 internalGet$8() {
    return this.e$8;
  }

  NC internalGetC() {
    return this.eC;
  }

  NCloses internalGetCloses() {
    return this.eCloses;
  }
}
