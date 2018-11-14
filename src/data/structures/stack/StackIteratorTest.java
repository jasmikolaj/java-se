package data.structures.stack;

import java.util.Iterator;

import oop.exercise.figure.Square;

public class StackIteratorTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.put(new Node(10));
        stack.put(new Node(15));
        stack.put(new Node(15));
        stack.put(new Node(15));
        stack.put(new Node(15));
        stack.put(new Node(15));
        stack.put(new Node(15));

        for (Integer value : stack) {
            System.out.println(value);
        }
    }

}
