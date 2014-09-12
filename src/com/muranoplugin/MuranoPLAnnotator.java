package com.muranoplugin;

/**
 * Created by gokrokve on 9/10/14.
 */

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.muranoplugin.psi.*;
import com.muranoplugin.psi.impl.MuranoHelper;
import org.jetbrains.annotations.NotNull;
import com.muranoplugin.model.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MuranoPLAnnotator implements Annotator {


    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder){

        if (element instanceof MuranoVariable) {
            validateVariable(element, holder);
            return;
        }
        if (element instanceof MuranoThisProperty){
            validatePropertyOrMethod(element, holder);

        }

    }

    private void validatePropertyOrMethod(PsiElement element, AnnotationHolder holder) {
        ASTNode ast_node = element.getNode();

        TextRange range = element.getTextRange();
        MuranoObjects store = MuranoObjects.getStore();
        String cur_class = MuranoHelper.findCurrentClass(ast_node);
        if (cur_class == null) return;
        MuranoClassObject c_class= store.getClass(cur_class);

        String property = ast_node.getText();
        Pattern prop_name = Pattern.compile("\\$\\.(\\w*)(\\.\\w*)*");

        Matcher match_prop = prop_name.matcher(property);
        PsiElement nextElem = element.getNextSibling();

        if (match_prop.find()) {
            String propname = match_prop.group(1);
            String submethod = match_prop.group(2);

            if ((submethod == null)&&(nextElem != null) && ( nextElem.getNode().getElementType() == MuranoTypes.LPAREN_TOKEN)){
                // If this is actually method call

                if (!c_class.hasMethod(propname)){
                    Annotation annotation = holder.createInfoAnnotation(range, null);
                    annotation.setTextAttributes(SyntaxHighlighterColors.LINE_COMMENT);
                    holder.createErrorAnnotation(range, "Class " + cur_class
                            + " has no method: " + propname);
                }
            }else {
                if (!c_class.hasProperty(propname)) {
                    Annotation annotation = holder.createInfoAnnotation(range, null);
                    annotation.setTextAttributes(SyntaxHighlighterColors.LINE_COMMENT);
                    holder.createErrorAnnotation(range, "Class " + cur_class
                            + " has no property: " + propname);
                }
            }
        }
    }

    private void validateVariable(PsiElement element, AnnotationHolder holder) {
        ASTNode ast_node = element.getNode();

        TextRange range = element.getTextRange();
        MuranoObjects store = MuranoObjects.getStore();
        String cur_class = MuranoHelper.findCurrentClass(ast_node);
        String cur_meth = MuranoHelper.findCurrentMethod(ast_node);
        if ((cur_class == null) || (cur_meth == null)) return;

        MuranoClassObject c_class= store.getClass(cur_class);
        MuranoMethodObject meth = c_class.getMethod(cur_meth);

        if (meth == null) return;
        String variable = ast_node.getText();
        if (variable.indexOf(".") >0) {
            variable = variable.substring(0,variable.indexOf("."));
        }
        if (! meth.hasVariable(variable)) {
            Annotation annotation = holder.createInfoAnnotation(range, null);
            annotation.setTextAttributes(SyntaxHighlighterColors.LINE_COMMENT);
            holder.createErrorAnnotation(range, "Method: " + cur_meth +"\nVariable " + variable + " was never set.");
        }
    }
}
