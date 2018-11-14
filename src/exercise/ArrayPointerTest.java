package exercise;

import java.util.Arrays;

public class ArrayPointerTest {

    public static void main(String[] args) {

        double[] xCoordinates = {10, 20, 30, 51.5};

        System.out.println(Arrays.toString(xCoordinates));
        int xSum = countSumOfElements(xCoordinates);
        System.out.println(Arrays.toString(xCoordinates));

        int number = 10;
        number = increment(number);
        System.out.println(number);
    }

    private static int increment(int number) {
        number = number + 1;
        return number;
    }

    private static int countSumOfElements(double[] xCoordinates) {
        int sum = 0;
        double[] newArray = {1.0, 2.0, 3.0};
        xCoordinates = newArray;
        for (int i = 0; i < xCoordinates.length; i++) {
            sum += xCoordinates[i];
        }
        xCoordinates[1] = -5000; // BŁĄD!
        return sum;
    }



}
