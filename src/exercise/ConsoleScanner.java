package exercise;

import java.util.Scanner;

public class ConsoleScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę 1:");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbę 2:");
        int secondNumber = in.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }

}
