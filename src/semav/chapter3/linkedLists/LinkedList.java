package semav.chapter3.linkedLists;

public class LinkedList<T extends Comparable<? super T>>{
    private int size;
    private Node<T> first;
    private Node<T> last;

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

    public Object[] toArray(){
        Object[] result = new Object[size];

        Node<T> next = first;
        int i = 0;
        while(next != null){
            result[i] = next.getValue();
            next = next.getNext();
            i++;
        }

        return result;
    }

    public void sort(){
        if(size < 2)
            return;

        Node<T> first = this.first;
        clear();

        while(first != null){
            Node<T> node = find(first);

            if(node == first){
                first = node.getNext();
            }
            else {
                Node<T> prev = node.getPrev();
                Node<T> next = node.getNext();

                if(prev != null)
                    prev.setNext(next);
                if(next != null)
                    next.setPrev(prev);
            }

            insertLast(node);
        }
    }

    public void clear(){
        first = null;
        last = null;
        size = 0;
    }

    private void insertLast(Node<T> node){
        size++;

        if (first == null){
            first = node;
            last = node;
            node.setPrev(null);
            node.setNext(null);
        }
        else {
            last.setNext(node);
            node.setPrev(first);
            node.setNext(null);
            last = node;
        }
    }

    private Node<T> find(Node<T> node){
        Node<T> result = node;

        while (node != null){
            node = node.getNext();

            if (node != null && node.getValue().compareTo(result.getValue()) < 0){
                result = node;
            }
        }

        return result;
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