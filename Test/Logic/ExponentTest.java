package Logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentTest {

    Operator testExponent = new Exponent();

    @Test
    void exponentTest(){
        double d1 = 2;
        double d2 = 8;
        assert(testExponent.calculate(d1,d2)==256);
        assert(testExponent.calculate(d2,d1)==64);
        assert(testExponent.calculate(d1,d2)!=1025);
        assert(testExponent.calculate(d2,d1)!=2);
    }
}