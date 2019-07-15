package semav.chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class PowerTests {
    @Test
    public void shouldReturnPower1(){
        Power power = new Power(2);
        assertEquals(1024, power.get(10));
    }

    @Test
    public void shouldReturnPower2(){
        Power power = new Power(2);
        assertEquals(1024, power.get(10));
    }
}
