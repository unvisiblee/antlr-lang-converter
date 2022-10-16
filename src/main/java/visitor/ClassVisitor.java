package visitor;

import generated.JavaParser;
import generated.JavaParserBaseVisitor;
import model.type.CustomClass;

public class ClassVisitor extends JavaParserBaseVisitor<CustomClass> {
    private CustomClass customClass;

    @Override
    public CustomClass visitClassDeclaration(JavaParser.ClassDeclarationContext ctx){
        String className = ctx.IDENTIFIER().getText();

        return null;
    }

    public CustomClass getCustomClass() {
        return customClass;
    }
}
