package semav.chapter3.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
        assertEquals("name3", games[3].getName());
    }

    @Test
    public void gameShouldBeAddedIntoTheEndOfFullArray(){
        GamesArray array = new GamesArray();
        array.add(new Game("name1", 10));
        array.add(new Game("name2", 9));
        array.add(new Game("name3", 8));
        array.add(new Game("name4", 7));
        array.add(new Game("name5", 5));

        array.add(new Game("newGame", 6));

        Game[] games = array.getGames();
        assertEquals(5, games.length);
        assertEquals("newGame", games[4].getName());
        assertEquals("name4", games[3].getName());
    }

    @Test
    public void gameShouldBeRemovedFromOneElementArray(){
        GamesArray array = new GamesArray();
        Game game = new Game("name", 10);
        array.add(game);
        Game removedGame = array.remove(0);

        assertEquals(0, array.getGames().length);
        assertEquals(game, removedGame);
    }

    @Test
    public void gameShouldBeRemovedFromTheEnd(){
        GamesArray array = new GamesArray();
        array.add(new Game("name1", 10));
        array.add(new Game("name2", 9));
        array.add(new Game("name3", 8));
        array.add(new Game("name4", 7));
        array.add(new Game("name5", 6));

        array.remove(4);

        Game[] games = array.getGames();
        assertEquals(4, games.length);
    }
}
