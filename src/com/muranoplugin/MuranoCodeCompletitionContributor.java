package com.muranoplugin;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.completion.impl.LiftShorterItemsClassifier;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.lang.ASTNode;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.FileElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.util.ProcessingContext;
import com.muranoplugin.model.MuranoClassObject;
import com.muranoplugin.model.MuranoMethodObject;
import com.muranoplugin.model.MuranoObjects;
import com.muranoplugin.psi.MuranoTypes;
import com.muranoplugin.psi.impl.MuranoHelper;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Created by gokrokve on 9/10/14.
 */
public class MuranoCodeCompletitionContributor extends CompletionContributor {
    public MuranoCodeCompletitionContributor(){
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(MuranoTypes.ID).withLanguage(MuranoLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        PsiElement element = parameters.getPosition();
                        ASTNode node = element.getNode();
                        ASTNode parent = node.getTreeParent();
                        if (parent == null) return;

                        if (parent.getElementType() == MuranoTypes.VARIABLE){
                            provideVariableCompletition(resultSet, node);
                            return;
                        }
                        if (parent.getElementType() == MuranoTypes.THIS_PROPERTY){
                            provideParametersCompletition(resultSet, node);
                            return;
                        }

                        if (parent.getTreeParent() == null){
                            resultSet.addElement(LookupElementBuilder.create("Namespaces:"));
                            resultSet.addElement(LookupElementBuilder.create("Name:"));
                            resultSet.addElement(LookupElementBuilder.create("Extends:"));
                            resultSet.addElement(LookupElementBuilder.create("Properties:"));
                            resultSet.addElement(LookupElementBuilder.create("Methods:"));
                            return;
                        }


                    }
                }
        );
    }

    private void provideParametersCompletition(CompletionResultSet resultSet, ASTNode node) {
        String cur_class = MuranoHelper.findCurrentClass(node);
        String cur_method = MuranoHelper.findCurrentMethod(node);
        if ((cur_class == null) || (cur_method == null)) return;
        MuranoObjects store = MuranoObjects.getStore();
        MuranoClassObject cls = store.getClass(cur_class);
        if (cls != null){
            for (String token : cls.getProperties()){
                resultSet.addElement(LookupElementBuilder.create(token));
            }

            for (Map.Entry<String, MuranoMethodObject> entry : cls.getMethods().entrySet()){
                resultSet.addElement(LookupElementBuilder.create(entry.getKey()+"()"));

            }

        }
    }

    private void provideVariableCompletition(CompletionResultSet resultSet, ASTNode node) {
        String cur_class = MuranoHelper.findCurrentClass(node);
        String cur_method = MuranoHelper.findCurrentMethod(node);
        if ((cur_class == null) || (cur_method == null)) return;
        MuranoObjects store = MuranoObjects.getStore();
        MuranoMethodObject meth = store.getClass(cur_class).getMethod(cur_method);
        if (meth != null){
            for (String token : meth.getVariables()){
                resultSet.addElement(LookupElementBuilder.create(token.substring(1)));
            }

        }
    }
}
