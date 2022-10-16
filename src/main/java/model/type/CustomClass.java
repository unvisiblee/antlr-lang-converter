package model.type;

import model.ILanguageConvertable;
import model.field.Field;
import model.method.Method;

import java.util.List;

public class CustomClass implements ILanguageConvertable {
    private String name;

    private List<Method> methods;
    private List<Field> fields;

    private List<String> implementsInterfaces;
    private List<String> extendsClasses;

    private String accessModifier;

    private boolean isAbstract;
    private boolean isInheritable;
    private boolean isStatic;

    public CustomClass(){

    }

    public CustomClass(String name, List<Method> methods, List<Field> fields) {
        this.name = name;
        this.methods = methods;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<String> getImplementsInterfaces() {
        return implementsInterfaces;
    }

    public void setImplementsInterfaces(List<String> implementsInterfaces) {
        this.implementsInterfaces = implementsInterfaces;
    }

    public List<String> getExtendsClasses() {
        return extendsClasses;
    }

    public void setExtendsClasses(List<String> extendsClasses) {
        this.extendsClasses = extendsClasses;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public boolean isInheritable() {
        return isInheritable;
    }

    public void setInheritable(boolean inheritable) {
        isInheritable = inheritable;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    @Override
    public String toString() {
        return "CustomClass{" +
                "name='" + name + '\'' +
                ", methods=" + methods +
                ", fields=" + fields +
                '}';
    }

    @Override
    public String ConvertToC() {
        return null;
    }
}