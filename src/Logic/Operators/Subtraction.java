package Logic.Operators;

import Logic.Operators.Operator;

public class Subtraction implements Operator {
    @Override
    public double calculate(double d1, double d2) {
        return d1 - d2;
    }
}
