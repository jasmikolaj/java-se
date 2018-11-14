package data.structures.stack;

public class StackTest {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.put(new Node(10));
        stack.put(new Node(15));
        Node node15 = stack.pop();
        System.out.println("Popped value: " + node15.getValue());
        stack.put(new Node(20));
        stack.pop();
        stack.pop();

        for (Integer stackValue : stack) {
            System.out.println(stackValue);
        }

        System.out.println(stack);
    }
}
