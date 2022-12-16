package Logic;

import Logic.Operators.*;

public class CalculatorFacade {
    private Operator addition;
    private Operator subtraction;
    private Operator multiplication;
    private Operator division;
    private Operator exponent;
    private Operator root;

    public CalculatorFacade(){

        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();
        exponent = new Exponent();
        root = new Root();

    }

    public double calculateAddition(double d1, double d2){
        return addition.calculate(d1,d2);
    }

    public double calculateSubtraction(double d1, double d2){
        return subtraction.calculate(d1,d2);
    }

    public double calculateMultiplication(double d1, double d2){
        return multiplication.calculate(d1,d2);
    }

    public double calculateDivision(double d1, double d2){
        return division.calculate(d1,d2);
    }

    public double calculateExponent(double d1, double d2){
        return exponent.calculate(d1,d2);
    }

    public double calculateRoot(double d1, double d2){
        return root.calculate(d1,d2);
    }
}
