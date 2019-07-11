package semav.chapter3.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class MatrixAddOperator<T extends Number> implements BinaryOperator<Matrix<T>> {
    private final BinaryOperator<T> addOperation;

    public MatrixAddOperator(BinaryOperator<T> addOperation) {
        this.addOperation = addOperation;
    }

    @Override
    public Matrix<T> apply(Matrix<T> m1, Matrix<T> m2) {
        List<List<T>> rows = new ArrayList<>();

        for (int rowIndex = 0; rowIndex < m1.getRowsCount(); rowIndex++){
            List<T> row = new ArrayList<>();

            for (int columnIndex = 0; columnIndex < m1.getColumnsCount(); columnIndex++){
                row.add(addOperation.apply(m1.getAt(rowIndex, columnIndex), m2.getAt(rowIndex, columnIndex)));
            }

            rows.add(row);
        }
        return new Matrix<>(rows);
    }
}
