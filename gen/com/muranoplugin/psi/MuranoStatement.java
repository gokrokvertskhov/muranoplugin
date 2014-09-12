// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.muranoplugin.psi.impl.MuranoStatementImpl;

public interface MuranoStatement extends PsiElement {

  @Nullable
  MuranoAssignmentStatement getAssignmentStatement();

  @Nullable
  MuranoCommentStatement getCommentStatement();

  @Nullable
  MuranoConditionalStatement getConditionalStatement();

  @Nullable
  MuranoExpression getExpression();

  @Nullable
  MuranoForStatement getForStatement();

  @Nullable
  PsiElement getIndent();

  @Nullable
  PsiElement getNewline();

  void setIndent();

  Boolean checkIndent();

}
