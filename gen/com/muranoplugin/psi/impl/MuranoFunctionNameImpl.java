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

public class MuranoFunctionNameImpl extends ASTWrapperPsiElement implements MuranoFunctionName {

  public MuranoFunctionNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitFunctionName(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getFnDictToken() {
    return findChildByType(FN_DICT_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getFnFormatToken() {
    return findChildByType(FN_FORMAT_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getFnJoinToken() {
    return findChildByType(FN_JOIN_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getFnNewToken() {
    return findChildByType(FN_NEW_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
