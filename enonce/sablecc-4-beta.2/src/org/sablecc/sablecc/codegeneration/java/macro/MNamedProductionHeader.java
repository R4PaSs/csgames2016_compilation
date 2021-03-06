/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MNamedProductionHeader {

    private final MProduction mProduction;

    MNamedProductionHeader(
            MProduction mProduction) {

        if (mProduction == null) {
            throw new NullPointerException();
        }
        this.mProduction = mProduction;
    }

    private String rName() {

        return this.mProduction.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("public abstract class N");
        sb.append(rName());
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
