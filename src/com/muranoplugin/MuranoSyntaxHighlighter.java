package com.muranoplugin;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.muranoplugin.lex.psi.MuranoTypes;
import org.jetbrains.annotations.NotNull;
/**
 * Created by gokrokve on 9/3/14.
 */

import java.awt.*;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class MuranoSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey ASSIGMENT = createTextAttributesKey("MURANO_ASSIGMENT", SyntaxHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("MURANO_KEYWORD", SyntaxHighlighterColors.KEYWORD);
    public static final TextAttributesKey KEY = createTextAttributesKey("MURANO_KEY", SyntaxHighlighterColors.NUMBER);
    public static final TextAttributesKey STRING = createTextAttributesKey("MURANO_STRING", SyntaxHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("MURANO_NUMBER", SyntaxHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("MURANO_COMMENT", SyntaxHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey VARIABLE = createTextAttributesKey("MURANO_VARIABLE",
            new TextAttributes(Color.MAGENTA, null, null, null, Font.BOLD));
    public static final TextAttributesKey PROPERTY = createTextAttributesKey("MURANO_PROPERTY",
            new TextAttributes(Color.CYAN, null, null, null, Font.BOLD));
    public static final TextAttributesKey FUNCTION = createTextAttributesKey("MURANO_FUNCTION",
            new TextAttributes(Color.BLACK, null, null, null, Font.BOLD));
    public static final TextAttributesKey ENUM = createTextAttributesKey("MURANO_ENUM",
            new TextAttributes(Color.YELLOW, null, null, null, Font.BOLD));
    public static final TextAttributesKey BUILTIN = createTextAttributesKey("MURANO_BUILTIN",
            new TextAttributes(Color.BLUE, null, null, null, Font.BOLD));
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("MURANO_OPERATOR",
            new TextAttributes(Color.GREEN, null, null, null, Font.BOLD));

    static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("MURANO_BAD_CHARACTER",
            new TextAttributes(Color.RED, null, null, null, Font.BOLD));

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] ASSIGMENT_KEYS = new TextAttributesKey[]{ASSIGMENT};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] VARIABLE_KEYS = new TextAttributesKey[]{VARIABLE};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] FUNCTION_KEYS = new TextAttributesKey[]{FUNCTION};
    private static final TextAttributesKey[] ENUM_KEYS = new TextAttributesKey[]{ENUM};
    private static final TextAttributesKey[] BUILTIN_KEYS = new TextAttributesKey[]{BUILTIN};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] PROPERTY_KEYS = new TextAttributesKey[]{PROPERTY};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private static final Map<IElementType, TextAttributesKey[] > HIGHLIGHT_CLASSES = new HashMap<IElementType, TextAttributesKey[]>();

    static {
        //Standard Keywords for MuranoPL
        HIGHLIGHT_CLASSES.put(MuranoTypes.NAME_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.NAMESPACE_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.NAMESPACE_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.PARAMETERS_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.ARGUMENTS_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.EXTENDS_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.PROPERTIES_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.BODY_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.USAGE_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.CONTRACT_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.METHODS_TOKEN, KEYWORD_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.WORKFLOW_TOKEN, KEYWORD_KEYS);

        //Some values of limited sets
        HIGHLIGHT_CLASSES.put(MuranoTypes.USAGE_IN_TOKEN, ENUM_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.USAGE_OUT_TOKEN, ENUM_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.USAGE_INOUT_TOKEN, ENUM_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.USAGE_RUNTIME_TOKEN, ENUM_KEYS);

        //Some code flows
        HIGHLIGHT_CLASSES.put(MuranoTypes.IF_TOKEN, ENUM_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.THEN_TOKEN, ENUM_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.ELSE_TOKEN, ENUM_KEYS);

        //Comments
        HIGHLIGHT_CLASSES.put(MuranoTypes.COMMENT_TOKEN, COMMENT_KEYS);

        //MuranoPL Boolean (true, false)
        HIGHLIGHT_CLASSES.put(MuranoTypes.MPL_BOOL_FALSE, ENUM_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.MPL_BOOL_TRUE, ENUM_KEYS);

        //String True, False
        HIGHLIGHT_CLASSES.put(MuranoTypes.BOOL_TOKEN_F, NUMBER_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.BOOL_TOKEN_T, NUMBER_KEYS);

        //NUMBERS
        HIGHLIGHT_CLASSES.put(MuranoTypes.NUMBER, NUMBER_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.NULL_TOKEN, NUMBER_KEYS);

        //STRINGS
        HIGHLIGHT_CLASSES.put(MuranoTypes.STRING, STRING_KEYS);



        //Variables and properties

        HIGHLIGHT_CLASSES.put(MuranoTypes.DOLLAR_TOKEN, VARIABLE_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.VARIABLE_TOKEN, VARIABLE_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.PROPERTY_TOKEN, PROPERTY_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.SUBITEM_TOKEN, PROPERTY_KEYS);




        //Built-in functions
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_DICT_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_FORMAT_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_NEW_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_CLASS_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_STRING_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_INT_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_COAL_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_SETATTR_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_BIND_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_GETATTR_TOKEN, BUILTIN_KEYS);
        HIGHLIGHT_CLASSES.put(MuranoTypes.FN_FIND_TOKEN, BUILTIN_KEYS);

        HIGHLIGHT_CLASSES.put(MuranoTypes.METHOD_CALL_TOKEN, KEY_KEYS);

        //Murano operators
        HIGHLIGHT_CLASSES.put(MuranoTypes.MAP_TOKEN, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_AND, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_OR, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_EQ, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_GE, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_GR, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_LE, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_LS, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_DIV, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_MULT, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_MINUS, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_PLUS, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_N, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_NE, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_NEG, OPERATOR_KEYS );
        HIGHLIGHT_CLASSES.put(MuranoTypes.OP_NOT, OPERATOR_KEYS );


    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new _MuranoHLexer((Reader) null));
    }


    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
       TextAttributesKey[] highlite =  HIGHLIGHT_CLASSES.get(tokenType);
       if (highlite == null) {
                return EMPTY_KEYS;
        }
        return  highlite;

    }
}
