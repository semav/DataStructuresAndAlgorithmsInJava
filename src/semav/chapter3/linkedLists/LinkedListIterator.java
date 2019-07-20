package semav.chapter3.linkedLists;

import java.util.Iterator;

class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> node;

    public LinkedListIterator(Node<T> first) {
        this.node = first;
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }

    @Override
    public T next() {
        T value = node.getValue();
        node = node.getNext();
        return value;
    }
}
