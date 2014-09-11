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
import java.util.ArrayList;

public class MuranoMethodCallExpressionImpl extends MuranoExpressionImpl implements MuranoMethodCallExpression {

  public MuranoMethodCallExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitMethodCallExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoExprList getExprList() {
    return findChildByClass(MuranoExprList.class);
  }

  @Override
  @Nullable
  public MuranoFunctionName getFunctionName() {
    return findChildByClass(MuranoFunctionName.class);
  }

  @Override
  @Nullable
  public MuranoSubMethod getSubMethod() {
    return findChildByClass(MuranoSubMethod.class);
  }

  @Override
  @Nullable
  public MuranoThisProperty getThisProperty() {
    return findChildByClass(MuranoThisProperty.class);
  }

  @Override
  @Nullable
  public MuranoVariable getVariable() {
    return findChildByClass(MuranoVariable.class);
  }

  @Override
  @NotNull
  public PsiElement getLparenToken() {
    return findNotNullChildByType(LPAREN_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getRparenToken() {
    return findChildByType(RPAREN_TOKEN);
  }

  public Integer getArgsCount() {
    return MuranoPsiImplUtil.getArgsCount(this);
  }

  public ArrayList<String> getArgs() {
    return MuranoPsiImplUtil.getArgs(this);
  }

  public String getName() {
    return MuranoPsiImplUtil.getName(this);
  }

}
