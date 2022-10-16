package model.field;

import model.CustomClassMember;
import model.variable.VariableValue;

public class Field implements CustomClassMember {
    private String name;

    private boolean isStatic;
    private boolean isConst;
    private String accessModifier;
    private String returnType;

    private VariableValue variableValue;

    public Field() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public boolean isConst() {
        return isConst;
    }

    public void setConst(boolean aConst) {
        isConst = aConst;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public VariableValue getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(VariableValue variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    public String ConvertToC() {
        return null;
    }
}