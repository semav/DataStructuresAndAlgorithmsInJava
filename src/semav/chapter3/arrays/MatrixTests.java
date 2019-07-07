package semav.chapter3.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MatrixTests {
    @Test
    public void shouldThrowExceptionIfValuesIsNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Matrix(null);
        });
    }

    @Test
    public void shouldThrowExceptionWhenValuesContainsDifferentRows(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Matrix(new int[][] {{1,2},{1,2,3}});
        });
    }

    @Test
    public void shouldAddMatrix1(){
        Matrix matrix1 = new Matrix(new int[][] {{1,2,3}, {3,2,1}});
        Matrix matrix2 = new Matrix(new int[][] {{1,1,1}, {1,1,1}});

        Matrix matrix = matrix1.add(matrix2);

        assertArrayEquals(new int[][] {{2,3,4}, {4,3,2}}, matrix.getValues());
    }

    @Test
    public void shouldAddMatrix2(){
        Matrix matrix1 = new Matrix(new int[][] {{10,20}, {30,40}});
        Matrix matrix2 = new Matrix(new int[][] {{1,1}, {1,1}});

        Matrix matrix = matrix1.add(matrix2);

        assertArrayEquals(new int[][] {{11,21}, {31,41}}, matrix.getValues());
    }
}
