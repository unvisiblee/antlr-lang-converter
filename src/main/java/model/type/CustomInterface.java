package model.type;

import model.ILanguageConvertable;
import model.CustomInterfaceMember;

import java.util.List;

public class CustomInterface implements ILanguageConvertable {
    private String name;
    private String inheritedFrom;

    private List<CustomInterfaceMember> interfaceMembers;

    public CustomInterface() {
    }

    public CustomInterface(String name, String inheritedFrom, List<CustomInterfaceMember> interfaceMembers) {
        this.name = name;
        this.inheritedFrom = inheritedFrom;
        this.interfaceMembers = interfaceMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInheritedFrom() {
        return inheritedFrom;
    }

    public void setInheritedFrom(String inheritedFrom) {
        this.inheritedFrom = inheritedFrom;
    }

    public List<CustomInterfaceMember> getInterfaceMembers() {
        return interfaceMembers;
    }

    public void setInterfaceMembers(List<CustomInterfaceMember> interfaceMembers) {
        this.interfaceMembers = interfaceMembers;
    }

    @Override
    public String ConvertToC() {
        return "";
    }
}
