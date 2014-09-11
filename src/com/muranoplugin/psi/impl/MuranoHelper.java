package com.muranoplugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.Condition;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.muranoplugin.psi.MuranoClassStatement;
import com.muranoplugin.psi.MuranoMethodItem;
import com.muranoplugin.psi.MuranoTypes;
import groovyjarjarantlr.collections.AST;

/**
 * Created by gokrokve on 9/10/14.
 */
public class MuranoHelper {
    public static String findCurrentClass(ASTNode node) {
        ASTNode parentClass = (ASTNode) MuranoHelper.findParentOfType(node, new Condition<ASTNode>() {
            @Override
            public boolean value(ASTNode psiElement) {
                return (psiElement != null) && (psiElement.getElementType() == MuranoTypes.CLASS_STATEMENT);
            }
        });
        if (parentClass !=null ){
            ASTNode nameID = parentClass.findChildByType(MuranoTypes.FQDN);
            String name = nameID.getText();
            return name;
        }
        return null;
    }

    public static String findCurrentMethod(ASTNode node) {
        ASTNode parentClass = (ASTNode)MuranoHelper.findParentOfType(node, new Condition<ASTNode>() {
            @Override
            public boolean value(ASTNode psiElement) {
                return (psiElement != null) && (psiElement.getElementType() == MuranoTypes.METHOD_ITEM);
            }
        });
        if (parentClass !=null ){
            ASTNode nameID = parentClass.findChildByType(MuranoTypes.ID);
            String name = nameID.getText();
            return name;
        }
        return null;
    }

    public static ASTNode findParentOfType(ASTNode node, Condition cond){
        ASTNode parent = node.getTreeParent();

        while (parent != null){
            if (cond.value(parent)) return parent;
            parent = parent.getTreeParent();
        }
        return null;
    }
}
