package data.structures.stack;

import java.util.Iterator;

public class Stack implements Iterable<Integer> {

    private Node head;

    public void put(Node node) {
        if (head == null) {
            head = node;
        } else {
            node.setNext(head); //1.
            head = node; //2.
        }
    }

    public Node pop() {
        Node tempHead = head; //1.
        if (head == null) {
            throw new StackIsEmptyException();
        }
        if (head.hasNext()) {
            head = head.getNext(); //2.
        } else {
            head = null;
        }
        return tempHead;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "Stack is empty.";
        }
        String stack = "";

        Node element = head;
        while (element.hasNext()) {
            stack += element.getValue() + ",";
            element = element.getNext();
        }
        stack += element.getValue();

        return stack;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator(head);
    }
}
