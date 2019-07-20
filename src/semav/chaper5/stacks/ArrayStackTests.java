package semav.chaper5.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayStackTests {

    @Test
    public void shouldReturnEmptyWhenEmpty(){
        ArrayStack<Integer> stack = new ArrayStack<>();

        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void shouldReturnNotEmptyWhenNotEmpty(){
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);

        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void sizeShouldReturnZeroSizeWhenEmpty(){
        ArrayStack<Integer> stack = new ArrayStack<>();

        assertEquals(0, stack.size());
    }

    @Test
    public void sizeShouldReturnActualSizeWhenNotEmpty(){
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.size());
    }

    @Test
    public void topShouldReturnTopElementWhenNotEmpty(){
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.top());
        assertEquals(2, stack.size());
    }

    @Test
    public void popShouldReturnAndRemoveTopElementWhenNotEmpty(){
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop());
        assertEquals(1, stack.size());
        assertEquals(1, stack.top());
    }

    @Test
    public void topShouldThrowExceptionWhenStackIsEmpty(){
        ArrayStack<Integer> stack = new ArrayStack<>(2);

        assertThrows(RuntimeException.class, () -> stack.top());
    }

    @Test
    public void pushShouldThrowExceptionWhenStackIsFull(){
        ArrayStack<Integer> stack = new ArrayStack<>(2);
        stack.push(1);
        stack.push(2);

        assertThrows(RuntimeException.class, () -> stack.push(3));
    }
}
