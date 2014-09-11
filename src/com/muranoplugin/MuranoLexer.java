package com.muranoplugin;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by gokrokve on 9/9/14.
 */
public class MuranoLexer extends FlexAdapter {
    public MuranoLexer() {
        super(new _MuranoLexer());
    }
}
