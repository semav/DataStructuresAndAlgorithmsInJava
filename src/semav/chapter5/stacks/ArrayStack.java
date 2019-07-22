package semav.chapter5.stacks;

public class ArrayStack<T> implements Stack<T> {
    private static final int CAPACITY = 100;
    private final T[] array;
    private int index = -1;

    public ArrayStack(){
        this(CAPACITY);
    }

    public ArrayStack(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException();
        }
        array = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        return index + 1;
    }

    @Override
    public boolean isEmpty() {
        return index < 0;
    }

    @Override
    public T top() {
        if(size() == 0){
            throw new RuntimeException("Stack is empty");
        }

        return array[index];
    }

    @Override
    public void push(T element) {
        if (size() == array.length){
            throw new RuntimeException("Stack is full");
        }
        array[++index] = element;
    }

    @Override
    public T pop() {
        if(size() == 0){
            throw new RuntimeException("Stack is empty");
        }

        T result = array[index];
        array[index] = null;
        index--;
        return result;
    }
}
