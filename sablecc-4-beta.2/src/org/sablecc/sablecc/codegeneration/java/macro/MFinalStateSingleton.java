/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

import java.util.*;

public class MFinalStateSingleton {

    private final String pNumber;

    private final String pBackCount;

    private final MFinalStateSingleton mFinalStateSingleton = this;

    private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();

    private final List<Object> eAcceptTokenNoMarker = new LinkedList<Object>();

    private final List<Object> eAcceptTokenWithMarker = new LinkedList<Object>();

    private final List<Object> eAcceptNormalToken = new LinkedList<Object>();

    private final List<Object> eAcceptIgnoredToken = new LinkedList<Object>();

    public MFinalStateSingleton(
            String pNumber,
            String pBackCount) {

        if (pNumber == null) {
            throw new NullPointerException();
        }
        this.pNumber = pNumber;
        if (pBackCount == null) {
            throw new NullPointerException();
        }
        this.pBackCount = pBackCount;
    }

    public MAcceptTokenNoMarker newAcceptTokenNoMarker() {

        MAcceptTokenNoMarker lAcceptTokenNoMarker = new MAcceptTokenNoMarker(
                this.mFinalStateSingleton);
        this.eAcceptTokenNoMarker.add(lAcceptTokenNoMarker);
        return lAcceptTokenNoMarker;
    }

    public MAcceptTokenWithMarker newAcceptTokenWithMarker(
            String pMarkerName) {

        MAcceptTokenWithMarker lAcceptTokenWithMarker = new MAcceptTokenWithMarker(
                pMarkerName, this.mFinalStateSingleton);
        this.eAcceptTokenWithMarker.add(lAcceptTokenWithMarker);
        return lAcceptTokenWithMarker;
    }

    public MAcceptNormalToken newAcceptNormalToken(
            String pTokenName) {

        MAcceptNormalToken lAcceptNormalToken = new MAcceptNormalToken(
                pTokenName);
        this.eAcceptNormalToken.add(lAcceptNormalToken);
        return lAcceptNormalToken;
    }

    public MAcceptIgnoredToken newAcceptIgnoredToken() {

        MAcceptIgnoredToken lAcceptIgnoredToken = new MAcceptIgnoredToken();
        this.eAcceptIgnoredToken.add(lAcceptIgnoredToken);
        return lAcceptIgnoredToken;
    }

    public MDefaultPackage newDefaultPackage(
            String pLanguageName) {

        MDefaultPackage lDefaultPackage = new MDefaultPackage(pLanguageName);
        this.eDefaultPackage_SpecifiedPackage.add(lDefaultPackage);
        return lDefaultPackage;
    }

    public MSpecifiedPackage newSpecifiedPackage(
            String pLanguageName,
            String pPackage) {

        MSpecifiedPackage lSpecifiedPackage = new MSpecifiedPackage(
                pLanguageName, pPackage);
        this.eDefaultPackage_SpecifiedPackage.add(lSpecifiedPackage);
        return lSpecifiedPackage;
    }

    String pNumber() {

        return this.pNumber;
    }

    String pBackCount() {

        return this.pBackCount;
    }

    private String rNumber() {

        return this.mFinalStateSingleton.pNumber();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        if (this.eDefaultPackage_SpecifiedPackage.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oDefaultPackage_SpecifiedPackage : this.eDefaultPackage_SpecifiedPackage) {
            sb.append(oDefaultPackage_SpecifiedPackage.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("class S_");
        sb.append(rNumber());
        sb.append(System.getProperty("line.separator"));
        sb.append("    extends FinalState {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  static final S_");
        sb.append(rNumber());
        sb.append(" instance = new S_");
        sb.append(rNumber());
        sb.append("();");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  private S_");
        sb.append(rNumber());
        sb.append("() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  Token getToken(Lexer lexer) {");
        sb.append(System.getProperty("line.separator"));
        for (Object oAcceptTokenNoMarker : this.eAcceptTokenNoMarker) {
            sb.append(oAcceptTokenNoMarker.toString());
        }
        for (Object oAcceptTokenWithMarker : this.eAcceptTokenWithMarker) {
            sb.append(oAcceptTokenWithMarker.toString());
        }
        sb.append("    int line = lexer.getAcceptLine();");
        sb.append(System.getProperty("line.separator"));
        sb.append("    int pos = lexer.getAcceptPos();");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oAcceptNormalToken : this.eAcceptNormalToken) {
            sb.append(oAcceptNormalToken.toString());
        }
        for (Object oAcceptIgnoredToken : this.eAcceptIgnoredToken) {
            sb.append(oAcceptIgnoredToken.toString());
        }
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
