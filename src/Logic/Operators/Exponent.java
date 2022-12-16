package Logic.Operators;

public class Exponent implements Operator {
    @Override
    public double calculate(double d1, double d2) {
        return Math.pow(d1, d2);
    }
}
