// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MuranoExpression extends PsiElement {

  @Nullable
  MuranoComposedObjectStatement getComposedObjectStatement();

  @Nullable
  MuranoMapEntryElement getMapEntryElement();

  @Nullable
  MuranoThisProperty getThisProperty();

  @Nullable
  MuranoVariable getVariable();

  @Nullable
  PsiElement getAssignToken();

  @Nullable
  PsiElement getNullToken();

}
