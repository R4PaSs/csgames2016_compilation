/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

class S_25
    extends FinalState {

  static final S_25 instance = new S_25();

  private S_25() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(0);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$17(text, line, pos);
  }
}
