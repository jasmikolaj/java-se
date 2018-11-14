package exercise;

public class FunctionsTest {

    public static void main(String[] args) {

        int[] yCoordinates = {1, 2, 3, 4, 5};
        int[] xCoordinates = {5, 6, 7, 8, 9};
        double[] someDoubles = {10.5};

        int yCoordinatesSum = countSumOfElements(yCoordinates);
        int xCoordinatesSum = countSumOfElements(xCoordinates);
        System.out.println("Suma X to: " + xCoordinatesSum);
        System.out.println("Suma Y to: " + yCoordinatesSum);
        System.out.println("Srednia X to: " + countAvgOfElements(xCoordinates));
        System.out.println("Srednia Y to: " + countAvgOfElements(yCoordinates));
    }

    static double countAvgOfElements(int[] inputArray) {
        double sum = countSumOfElements(inputArray);
        return sum / inputArray.length;
    }

    static int countSumOfElements(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }

        return sum;
    }

    static void printSumOfElements(int[] inputArray) {
        int sum = countSumOfElements(inputArray);
        System.out.println("Suma tablicy to: " + sum);
    }

    static double countVelocity(double time, double route) {
        double velocity = route / time;
        System.out.println(velocity);

        return velocity;
    }

}
