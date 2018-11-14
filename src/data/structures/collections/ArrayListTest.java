package data.structures.collections;

import java.util.ArrayList;
import java.util.List;

import oop.exception.InvalidTriangleException;
import oop.exercise.figure.Figure;
import oop.exercise.figure.Rectangle;
import oop.exercise.figure.Square;
import oop.exercise.figure.Triangle;

public class ArrayListTest {

    public static void main(String[] args) throws InvalidTriangleException {

        Triangle myTriangle = new Triangle(10, 15, 10, 10);
        Square mySquare = new Square(9);
        Rectangle myRectangle = new Rectangle(15, 20);

        List<Figure> myFigures = new ArrayList<>();
        myFigures.add(myTriangle);
        myFigures.add(myRectangle);
        myFigures.add(mySquare);

        myFigures.remove(myRectangle);

        for (Figure figure : myFigures) {
            System.out.println(figure.countField());
        }

        Double one = 1.0;
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.add(2.0);
        doubleList.add(3.0);
        doubleList.add(4.0);
        doubleList.add(5.0);

        // doubleList[2];
        double oneReceived = doubleList.get(0);
    }

}