// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MuranoClassBody extends PsiElement {

  @Nullable
  MuranoCommentStatement getCommentStatement();

  @Nullable
  MuranoExtendsStatement getExtendsStatement();

  @Nullable
  MuranoPropertiesStatement getPropertiesStatement();

  @Nullable
  MuranoWorkflowsStatement getWorkflowsStatement();

}
