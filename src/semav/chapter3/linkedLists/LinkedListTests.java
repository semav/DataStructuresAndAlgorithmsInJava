package semav.chapter3.linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTests {

    @Test
    public void shouldSortList(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertLast(1);
        linkedList.insertLast(3);
        linkedList.insertLast(4);
        linkedList.insertLast(2);
        linkedList.insertLast(5);
        linkedList.insertLast(4);

        linkedList.sort();

        assertArrayEquals(
                new Object[] {
                        new Integer(1),
                        new Integer(2),
                        new Integer(3),
                        new Integer(4),
                        new Integer(4),
                        new Integer(5),
                },
                linkedList.toArray());
    }

    @Test
    public void shouldReturnValidArray(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);

        assertArrayEquals(
                new Object[] {new Integer(1), new Integer(2), new Integer(3)},
                linkedList.toArray());
    }

    @Test
    public void shouldReturnZeroSizeIfEmpty(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        assertEquals(0, linkedList.getSize());
    }

    @Test
    public void shouldInsertIntoFirstIfEmpty(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertFirst(10);

        assertEquals(1, linkedList.getSize());
        assertEquals(10, linkedList.getFirst());
    }

    @Test
    public void shouldInsertIntoLastIfEmpty(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertLast(10);

        assertEquals(1, linkedList.getSize());
        assertEquals(10, linkedList.getLast());
    }

    @Test
    public void shouldReturnAtPositionWhenInsertFirst(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);
        linkedList.insertFirst(0);

        assertEquals(5, linkedList.getSize());
        assertEquals(2, linkedList.getAt(2));
        assertEquals(4, linkedList.getAt(4));
    }

    @Test
    public void shouldReturnAtPositionWhenInsertLast(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertLast(0);
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);
        linkedList.insertLast(4);

        assertEquals(5, linkedList.getSize());
        assertEquals(2, linkedList.getAt(2));
        assertEquals(4, linkedList.getAt(4));
    }

    @Test
    public void shouldRemoveAtPosition(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertLast(0);
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);

        linkedList.removeAt(2);

        assertEquals(3, linkedList.getSize());
        assertEquals(1, linkedList.getAt(1));
        assertEquals(3, linkedList.getAt(2));
    }

    @Test
    public void shouldRemoveFirst(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertLast(0);
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);

        linkedList.removeAt(0);

        assertEquals(3, linkedList.getSize());
        assertEquals(1, linkedList.getAt(0));
        assertEquals(2, linkedList.getAt(1));
    }
}
