package compiler.syntax.models.widget.attribute;

import compiler.syntax.models.expression.Expression;

public class Height extends WidgetAttribute {
    private final Expression expression;

    public Height(Expression expression, int lineNumber) {
        super(lineNumber);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
