package visitor;

import generated.JavaParser;
import generated.JavaParserBaseVisitor;
import model.field.Field;
import org.antlr.v4.runtime.misc.NotNull;

public class FieldVisitor extends JavaParserBaseVisitor<Field> {

    @Override
    public Field visitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx) {
        Field field = new Field();
        field.setAccessModifier(ctx.modifier().getText());
        field.setConst(ctx.constant() != null ? true : false);
        field.setReturnType(ctx.variableDeclarator().type().getText());
        field.setName(ctx.variableDeclarator().variableName().getText());
        field.setVariableValue(ctx.variableDeclarator().variableInitializer().expression().getText());
        field.setConst(ctx.constant() != null);
        return field;
    }

}