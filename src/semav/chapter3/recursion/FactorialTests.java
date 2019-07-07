package semav.chapter3.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTests {
    @Test
    public void shouldReturn1WhenN0(){
        int factorial = Factorial.recursionFactorial(0);
        assertEquals(1, factorial);
    }

    @Test
    public void shouldReturn3628800WhenN10(){
        int factorial = Factorial.recursionFactorial(10);
        assertEquals(3628800, factorial);
    }
}
