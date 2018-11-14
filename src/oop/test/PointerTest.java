package oop.test;

import oop.exercise.figure.Square;

public class PointerTest {

    public static void main(String[] args) {
        Square smallSquare = new Square(5);
        Square bigSquare = new Square(10);

        System.out.println("Small: " + smallSquare.countField());
        System.out.println("Big: " + bigSquare.countField());

        Square currentSquare = bigSquare;
        currentSquare.setSideA(1);
        System.out.println("Big: " + bigSquare.countField());

        System.out.println("bigSquare ref: " + bigSquare);
        System.out.println("currentSquare reg: " + currentSquare);
    }

}
