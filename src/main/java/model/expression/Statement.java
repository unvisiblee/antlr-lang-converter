package model.expression;

import model.variable.Instruction;

import java.util.Collections;
import java.util.List;

public class Statement implements Instruction {
    private String type;

    private Expression expression;

    private List<Statement> statements = Collections.emptyList();

    public Statement(Expression expression) {
        this.expression = expression;
    }

    public Statement(String type, Expression expression) {
        this.type = type;
        this.expression = expression;
    }

    public Statement(String type, Expression expression, List<Statement> statements) {
        this.type = type;
        this.expression = expression;
        this.statements = statements;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String ConvertToC() {
        return null;
    }
}