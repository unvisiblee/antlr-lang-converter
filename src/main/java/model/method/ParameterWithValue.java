package model.method;

import model.variable.VariableValue;

public class ParameterWithValue extends Parameter{
    private VariableValue value;

    public ParameterWithValue(){

    }

    public ParameterWithValue(String type, String name, VariableValue value) {
        super(type, name);
        this.value = value;
    }

    public VariableValue getValue() {
        return value;
    }

    public void setValue(VariableValue value) {
        this.value = value;
    }

    @Override
    public String ConvertToC() {
        return null;
    }
}
