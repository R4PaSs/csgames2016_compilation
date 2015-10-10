/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public abstract class Token
    extends Node {

  private final String text;
  private final int line;
  private final int pos;

  public Token(String text, int line, int pos) {
    this.text = text;
    this.line = line;
    this.pos = pos;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.TNotAProduction;
  }

  @Override
  public String getText() {
    return this.text;
  }

  @Override
  public int getLine() {
    return this.line;
  }

  @Override
  public int getPos() {
    return this.pos;
  }

  @Override
  public void apply(Walker walker) {
    walker.defaultIn(this);
    walker.defaultCase(this);
    walker.defaultOut(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
  }
}