package semav.chapter4;

public final class Power {
    private final float number;

    public Power(float number) {
        this.number = number;
    }

    public float get(int power){
        float result = 1;
        for (int i = 0; i < power; i++){
            result *= number;
        }
        return result;
    }
}
