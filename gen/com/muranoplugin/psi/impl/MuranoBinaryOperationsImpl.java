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

public class MuranoBinaryOperationsImpl extends ASTWrapperPsiElement implements MuranoBinaryOperations {

  public MuranoBinaryOperationsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitBinaryOperations(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getOpAnd() {
    return findChildByType(OP_AND);
  }

  @Override
  @Nullable
  public PsiElement getOpDiv() {
    return findChildByType(OP_DIV);
  }

  @Override
  @Nullable
  public PsiElement getOpEq() {
    return findChildByType(OP_EQ);
  }

  @Override
  @Nullable
  public PsiElement getOpGe() {
    return findChildByType(OP_GE);
  }

  @Override
  @Nullable
  public PsiElement getOpGr() {
    return findChildByType(OP_GR);
  }

  @Override
  @Nullable
  public PsiElement getOpLe() {
    return findChildByType(OP_LE);
  }

  @Override
  @Nullable
  public PsiElement getOpLs() {
    return findChildByType(OP_LS);
  }

  @Override
  @Nullable
  public PsiElement getOpMinus() {
    return findChildByType(OP_MINUS);
  }

  @Override
  @Nullable
  public PsiElement getOpMult() {
    return findChildByType(OP_MULT);
  }

  @Override
  @Nullable
  public PsiElement getOpNe() {
    return findChildByType(OP_NE);
  }

  @Override
  @Nullable
  public PsiElement getOpOr() {
    return findChildByType(OP_OR);
  }

  @Override
  @Nullable
  public PsiElement getOpPlus() {
    return findChildByType(OP_PLUS);
  }

}
