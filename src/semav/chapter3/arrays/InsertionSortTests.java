package semav.chapter3.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTests {
    @Test
    public void shouldSortArray1(){
        int[] array = {1,4,3,2,5,1,7,3};
        InsertionSort.sort(array);

        assertArrayEquals(new int[] {1,1,2,3,3,4,5,7}, array);
    }

    @Test
    public void shouldSortArray2(){
        int[] array = {1};

        InsertionSort.sort(array);

        assertArrayEquals(new int[] {1}, array);
    }

    @Test
    public void shouldSortArray3(){
        int[] array = {6,5,4,3,2,1};

        InsertionSort.sort(array);

        assertArrayEquals(new int[] {1,2,3,4,5,6}, array);
    }

    @Test
    public void shouldSortArray4(){
        int[] array = {1,2,3,4};

        InsertionSort.sort(array);

        assertArrayEquals(new int[] {1,2,3,4}, array);
    }
}
