/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

class S_32
    extends FinalState {

  static final S_32 instance = new S_32();

  private S_32() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(1);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$18(text, line, pos);
  }
}
