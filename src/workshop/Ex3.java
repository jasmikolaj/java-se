package workshop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3. Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite i wypisuje na
 * standardowym wyjściu największą z ich wartości (pamiętaj o przypadku gdy wszystkie podane
 * liczby lub dwie z nich są równe).
 */
public class Ex3 {

    public static void main(String[] args) {
        int firstNumber = readNumberFromConsole(1);
        int secondNumber = readNumberFromConsole(2);
        int thirdNumber = readNumberFromConsole(3);

        int[] greatests = findGreatestNumbers(firstNumber, secondNumber, thirdNumber);

        System.out.println(Arrays.toString(greatests));
    }

    static int[] findGreatestNumbers(int... numbers) {
        int greatest = findGreatestNumber(numbers);
        int greatestCount = countOccurences(numbers, greatest);

        int[] result = new int[greatestCount];
        for (int i = 0; i < greatestCount; i++) {
            result[i] = greatest;
        }
        return result;
    }

    static int findGreatestNumber(int[] numbers) {
        int greatest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }

        return greatest;
    }

    static int countOccurences(int[] numbers, int number) {
        int numberCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                numberCount++;
            }
        }

        return numberCount;
    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: " + numberInOrder);
        return scanner.nextInt();
    }

}
