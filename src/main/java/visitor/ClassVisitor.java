package visitor;

import generated.JavaParser;
import generated.JavaParserBaseVisitor;
import model.field.Field;
import model.method.Method;
import model.type.CustomClass;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class ClassVisitor extends JavaParserBaseVisitor<CustomClass> {

    private CustomClass returnClass = null;

    @Override
    public CustomClass visitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx) {
        String className = ctx.className().getText();
        FieldVisitor fieldVisitor = new FieldVisitor();
        MethodVisitor methodVisitor = new MethodVisitor();

        List<Field> fields = ctx.classBodyDeclaration().member()
                .stream()
                .filter(object -> object.fieldDeclaration() != null)
                .map(field -> field.accept(fieldVisitor))
                .collect(Collectors.toList());

        List<Method> methods = ctx.classBodyDeclaration().member()
                .stream()
                .filter(object -> object.methodDeclaration() != null)
                .map(method -> method.accept(methodVisitor))
                .collect(Collectors.toList());

        returnClass = new CustomClass(className, methods, fields);
        return returnClass;
    }

    public CustomClass getReturnClass() {
        return returnClass;
    }
}