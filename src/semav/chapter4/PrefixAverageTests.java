package semav.chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public final class PrefixAverageTests {
    @Test
    public void shouldReturnPrefixAverage1(){
        PrefixAverage prefixAverage = new PrefixAverage(new int[] {1,3,2,10,9});

        assertArrayEquals(new int[] {1,2,2,4,5}, prefixAverage.prefixAveragesQuadratic());
    }

    @Test
    public void shouldReturnPrefixAverage2(){
        PrefixAverage prefixAverage = new PrefixAverage(new int[] {1,3,2,10,9});

        assertArrayEquals(new int[] {1,2,2,4,5}, prefixAverage.prefixAveragesLinear());
    }
}
