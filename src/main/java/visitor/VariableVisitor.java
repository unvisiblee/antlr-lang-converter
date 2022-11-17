package visitor;

import generated.JavaParser;
import generated.JavaParserBaseVisitor;
import model.variable.Variable;
import org.antlr.v4.runtime.misc.NotNull;

public class VariableVisitor extends JavaParserBaseVisitor<Variable> {

    @Override
    public Variable visitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx) {
        Variable variable = new Variable();
        variable.setType(ctx.type().getText());
        variable.setName(ctx.variableName().getText());
        variable.setValue(ctx.variableInitializer().expression().getText());
        return variable;
    }

}