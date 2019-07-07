package semav.chapter3.recursion;

public class ReverseArray {
    public static void recursionReverse(int[] array, int first, int last){
        if(first < last){
            swap(array, first, last);

            recursionReverse(array, first + 1, last - 1);
        }
    }

    public static void iterativeReversion(int[] array){
        int first = 0;
        int last = array.length - 1;

        while (first < last){
            swap(array, first, last);

            first++;
            last--;
        }
    }

    private static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
