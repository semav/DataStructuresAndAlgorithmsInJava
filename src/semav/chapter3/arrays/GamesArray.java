package semav.chapter3.arrays;

import java.util.Arrays;

public final class GamesArray {
    private final static int maxElements = 5;
    private int count;
    private final Game[] elements = new Game[maxElements];

    public void add(Game game){
        int insertIndex = getInsertIndex(game);
        if(insertIndex >= 0) {
            shiftElements(insertIndex);
            elements[insertIndex] = game;
            count = Math.min(++count, maxElements);
        }
    }

    public Game remove(int index){
        if (index < 0 || index >= count){
            throw new IndexOutOfBoundsException();
        }

        Game result = elements[index];
        System.arraycopy(elements, index + 1, elements, index, count - 1 - index);
        elements[--count] = null;
        return result;
    }

    public Game[] getGames(){
        return Arrays.copyOfRange(elements, 0, count);
    }

    private void shiftElements(int insertIndex) {
        if (count - 1 - insertIndex >= 0)
            System.arraycopy(elements, insertIndex, elements,insertIndex + 1, count - 1 - insertIndex);
    }

    private int getInsertIndex(Game game) {
        for (int i = 0; i < elements.length; i++){
            if(elements[i] == null || elements[i].getScore() < game.getScore()){
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return "GamesArray{" +
                "count=" + count +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
