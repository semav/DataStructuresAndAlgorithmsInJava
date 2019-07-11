package semav.chapter3.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Matrix<T extends Number> {
    private final List<List<T>> rows;

    public Matrix(List<List<T>> rows){
        isValid(rows);

        List<List<T>> newRows = new ArrayList<>();

        for(List<T> row : rows){
            List<T> newRow = new ArrayList<>();
            for(T value : row){
                newRow.add(value);
            }
            newRows.add(Collections.unmodifiableList(newRow));
        }

        this.rows = Collections.unmodifiableList(newRows);
    }

    /*
    public Matrix<T> add(Matrix matrix){
        T[][] newValues = new T[getRowsCount()][getColumnsCount()];

        for (int row = 0; row < values.length; row++){
            for (int column = 0; column < values[row].length; column++){
                newValues[row][column] = values[row][column] + matrix.getAt(row, column);
            }
        }

        return new Matrix(newValues);
    }

    public Matrix<T> multiply(Matrix<T> matrix, BinaryOperator<T> multiplication){
        if (getRowsCount() != matrix.getColumnsCount() || getColumnsCount() != matrix.getRowsCount()){
            throw new IllegalArgumentException();
        }

        T[][] newValues = new int[getRowsCount()][matrix.getColumnsCount()];

        for(int row = 0; row < getRowsCount(); row++){
            for (int col = 0; col < matrix.getColumnsCount(); col++){
                newValues[row][col] = multiply(row, col, matrix, multiplication);
            }
        }

        return new Matrix(newValues);
    }
     */

    public T getAt(int row, int column){
        return rows.get(row).get(column);
    }

    public List<List<T>> getRows() {
        return rows;
    }

    /*
    private T multiply(int row, int col, Matrix matrix) {
        T result = getAt(0, 0);
        for (int i = 0; i < getColumnsCount(); i++){
            multiplyOperation.apply(getAt(row, i), getAt(i, col));
        }
        return result;
    }
     */

    public int getRowsCount()
    {
        return rows.size();
    }

    public int getColumnsCount(){
        return rows.get(0).size();
    }

    private void isValid(List<List<T>> rows){
        if(rows == null){
            throw new IllegalArgumentException("Values is null");
        }

        if(rows.size() == 0){
            throw new IllegalArgumentException("The number of rows is zero");
        }

        int colsSize = rows.get(0).size();

        if(colsSize == 0){
            throw new IllegalArgumentException("The number of cols is zero");
        }

        for (int i = 1; i < rows.size(); i++){
            if(rows.get(i).size() != colsSize){
                throw new IllegalArgumentException(String.format("The number of cols in %s row doesn't equals %s", i, colsSize));
            }
        }
    }
}
