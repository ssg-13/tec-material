package expr.fps;

import expr.Expression;
import expr.ExpressionType;

public class FPAddExpression implements Expression {

    private double operandA, operandB;

    public FPAddExpression(double operandA, double operandB) {
        this.operandA = operandA;
        this.operandB = operandB;
    }

    @Override
    public ExpressionType getType() {
        return ExpressionType.FP;
    }

    @Override
    public int evaluateInt() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double evaluateFP() {
        return operandA + operandB;
    }
}
