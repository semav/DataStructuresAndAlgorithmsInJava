package semav.chapter3.recursion;

public class Factorial {
    public static int recursionFactorial(int n){
        if (n == 0)
            return 1;
        return n * recursionFactorial(n-1);
    }
}
