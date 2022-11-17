package model.method;

import model.CustomClassMember;
import model.CustomInterfaceMember;
import model.variable.Instruction;

import java.util.List;

public class Method implements CustomClassMember, CustomInterfaceMember {
    private String name;

    private String accessModifier;
    private String returnType;

    private List<Parameter> arguments;
    private List<Instruction> instructions;

    public Method(String name) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public List<Parameter> getArguments() {
        return arguments;
    }

    public void setArguments(List<Parameter> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String ConvertToC() {
        return null;
    }
}