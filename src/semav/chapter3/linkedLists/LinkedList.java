package semav.chapter3.linkedLists;

import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T>{
    private int size;
    private Node<T> first;
    private Node<T> last;

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    public int getSize(){
        return size;
    }

    public void insertFirst(T value){
        Node<T> newNode = new Node<>(value, first, null);
        if (first != null) {
            first.setPrev(newNode);
        }

        first = newNode;

        if(size == 0){
            last = newNode;
        }

        size++;
    }

    public void insertLast(T value){
        Node<T> newNode = new Node<>(value, null, last);
        if(last != null){
            last.setNext(newNode);
        }
        last = newNode;

        if(size == 0){
            first = newNode;
        }

        size++;
    }

    public void removeAt(int index){
        Node<T> node = getNodeAt(index);
        Node<T> prev = node.getPrev();
        Node<T> next = node.getNext();

        if(first == node){
            first = node.getNext();
        }

        if (last == node){
            last = node.getPrev();
        }

        if (prev != null) {
            prev.setNext(next);
        }

        if (next != null) {
            next.setPrev(prev);
        }

        size--;
    }

    public T getAt(int index){
        return getNodeAt(index).getValue();
    }

    public T getFirst() {
        return first.getValue();
    }

    public T getLast() {
        return last.getValue();
    }

    private Node<T> getNodeAt(int index){
        if(index + 1 > size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        Node<T> result = first;

        while(i != index){
            result = result.getNext();
            i++;
        }

        return result;
    }
}