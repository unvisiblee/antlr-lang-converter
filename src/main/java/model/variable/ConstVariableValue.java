package model.variable;

public class ConstVariableValue extends VariableValue {
    private String value;

    public ConstVariableValue() {

    }

    public ConstVariableValue(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String ConvertToC() {
        return value;
    }
}
