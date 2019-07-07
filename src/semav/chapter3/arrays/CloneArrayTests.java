package semav.chapter3.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloneArrayTests {
    @Test
    public void shouldCloneArray(){
        int[][] array = CloneArray.clone(new int[][]{{1,1,1},{2,2,2},{3,3,3}});

        assertArrayEquals(new int[][] {{1,1,1}, {2,2,2}, {3,3,3}}, array);
    }
}
