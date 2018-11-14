package workshop;

import java.util.Scanner;

/**
 * 2. Napisz program, który wczytuje ze standardowego wejścia liczbę całkowitą n i
 *    wypisuje na standardowe wyjście wartość bezwzględną z n.
 */
public class Ex2 {

    public static void main(String[] args) {
        int number = readNumberFromConsole();
        int abs = countAbs(number);

        System.out.println("Wartość bezwzględna: " + abs);
    }

    static int countAbs(int number) {
        return number < 0 ? number * -1 : number;
    }

    static int readNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        return scanner.nextInt();
    }

}
