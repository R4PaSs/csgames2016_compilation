/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

class S_44
    extends FinalState {

  static final S_44 instance = new S_44();

  private S_44() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(0);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$16(text, line, pos);
  }
}
