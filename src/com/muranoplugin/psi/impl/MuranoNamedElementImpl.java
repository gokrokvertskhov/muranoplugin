package com.muranoplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.muranoplugin.psi.MuranoNamedElement;
import org.jetbrains.annotations.NotNull;

/**
 * Created by gokrokve on 9/10/14.
 */
public abstract class MuranoNamedElementImpl extends ASTWrapperPsiElement implements MuranoNamedElement{

    public MuranoNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
