package exercise;

public class RecurrencyTest {

    public static void main(String[] args) {
        System.out.println(recursiveFunction(10, ""));
    }


    static String recursiveFunction(int iterator, String myString) {
        System.out.println("Iterator value: " + iterator);
        return recursiveFunction(iterator - 1, myString + " " + iterator);
    }

}
