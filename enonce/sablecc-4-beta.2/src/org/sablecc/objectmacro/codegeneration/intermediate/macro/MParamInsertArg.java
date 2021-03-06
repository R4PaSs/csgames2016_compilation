/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.intermediate.macro;

public class MParamInsertArg {

    private final String pName;

    private final String pIndent;

    private final MParamInsertArg mParamInsertArg = this;

    public MParamInsertArg(
            String pName,
            String pIndent) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
        if (pIndent == null) {
            throw new NullPointerException();
        }
        this.pIndent = pIndent;
    }

    String pName() {

        return this.pName;
    }

    String pIndent() {

        return this.pIndent;
    }

    private String rIndent() {

        return this.mParamInsertArg.pIndent();
    }

    private String rName() {

        return this.mParamInsertArg.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(rIndent());
        sb.append("    arg {");
        sb.append(System.getProperty("line.separator"));
        sb.append(rIndent());
        sb.append("      param_insert = ");
        sb.append(rName());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        sb.append(rIndent());
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
