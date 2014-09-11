// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MuranoNonListStatememnt extends PsiElement {

  @Nullable
  MuranoExpression getExpression();

  @Nullable
  MuranoHeatAssignmentStatement getHeatAssignmentStatement();

  @Nullable
  MuranoHeatPropertyNameSatement getHeatPropertyNameSatement();

  @Nullable
  MuranoHeatSimpleStatement getHeatSimpleStatement();

  @Nullable
  MuranoHeatValueStatement getHeatValueStatement();

}
