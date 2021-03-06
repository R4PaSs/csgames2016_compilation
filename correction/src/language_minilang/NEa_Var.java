/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NEa_Var
    extends NEa {

  private final int line;
  private final int pos;
  private final NId eId;

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
    walker.inEa_Var(this);
    walker.caseEa_Var(this);
    walker.outEa_Var(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eId.apply(walker);
  }

  public NEa_Var(int line, int pos, NId pId) {
    this.line = line;
    this.pos = pos;
    this.eId = pId;
  }

  @Override
  public Type getType() {
    return Type.T_Ea_Var;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Ea;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Ea_Var;
  }

  public NId get_Id() {
    return this.eId;
  }

  NId internalGetId() {
    return this.eId;
  }
}
