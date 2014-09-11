package com.muranoplugin.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.muranoplugin.psi.*;
import com.muranoplugin.psi.impl.*;

import java.util.ArrayList;

/**
 * Created by gokrokve on 9/10/14.
 */
public class MuranoPsiImplUtil {
    private static MuranoStatementImpl indent;


//    public static String getKey(SimpleProperty element) {
//        ASTNode keyNode = element.getNode().findChildByType(SimpleTypes.KEY);
//        if (keyNode != null) {
//            return keyNode.getText();
//        } else {
//            return null;
//        }
//    }
//
//    public static String getValue(SimpleProperty element) {
//        ASTNode valueNode = element.getNode().findChildByType(SimpleTypes.VALUE);
//        if (valueNode != null) {
//            return valueNode.getText();
//        } else {
//            return null;
//        }
//    }

    public static String getName(MuranoVariableImpl muranoVariable) {
        return muranoVariable.getText();
    }

    public static String getName(MuranoMethodCallExpressionImpl muranoMethodCallExpression) {

        return muranoMethodCallExpression.getText();
    }

    public static Integer getArgsCount(MuranoMethodCallExpressionImpl muranoMethodCallExpression) {
        //TODO Implement this
        return 0;
    }

    public static ArrayList<String> getArgs(MuranoMethodCallExpressionImpl muranoMethodCallExpression) {
        return new ArrayList<String>();
    }

    public static String getUsage(MuranoPropertyItemImpl muranoPropertyItem) {
        //TODO implement
        return "In";
    }

    public static void setIndent(MuranoStatementImpl indent) {
        MuranoPsiImplUtil.indent = indent;
    }

    public static MuranoStatementImpl getIndent() {
        return indent;
    }

    public static Boolean checkIndent(MuranoStatementImpl muranoStatement) {

        return Boolean.TRUE;
    }

    public static String getName(MuranoThisPropertyImpl muranoThisProperty) {
        return muranoThisProperty.getText();
    }

    public static String getName(MuranoFqdnImpl muranoFqdn) {
        StringBuffer name = new StringBuffer(20);
        ASTNode valueNode = muranoFqdn.getNode().findChildByType(MuranoTypes.ID);

        if (valueNode == null)
             return null;

        while (valueNode !=null){
            name.append(valueNode.getText());
            valueNode = valueNode.getTreeNext();
        }
        return name.toString();

    }

    public static PsiElement setName(MuranoPropertyItem elem, String newName){
        return elem;
    }

    public static PsiElement getNameIdentifier(MuranoPropertyItem element) {
        return element;
    }

    public static String getName(MuranoPropertyItemImpl muranoPropertyItem) {
        return null;
    }

    public static String getValue(MuranoPropertyItemImpl muranoPropertyItem) {
        return null;
    }

    public static String getKey(MuranoPropertyItemImpl muranoPropertyItem) {
        return null;
    }
}