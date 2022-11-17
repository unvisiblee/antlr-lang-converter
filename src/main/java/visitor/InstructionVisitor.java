package visitor;

import generated.JavaParser;
import generated.JavaParserBaseVisitor;
import model.expression.Statement;
import model.variable.Instruction;
import model.variable.Variable;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

public class InstructionVisitor extends JavaParserBaseVisitor<Instruction> {

    @Override
    public Instruction visitInstruction(@NotNull JavaParser.InstructionContext ctx) {
        Instruction instruction = new Instruction();

        JavaParser.VariableDeclaratorContext variableContext = ctx.variableDeclarator();
        JavaParser.StatementContext statementContext = ctx.statement();

        List<Variable> variables = new ArrayList<>();
        if (variableContext != null) {
            variables.add(variableContext.accept(new VariableVisitor()));
        }

        List<Statement> statements = new ArrayList<>();
        if (statementContext != null) {
            statements.add(statementContext.accept(new StatementVisitor()));
        }

        instruction.setVariables(variables);
        instruction.setStatements(statements);
        return instruction;
    }
}