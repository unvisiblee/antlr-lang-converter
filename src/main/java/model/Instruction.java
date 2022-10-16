package model;

import java.util.List;

public class Instruction {

    private List<Variable> variables;

    private List<Statement> statements;

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "variables=" + variables +
                ", statements=" + statements +
                '}';
    }
}