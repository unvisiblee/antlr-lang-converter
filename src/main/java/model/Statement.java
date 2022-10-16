package model;

import java.util.Collections;
import java.util.List;

public class Statement {

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

}