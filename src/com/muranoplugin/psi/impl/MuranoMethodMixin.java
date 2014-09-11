package com.muranoplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.muranoplugin.model.*;
import com.muranoplugin.psi.MuranoTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by gokrokve on 9/10/14.
 */
public class MuranoMethodMixin extends ASTWrapperPsiElement {
    public MuranoMethodMixin(@NotNull ASTNode node) {
        super(node);

        MuranoObjects store = MuranoObjects.getStore();

        String class_name = MuranoHelper.findCurrentClass(node);
        if (class_name !=null){
            MuranoClassObject cur_class = store.getClass(class_name);
            ASTNode keyNode = node.findChildByType(MuranoTypes.ID);
            cur_class.addMethod(keyNode.getText());
        }
    }
}
