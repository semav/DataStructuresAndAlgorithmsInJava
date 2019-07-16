package semav.chapter4;

public final class Power {
    private final int number;

    public Power(int number) {
        this.number = number;
    }

    public float get(int power){
        int result = 1;
        for (int i = 0; i < power; i++){
            result *= number;
        }
        return result;
    }

    public int getWithRecursion(int power){
        return power(number, power);
    }

    private int power(int n, int power){
        if (power == 0){
            return 1;
        } else if (power % 2 == 0){
            int tmp = power(n, power / 2);
            return tmp * tmp;
        }
        else{
            int tmp = power(n, (power - 1) / 2);
            return tmp * tmp * n;
        }
    }
}
