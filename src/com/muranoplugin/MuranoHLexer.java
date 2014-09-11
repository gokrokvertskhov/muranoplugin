package com.muranoplugin;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by gokrokve on 9/9/14.
 */
public class MuranoHLexer extends FlexAdapter {
    public MuranoHLexer() {
        super(new _MuranoHLexer());
    }
}
