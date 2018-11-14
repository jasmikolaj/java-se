package workshop;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrayTest {

    public static void main(String[] args) {
        int charCount = 5;
        char[] tab = new char[charCount];
        fillArray(tab);

        System.out.println(Arrays.toString(tab));
    }

    static char readCharFromConsole(Scanner scanner) {
        System.out.println("Podaj liczbę: ");
        return scanner.next().charAt(0);
    }

    static void fillArray(char[] array) {
        Scanner scanner = new Scanner(System.in);
        char readChar = ' ';
        int i = 0;
        while(readChar != 'q') {
            readChar = readCharFromConsole(scanner);
            array[i++] = readChar;
            if (i == array.length) {
                array = doubleArraySize(array);
            }
        }
    }

    static char[] doubleArraySize(char[] array) {
        char[] newArray = new char[2*array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

}
