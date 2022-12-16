package Logic;

import Logic.Operators.*;
import org.junit.jupiter.api.Test;

public class OperatorTests {
    Operator testAddition = new Addition();
    Operator testSubtraction = new Subtraction();
    Operator testMultiplication = new Multiplication();
    Operator testDivision = new Division();
    Operator testExponent = new Exponent();
    Operator testRoot = new Root();
    double d1 = 2;
    double d2 = 8;

    @Test
    void additionTest(){

        assert(testAddition.calculate(d1,d2)==10);
        assert(testExponent.calculate(d1,d2)!=20);
    }

    @Test
    void subtractionTest(){

        assert(testSubtraction.calculate(d1,d2)==-6);
        assert(testSubtraction.calculate(d2,d1)==6);
        assert(testSubtraction.calculate(d1,d2)!=10);
        assert(testSubtraction.calculate(d2,d1)!=27876234);

    }

    @Test
    void multiplicationTest(){

        assert(testMultiplication.calculate(d1,d2)==16);
        assert(testMultiplication.calculate(d2,d1)==16);
        assert(testMultiplication.calculate(d1,d2)!=47);
        assert(testMultiplication.calculate(d2,d1)!=129387129);

    }

    @Test
    void divisionTest(){

        assert(testDivision.calculate(d1,d2)==0.25);
        assert(testDivision.calculate(d2,d1)==4);
        assert(testDivision.calculate(d1,d2)!=12983712);
        assert(testDivision.calculate(d2,d1)!=1209380129);

    }

    @Test
    void exponentTest(){

        assert(testExponent.calculate(d1,d2)==256);
        assert(testExponent.calculate(d2,d1)==64);
        assert(testExponent.calculate(d1,d2)!=1025);
        assert(testExponent.calculate(d2,d1)!=2);

    }

    @Test
    void rootTest(){

        assert(testRoot.calculate(d1,d2)==1.4142135623730951);
        assert(testRoot.calculate(d2,d1)==2.8284271247461903);
        assert(testRoot.calculate(d1,d2)!=13);
        assert(testRoot.calculate(d2,d1)!=1293812739);

    }
}