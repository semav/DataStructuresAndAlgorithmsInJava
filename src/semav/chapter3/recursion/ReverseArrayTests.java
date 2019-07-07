package semav.chapter3.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseArrayTests {
    @Test
    public void shouldReverseArray(){
        int[] array = {1,2,3,4,5,6,7,8};

        ReverseArray.recursionReverse(array, 0, array.length - 1);

        assertArrayEquals(new int[]{8,7,6,5,4,3,2,1}, array);
    }

    @Test
    public void shouldReverseArrayIterative(){
        int[] array = {1,2,3,4,5,6,7,8};

        ReverseArray.iterativeReversion(array);

        assertArrayEquals(new int[]{8,7,6,5,4,3,2,1}, array);
    }
}
