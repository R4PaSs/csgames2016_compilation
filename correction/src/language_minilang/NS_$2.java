/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

class NS_$2
    extends NS {

  private final int line;
  private final int pos;
  private final NOpens eOpens;

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
    walker.defaultIn(this);
    walker.defaultCase(this);
    walker.defaultOut(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eOpens.apply(walker);
  }

  NS_$2(int line, int pos, NOpens pOpens) {
    this.line = line;
    this.pos = pos;
    this.eOpens = pOpens;
  }

  @Override
  public Type getType() {
    return Type.TAnonymous;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_S;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_S_$2;
  }

  NOpens internalGetOpens() {
    return this.eOpens;
  }
}
