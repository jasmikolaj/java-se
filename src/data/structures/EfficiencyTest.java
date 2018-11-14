package data.structures;

import java.util.Random;

public class EfficiencyTest {

    private static final Random random = new Random();

    //zad 1 - funkcja, ktora znajduje najmniejszy
    //element w tablicy jednowymiarowej
    //int minValue(int[] array)

    //zad 2 - funkcja, ktora znajduje najmniejszy
    //element w tablicy dwuwymiarowej
    //int minValue(int[][] array)

    public static void main(String[] args) {

        long startTimeMillis = System.currentTimeMillis();
        int[] randomArray = getRandomArray(50000);
        System.out.println("Min val: " + minValue(randomArray));
        long endTimeMillis = System.currentTimeMillis();
        System.out.println((endTimeMillis - startTimeMillis) / 1000.0 + " sekund");

        startTimeMillis = System.currentTimeMillis();
        int[][] randomArray2D = getRandomArrayTwoDimensional(20000);
        System.out.println("Min val 2D: " + minValue(randomArray2D));
        endTimeMillis = System.currentTimeMillis();
        System.out.println((endTimeMillis - startTimeMillis) / 1000.0 + " sekund");

    }

    public static int minValue(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int minValue(int[][] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int arrayMinValue = minValue(array[i]);
            if (arrayMinValue <= minValue) {
                minValue = arrayMinValue;
            }
        }
        return minValue;
    }

    public static int[] getRandomArray(int size) {
        return random.ints(size).toArray();
    }

    public static int[][] getRandomArrayTwoDimensional(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i] = getRandomArray(size);
        }

        return array;
    }
}
