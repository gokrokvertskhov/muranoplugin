// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.muranoplugin.psi.MuranoTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.muranoplugin.psi.*;

public class MuranoMethodItemsImpl extends ASTWrapperPsiElement implements MuranoMethodItems {

  public MuranoMethodItemsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitMethodItems(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoMethodItem getMethodItem() {
    return findChildByClass(MuranoMethodItem.class);
  }

  @Override
  @Nullable
  public MuranoMethodItems getMethodItems() {
    return findChildByClass(MuranoMethodItems.class);
  }

}
