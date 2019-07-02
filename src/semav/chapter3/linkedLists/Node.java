package semav.chapter3.linkedLists;

class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> prev;

    Node(T value, Node<T> next, Node<T> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    T getValue() {
        return value;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    Node<T> getNext() {
        return next;
    }

    Node<T> getPrev() {
        return prev;
    }
}
