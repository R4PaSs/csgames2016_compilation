/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MParamInsert {

    private final String pName;

    private final MParamInsert mParamInsert = this;

    private final MFile mFile;

    MParamInsert(
            String pName,
            MFile mFile) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
    }

    String pName() {

        return this.pName;
    }

    private String rFileName() {

        return this.mFile.pFileName();
    }

    private String rName() {

        return this.mParamInsert.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("M");
        sb.append(rFileName());
        sb.append("_r");
        sb.append(rName());
        sb.append("(m");
        sb.append(rFileName());
        sb.append(")");
        return sb.toString();
    }

}
