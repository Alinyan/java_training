import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Alina.Zaytseva
 * Date: 28-May-20
 */
public class CalculatorTests {

    Calculator calc;
    double x;
    double y;

    @BeforeEach
    public void setUp(){
        calc = mock(Calculator.class);
        x = anyDouble();
        y = anyDouble();
    }

    @Test
    public void addTest(){
        when(calc.add(x, y)).thenReturn(x + y);
        double actualResult = calc.add(x, y);

        double expectedResult = x + y;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtractTest(){
        when(calc.subtract(x, y)).thenReturn(x - y);
        double actualResult = calc.subtract(x, y);

        double expectedResult = x - y;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void divideTest(){
        when(calc.divide(x, y)).thenReturn(x / y);
        double actualResult = calc.divide(x, y);

        double expectedResult = x / y;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplyTest(){
        when(calc.multiply(x, y)).thenReturn(x * y);
        double actualResult = calc.multiply(x, y);

        double expectedResult = x * y;
        assertEquals(actualResult, expectedResult);
    }
}
