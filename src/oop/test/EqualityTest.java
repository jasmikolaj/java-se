package oop.test;

import oop.exercise.figure.Rectangle;
import oop.exercise.figure.Square;

public class EqualityTest {

    public static void main(String[] args) {
        rectangleEqualityTest();
    }

    public static void squareEqualityTest() {
        Square smallSquare = null;
        Square bigSquare = new Square(10);
        // if (10 == 10) ?
        if (bigSquare.equals(smallSquare)) {
            System.out.println("Takie same kwadraty");
        } else {
            System.out.println("Różne kwadraty");
        }

        System.out.println(smallSquare);
    }

    public static void rectangleEqualityTest() {
        Rectangle smallRectangle = new Rectangle(10, 30);
        Rectangle bigRectangle = new Rectangle(10, 20);

        if (smallRectangle.equals(bigRectangle)) {
            System.out.println("Takie same prostokąty");
        } else {
            System.out.println("Różne.");
        }
    }

}
