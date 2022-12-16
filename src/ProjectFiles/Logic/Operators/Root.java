package ProjectFiles.Logic.Operators;

public class Root implements Operator {
    @Override
    public double calculate(double d1, double d2) {
        return Math.sqrt(d1);
    }
}