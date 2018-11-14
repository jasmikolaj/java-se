package oop.exercise.figure;

import oop.exception.InvalidTriangleException;

public class PolymorphismTest {

    public static void main(String[] args) throws InvalidTriangleException {
        Triangle myTriangle = new Triangle(10, 15, 5, 3);
        Square mySquare = new Square(9);
        Rectangle myRectangle = new Rectangle(15, 20);

        Figure[] myFigures = {myTriangle, mySquare, myRectangle};
        Figure triangleFigure = (Figure) myTriangle;

        if (myFigures[0] instanceof Triangle) {
            Triangle myTriangleFromFigure = (Triangle) myFigures[0];
//            myTriangleFromFigure.drawTriangle();
        } else {
            System.out.println("To nie jest trójkąt.");
        }

        System.out.println(String.format("Suma wszystkich pól: %f", countSumOfFields(myFigures)));
    }

    static double countSumOfFields(Figure[] figures) {
        double sum = 0.0;
        for (Figure figure : figures) {
            sum += figure.countField();
        }
        return sum;
    }


}
