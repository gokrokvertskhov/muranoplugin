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
public class MuranoAssignMixin extends ASTWrapperPsiElement {
    public MuranoAssignMixin(@NotNull ASTNode node) {
        super(node);
        ASTNode keyNode = node.findChildByType(MuranoTypes.LVALUE);
        keyNode = keyNode.findChildByType(MuranoTypes.VARIABLE);
        if (keyNode != null) {
            String cur_class = MuranoHelper.findCurrentClass(node);
            String cur_method = MuranoHelper.findCurrentMethod(node);

            if ((cur_class != null) && (cur_method != null)) {
                MuranoObjects store = MuranoObjects.getStore();
                MuranoClassObject c_class = store.getClass(cur_class);
                if (c_class != null) {
                    MuranoMethodObject c_meth = c_class.getMethod(cur_method);
                    if (c_meth != null) {
                        c_meth.addVariable(keyNode.getText());
                    }
                }
            }
        }
    }
}
