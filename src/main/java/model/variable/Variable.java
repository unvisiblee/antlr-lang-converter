package model.variable;

import model.method.Instruction;

public class Variable implements Instruction {
    private String name;
    private String type;

    private VariableValue variableValue;

    public Variable() {
    }

    public Variable(String type, String name, VariableValue value) {
        this.type = type;
        this.name = name;
        this.variableValue = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VariableValue getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(VariableValue value) {
        this.variableValue = value;
    }

    @Override
    public String ConvertToC() {
        return null;
    }
}