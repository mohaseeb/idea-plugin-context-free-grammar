// This is a generated file. Not intended for manual editing.
package codes.rudolph.idea.cfg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CFGDelimitedRepetition extends PsiElement {

  @Nullable
  CFGDelimiter getDelimiter();

  @NotNull
  CFGExpression getExpression();

  @Nullable
  CFGMax getMax();

  @Nullable
  CFGMin getMin();

}