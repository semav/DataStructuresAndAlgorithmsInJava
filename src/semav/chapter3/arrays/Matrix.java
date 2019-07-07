package semav.chapter3.arrays;

public final class Matrix {
    private final int[][] values;

    public Matrix(int[][] values){
        isValid(values);
        this.values = values.clone();
    }

    public Matrix add(Matrix matrix){
        int[][] newValues = new int[getRowsCount()][getColumnsCount()];

        for (int row = 0; row < values.length; row++){
            for (int column = 0; column < values[row].length; column++){
                newValues[row][column] = values[row][column] + matrix.getAt(row, column);
            }
        }

        return new Matrix(newValues);
    }

    public int getAt( int row, int column){
        return values[row][column];
    }

    public int[][] getValues() {
        return values.clone();
    }

    private int getRowsCount()
    {
        return values.length;
    }

    private int getColumnsCount(){
        return values[0].length;
    }

    private void isValid(int[][] values){
        if(values == null){
            throw new IllegalArgumentException("Values is null");
        }

        if(values.length == 0){
            throw new IllegalArgumentException("The number of columns is zero");
        }

        int rows = values[0].length;

        if(rows == 0){
            throw new IllegalArgumentException("The number of rows is zero");
        }

        for (int i = 1; i < values.length; i++){
            if(values[i].length != rows){
                throw new IllegalArgumentException(String.format("Rows count in %s column doesn't equals %s", i, rows));
            }
        }
    }
}
