/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

class S_34
    extends FinalState {

  static final S_34 instance = new S_34();

  private S_34() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(1);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$20(text, line, pos);
  }
}
