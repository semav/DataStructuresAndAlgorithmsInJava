package semav.chapter3.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class MatrixMultiplyOperator<T extends Number> implements BinaryOperator<Matrix<T>> {
    private final BinaryOperator<T> addOperation;
    private final BinaryOperator<T> multiplyOperation;

    public MatrixMultiplyOperator(BinaryOperator<T> addOperation, BinaryOperator<T> multiplyOperation) {
        this.addOperation = addOperation;
        this.multiplyOperation = multiplyOperation;
    }

    @Override
    public Matrix<T> apply(Matrix<T> m1, Matrix<T> m2) {

        if (m1.getRowsCount() != m2.getColumnsCount() || m1.getColumnsCount() != m2.getRowsCount()){
            throw new IllegalArgumentException();
        }

        List<List<T>> rows = new ArrayList<>();

        for(int rowIndex = 0; rowIndex < m1.getRowsCount(); rowIndex++){
            List<T> row = new ArrayList<>();

            for (int colIndex = 0; colIndex < m2.getColumnsCount(); colIndex++){
                row.add(multiply(rowIndex, colIndex, m1, m2));
            }

            rows.add(row);
        }

        return new Matrix<>(rows);
    }

    private T multiply(int rowIndex, int colIndex, Matrix<T> m1, Matrix<T> m2) {
        T result = multiplyOperation.apply(m1.getAt(rowIndex, 0), m2.getAt(0, colIndex));

        for (int i = 1; i < m1.getColumnsCount(); i++){
            T tmp = multiplyOperation.apply(m1.getAt(rowIndex, i), m2.getAt(i, colIndex));
            result = addOperation.apply(result, tmp);
        }
        return result;
    }
}
