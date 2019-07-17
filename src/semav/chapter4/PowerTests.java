package semav.chapter4;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class PowerTests {
    @Test
    public void shouldReturnPower(){
        Power power = new Power(2);
        assertEquals(1024, power.get(10));
    }

    @Test
    public void shouldReturnEvenPowerWithRecursion(){
        Power power = new Power(2);
        assertEquals(1024, power.getWithRecursion(10));
    }

    @Test
    public void shouldReturnOddPowerNumberWithRecursion(){
        Power power = new Power(2);
        assertEquals(2048, power.getWithRecursion(11));
    }
}
