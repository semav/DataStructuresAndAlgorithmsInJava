package semav.chapter3.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamesArrayTests {
    @Test
    public void gameShouldBeAddedIntoEmptyArray(){
        GamesArray array = new GamesArray();

        array.add(new Game("name", 10));

        assertEquals(1, array.getGames().length);
    }

    @Test
    public void severalGamesShouldBeAddedIntoEmptyArray(){
        GamesArray array = new GamesArray();

        array.add(new Game("name1", 10));
        array.add(new Game("name2", 9));
        array.add(new Game("name3", 8));

        assertEquals(3, array.getGames().length);
    }

    @Test
    public void gameShouldBeAddedIntoFullArray(){
        GamesArray array = new GamesArray();
        array.add(new Game("name1", 10));
        array.add(new Game("name2", 9));
        array.add(new Game("name3", 7));
        array.add(new Game("name4", 6));
        array.add(new Game("name5", 5));

        array.add(new Game("newGame", 8));

        Game[] games = array.getGames();
        assertEquals(5, games.length);
        assertEquals("newGame", games[2].getName());
        assertEquals("newGame", games[2].getName());
    }
}
