/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.syntax3.analysis;

import java.util.*;
import org.sablecc.objectmacro.syntax3.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseASourceFile(ASourceFile node)
    {
        defaultCase(node);
    }

    public void caseAMacroSourceFilePart(AMacroSourceFilePart node)
    {
        defaultCase(node);
    }

    public void caseATextBlockSourceFilePart(ATextBlockSourceFilePart node)
    {
        defaultCase(node);
    }

    public void caseAMacro(AMacro node)
    {
        defaultCase(node);
    }

    public void caseATextMacroBodyPart(ATextMacroBodyPart node)
    {
        defaultCase(node);
    }

    public void caseAEolMacroBodyPart(AEolMacroBodyPart node)
    {
        defaultCase(node);
    }

    public void caseAEscapeMacroBodyPart(AEscapeMacroBodyPart node)
    {
        defaultCase(node);
    }

    public void caseAVarMacroBodyPart(AVarMacroBodyPart node)
    {
        defaultCase(node);
    }

    public void caseAExpandMacroBodyPart(AExpandMacroBodyPart node)
    {
        defaultCase(node);
    }

    public void caseAMacroMacroBodyPart(AMacroMacroBodyPart node)
    {
        defaultCase(node);
    }

    public void caseATextInsertMacroBodyPart(ATextInsertMacroBodyPart node)
    {
        defaultCase(node);
    }

    public void caseATextBlockMacroBodyPart(ATextBlockMacroBodyPart node)
    {
        defaultCase(node);
    }

    public void caseATextBlock(ATextBlock node)
    {
        defaultCase(node);
    }

    public void caseATextTextBlockBodyPart(ATextTextBlockBodyPart node)
    {
        defaultCase(node);
    }

    public void caseAEolTextBlockBodyPart(AEolTextBlockBodyPart node)
    {
        defaultCase(node);
    }

    public void caseAEscapeTextBlockBodyPart(AEscapeTextBlockBodyPart node)
    {
        defaultCase(node);
    }

    public void caseAVarTextBlockBodyPart(AVarTextBlockBodyPart node)
    {
        defaultCase(node);
    }

    public void caseATextInsertTextBlockBodyPart(ATextInsertTextBlockBodyPart node)
    {
        defaultCase(node);
    }

    public void caseATextBlockTextBlockBodyPart(ATextBlockTextBlockBodyPart node)
    {
        defaultCase(node);
    }

    public void caseAParam(AParam node)
    {
        defaultCase(node);
    }

    public void caseAExpand(AExpand node)
    {
        defaultCase(node);
    }

    public void caseAOption(AOption node)
    {
        defaultCase(node);
    }

    public void caseATextInsertStaticValue(ATextInsertStaticValue node)
    {
        defaultCase(node);
    }

    public void caseAVarStaticValue(AVarStaticValue node)
    {
        defaultCase(node);
    }

    public void caseAStringStaticValue(AStringStaticValue node)
    {
        defaultCase(node);
    }

    public void caseAString(AString node)
    {
        defaultCase(node);
    }

    public void caseATextStringPart(ATextStringPart node)
    {
        defaultCase(node);
    }

    public void caseAEscapeStringPart(AEscapeStringPart node)
    {
        defaultCase(node);
    }

    public void caseAMacroReference(AMacroReference node)
    {
        defaultCase(node);
    }

    public void caseATextInsert(ATextInsert node)
    {
        defaultCase(node);
    }

    public void caseTMacroCommand(TMacroCommand node)
    {
        defaultCase(node);
    }

    public void caseTTextBlockCommand(TTextBlockCommand node)
    {
        defaultCase(node);
    }

    public void caseTExpandCommand(TExpandCommand node)
    {
        defaultCase(node);
    }

    public void caseTInsertCommand(TInsertCommand node)
    {
        defaultCase(node);
    }

    public void caseTEndCommand(TEndCommand node)
    {
        defaultCase(node);
    }

    public void caseTShortCommentCommand(TShortCommentCommand node)
    {
        defaultCase(node);
    }

    public void caseTCommandTail(TCommandTail node)
    {
        defaultCase(node);
    }

    public void caseTLongCommentStart(TLongCommentStart node)
    {
        defaultCase(node);
    }

    public void caseTLongCommentEnd(TLongCommentEnd node)
    {
        defaultCase(node);
    }

    public void caseTNoEol(TNoEol node)
    {
        defaultCase(node);
    }

    public void caseTInvalidMidLineNoEol(TInvalidMidLineNoEol node)
    {
        defaultCase(node);
    }

    public void caseTInvalidCommand(TInvalidCommand node)
    {
        defaultCase(node);
    }

    public void caseTShortCommentText(TShortCommentText node)
    {
        defaultCase(node);
    }

    public void caseTLongCommentText(TLongCommentText node)
    {
        defaultCase(node);
    }

    public void caseTText(TText node)
    {
        defaultCase(node);
    }

    public void caseTEol(TEol node)
    {
        defaultCase(node);
    }

    public void caseTEscape(TEscape node)
    {
        defaultCase(node);
    }

    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    public void caseTInvalidVar(TInvalidVar node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTInvalidIdentifier(TInvalidIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTDquote(TDquote node)
    {
        defaultCase(node);
    }

    public void caseTStringText(TStringText node)
    {
        defaultCase(node);
    }

    public void caseTStringEscape(TStringEscape node)
    {
        defaultCase(node);
    }

    public void caseTCtrlZ(TCtrlZ node)
    {
        defaultCase(node);
    }

    public void caseTInvalidCharacter(TInvalidCharacter node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}