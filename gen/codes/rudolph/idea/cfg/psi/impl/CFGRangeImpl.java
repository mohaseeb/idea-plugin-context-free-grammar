// This is a generated file. Not intended for manual editing.
package codes.rudolph.idea.cfg.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static codes.rudolph.idea.cfg.psi.CFGTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import codes.rudolph.idea.cfg.psi.*;

public class CFGRangeImpl extends ASTWrapperPsiElement implements CFGRange {

  public CFGRangeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CFGVisitor visitor) {
    visitor.visitRange(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CFGVisitor) accept((CFGVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CFGRange getRange() {
    return findChildByClass(CFGRange.class);
  }

  @Override
  @Nullable
  public CFGUnary getUnary() {
    return findChildByClass(CFGUnary.class);
  }

}
