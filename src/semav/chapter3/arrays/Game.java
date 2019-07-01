package semav.chapter3.arrays;

public final class Game {
    private final String name;
    private final int score;

    public Game(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
