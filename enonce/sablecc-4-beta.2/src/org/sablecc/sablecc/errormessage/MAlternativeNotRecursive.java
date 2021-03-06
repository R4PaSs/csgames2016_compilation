/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.errormessage;

public class MAlternativeNotRecursive {

    private final String pName;

    private final String pLine;

    private final String pChar;

    private final MAlternativeNotRecursive mAlternativeNotRecursive = this;

    public MAlternativeNotRecursive(
            String pName,
            String pLine,
            String pChar) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
        if (pLine == null) {
            throw new NullPointerException();
        }
        this.pLine = pLine;
        if (pChar == null) {
            throw new NullPointerException();
        }
        this.pChar = pChar;
    }

    String pName() {

        return this.pName;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    private String rLine() {

        return this.mAlternativeNotRecursive.pLine();
    }

    private String rChar() {

        return this.mAlternativeNotRecursive.pChar();
    }

    private String rName() {

        return this.mAlternativeNotRecursive.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MSemanticErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("Line: ");
        sb.append(rLine());
        sb.append(System.getProperty("line.separator"));
        sb.append("Char: ");
        sb.append(rChar());
        sb.append(System.getProperty("line.separator"));
        sb.append("The \"");
        sb.append(rName());
        sb.append("\" alternative is not left or right recursive.");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
