/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

abstract class State {

  enum StateType {
    TRANSITION,
    FINAL;
  }

  abstract StateType getStateType();
}
