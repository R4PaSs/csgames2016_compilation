/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

class NStmts_$2
    extends NStmts {

  private final int line;
  private final int pos;
  private final NS eS;
  private final NStmts eStmts;

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
    this.eS.apply(walker);
    this.eStmts.apply(walker);
  }

  NStmts_$2(int line, int pos, NS pS, NStmts pStmts) {
    this.line = line;
    this.pos = pos;
    this.eS = pS;
    this.eStmts = pStmts;
  }

  @Override
  public Type getType() {
    return Type.TAnonymous;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Stmts;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Stmts_$2;
  }

  NS internalGetS() {
    return this.eS;
  }

  NStmts internalGetStmts() {
    return this.eStmts;
  }
}
