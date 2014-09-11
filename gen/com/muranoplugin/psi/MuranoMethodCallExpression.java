// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.muranoplugin.psi.impl.MuranoMethodCallExpressionImpl;
import com.muranoplugin.psi.impl.MuranoVariableImpl;
import java.util.ArrayList;

public interface MuranoMethodCallExpression extends MuranoExpression {

  @Nullable
  MuranoExprList getExprList();

  @Nullable
  MuranoFunctionName getFunctionName();

  @Nullable
  MuranoSubMethod getSubMethod();

  @Nullable
  MuranoThisProperty getThisProperty();

  @Nullable
  MuranoVariable getVariable();

  @NotNull
  PsiElement getLparenToken();

  @Nullable
  PsiElement getRparenToken();

  Integer getArgsCount();

  ArrayList<String> getArgs();

  String getName();

}
