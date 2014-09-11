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

public class MuranoNamespaceItemImpl extends ASTWrapperPsiElement implements MuranoNamespaceItem {

  public MuranoNamespaceItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitNamespaceItem(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MuranoFqdn getFqdn() {
    return findNotNullChildByClass(MuranoFqdn.class);
  }

  @Override
  @Nullable
  public PsiElement getAssignToken() {
    return findChildByType(ASSIGN_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getDefaultnsToken() {
    return findChildByType(DEFAULTNS_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
