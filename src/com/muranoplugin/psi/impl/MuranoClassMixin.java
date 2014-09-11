package com.muranoplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.muranoplugin.model.*;
import com.muranoplugin.psi.MuranoTypes;

/**
 * Created by gokrokve on 9/10/14.
 */
public class MuranoClassMixin extends ASTWrapperPsiElement {
    public MuranoClassMixin(ASTNode node){
        super(node);
        MuranoObjects store = MuranoObjects.getStore();
        ASTNode keyNode = node.findChildByType(MuranoTypes.FQDN);
        if (keyNode !=null){
            store.addClass(keyNode.getText());
        }

    }
}
