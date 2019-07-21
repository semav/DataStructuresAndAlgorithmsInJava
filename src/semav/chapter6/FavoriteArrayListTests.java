package semav.chapter6;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FavoriteArrayListTests {
    @Test
    void shouldAddToEmptyList(){
        FavofiteArrayList<Integer> list = new FavofiteArrayList<>();

        list.access(1);

        assertEquals(Arrays.asList(1), list.top(1) );
    }

    @Test
    void shouldAddToEmptyList1(){
        FavofiteArrayList<Integer> list = new FavofiteArrayList<>();

        list.access(1);
        list.access(2);
        list.access(3);

        list.remove(2);

        assertEquals(Arrays.asList(1,3), list.top(3) );
    }


    @Test
    void accessShouldMoveElementToTop(){
        FavofiteArrayList<Integer> list = new FavofiteArrayList<>();

        list.access(1);
        list.access(2);
        list.access(3);

        list.access(3);

        assertEquals(Arrays.asList(3,1,2), list.top(3) );
    }
}
