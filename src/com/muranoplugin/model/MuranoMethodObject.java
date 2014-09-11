package com.muranoplugin.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gokrokve on 9/10/14.
 */
public class MuranoMethodObject {
    private  Set<String> variables = new HashSet<String>();

    public MuranoMethodObject() {
        variables.add("$this");
    }

    public void setVariables(Set<String> variables) {
        this.variables = variables;
    }

    public void addVariable(String var){
        this.variables.add(var);
    }

    public Boolean hasVariable(String var){
        return this.variables.contains(var);
    }


}
