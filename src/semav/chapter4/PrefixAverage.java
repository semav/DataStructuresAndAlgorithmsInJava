package semav.chapter4;

public final class PrefixAverage {
    private final int[] numbers;

    public PrefixAverage(int[] numbers) {
        this.numbers = numbers.clone();
    }

    public int[] prefixAveragesQuadratic(){
        int[] result = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum += numbers[j];
            }
            result[i] = sum / (i + 1);
        }
        return result;
    }

    public int[] prefixAveragesLinear(){
        int[] result = new int[numbers.length];
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            result[i] = sum / (i + 1);
        }
        return result;
    }
}
