package com.muranoplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.muranoplugin.model.MuranoClassObject;
import com.muranoplugin.model.MuranoMethodObject;
import com.muranoplugin.model.MuranoObjects;
import com.muranoplugin.psi.MuranoTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by gokrokve on 9/10/14.
 */
public class MuranoPropertyMixin extends ASTWrapperPsiElement {
    public MuranoPropertyMixin(@NotNull ASTNode node) {
        super(node);
        ASTNode keyNode = node.findChildByType(MuranoTypes.ID);

        String cur_class = MuranoHelper.findCurrentClass(node);
        if (cur_class == null) return;

        String cur_meth = MuranoHelper.findCurrentMethod(node); //If there is a method then we parse args
        MuranoObjects store = MuranoObjects.getStore();
        MuranoClassObject c_class = store.getClass(cur_class);
        if (c_class == null) return;

        if (cur_meth == null) {
            c_class.addProperty(keyNode.getText());
        }else{
            MuranoMethodObject c_meth = c_class.getMethod(cur_meth);
            if (c_meth != null) c_meth.addVariable("$" + keyNode.getText());
        }
    }
}
