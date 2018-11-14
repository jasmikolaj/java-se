package data.structures.stack;

import java.util.Iterator;

public class StackIterator implements Iterator<Integer>{

    private Node next;

    public StackIterator(Node head) {
        this.next = head;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Integer next() {
        Node temp = next;
        next = next.getNext();
        return temp.getValue();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove.");
    }
}
