import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(7, calculator.add(2, 5));
    }

    @Test
    public void subtract(){
        assertEquals(6, calculator.subtract(8, 2));
    }

    @Test
    public void multiply(){
        assertEquals(16, calculator.multiply(8, 2));
    }

    @Test
    public void divide(){
        assertEquals(10, calculator.divide(100, 10));
    }
}
