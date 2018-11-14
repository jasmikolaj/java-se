package oop.test;

import oop.exercise.figure.Rectangle;
import oop.exercise.figure.Square;

public class ClassTest {

    public static void main(String[] args) {
        Square smallSquare = new Square(4);
        Square bigSquare = new Square(16);

        double smallSquareField = smallSquare.countField();
        double bigSquareField = bigSquare.countField();

        System.out.println(smallSquareField);
        System.out.println(bigSquareField);

        Rectangle smallRectangle = new Rectangle(10, 5);
        Rectangle rectangleWhichIsSquare = new Rectangle(10);
        System.out.println(smallRectangle.countField());
        System.out.println(rectangleWhichIsSquare.countField());
    }

}
