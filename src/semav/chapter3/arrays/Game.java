package semav.chapter3.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public final class Game {
    private final String name;
    private final int score;

    public Game(String name, int score) {
        this.name = name;
        this.score = score;
        LinkedList<String> s = new LinkedList<>();
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
