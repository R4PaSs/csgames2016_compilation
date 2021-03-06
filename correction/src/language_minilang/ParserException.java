/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class ParserException
    extends Exception {

  private Token token;

  public ParserException(Token token) {
    this.token = token;
  }

  public Token getToken() {
    return this.token;
  }

  public String getMessage() {
    return "unexpected token '" + this.token.getText() + "' on line " + this.token.getLine() + ", pos " + this.token.getPos();
  }
}
