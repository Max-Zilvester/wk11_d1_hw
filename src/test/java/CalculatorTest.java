import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

//    @Before
//    public void setUp(){
//        calculator = new Calculator(int num1, int num2);
//    }

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.sum(6, 2));
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.minus(6, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiply(6, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(6, 2), 0.01);
    }
}
