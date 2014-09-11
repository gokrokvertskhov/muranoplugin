// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.muranoplugin.psi.MuranoTypes.*;
import com.muranoplugin.psi.*;

public class MuranoPropertyItemImpl extends MuranoPropertyMixin implements MuranoPropertyItem {

  public MuranoPropertyItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitPropertyItem(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MuranoPropertyItemElems getPropertyItemElems() {
    return findNotNullChildByClass(MuranoPropertyItemElems.class);
  }

  @Override
  @NotNull
  public PsiElement getAssignToken() {
    return findNotNullChildByType(ASSIGN_TOKEN);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

  public String getKey() {
    return MuranoPsiImplUtil.getKey(this);
  }

  public String getValue() {
    return MuranoPsiImplUtil.getValue(this);
  }

  public String getUsage() {
    return MuranoPsiImplUtil.getUsage(this);
  }

}
