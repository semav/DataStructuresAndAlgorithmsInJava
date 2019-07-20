package semav.chaper5.iterators;

import org.junit.jupiter.api.Test;
import semav.chapter3.linkedLists.LinkedList;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTests {
    @Test
    public void linkedListShouldReturnIterator(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertFirst(1);

        assertNotNull(linkedList.iterator());

    }

    @Test
    public void iteratorShouldHaveNextWhenSizeEqualsOne(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertFirst(1);

        assertTrue(linkedList.iterator().hasNext());
    }

    @Test
    public void forEach(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(1);
        linkedList.insertFirst(1);

        int count = 0;
        for(Integer i : linkedList){
            assertEquals(1, i);
            count++;
        }
        assertEquals(3, count);
    }
}
