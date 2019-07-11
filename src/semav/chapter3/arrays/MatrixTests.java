package semav.chapter3.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixTests {
    @Test
    public void shouldThrowExceptionIfValuesIsNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Matrix(null);
        });
    }

    @Test
    public void shouldThrowExceptionWhenValuesContainsDifferentRows(){
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(Arrays.asList(1,2));
        rows.add(Arrays.asList(1,2,3));

        assertThrows(IllegalArgumentException.class, () -> {
            new Matrix(rows);
        });
    }

    @Test
    public void shouldReturnValueAtPosition(){
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(Arrays.asList(1,2));
        rows.add(Arrays.asList(3,4));

        Matrix<Integer> matrix = new Matrix<>(rows);

        assertEquals(4, matrix.getAt(1,1));
    }

    @Test
    public void shouldAddMatrix1(){
        List<List<Integer>> rows1 = new ArrayList<>();
        rows1.add(Arrays.asList(1,2));
        rows1.add(Arrays.asList(3,2));

        List<List<Integer>> rows2 = new ArrayList<>();
        rows2.add(Arrays.asList(1,1));
        rows2.add(Arrays.asList(1,1));

        Matrix<Integer> matrix1 = new Matrix<>(rows1);
        Matrix<Integer> matrix2 = new Matrix<>(rows2);

        MatrixAddOperator addOperator = new MatrixAddOperator<Integer>((a, b) -> a.intValue() + b.intValue());

        Matrix matrix = addOperator.apply(matrix1, matrix2);

        assertEquals(2, matrix.getAt(0,0));
        assertEquals(3, matrix.getAt(0,1));
        assertEquals(4, matrix.getAt(1,0));
        assertEquals(3, matrix.getAt(1,1));
    }

/*
    @Test
    public void shouldMultiplyMatrices(){
        Matrix matrix1 = new Matrix(new Integer[][] {{1,2,4}, {2,0,3}});
        Matrix matrix2 = new Matrix(new Integer[][] {{2,5}, {1,3}, {1,1}});

        Matrix matrix = matrix1.multiply(matrix2);

        assertArrayEquals(new int[][] {{8,15}, {7,13}}, matrix.getValues());
    }
     */
}
