/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

class S_48
    extends FinalState {

  static final S_48 instance = new S_48();

  private S_48() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(1);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$6(text, line, pos);
  }
}
