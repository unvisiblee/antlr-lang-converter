package model.method;

import model.ILanguageConvertable;

public class Parameter implements ILanguageConvertable {
    private String name;
    private String type;

    public Parameter() {
    }

    public Parameter(String type, String name) {
        this.type = type;
        this.name = name;
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

    @Override
    public String ConvertToC() {
        return null;
    }
}