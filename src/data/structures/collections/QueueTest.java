package data.structures.collections;

import java.util.LinkedList;
import java.util.Queue;

import oop.exercise.figure.Figure;
import oop.exercise.figure.Square;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Figure> myFigures = new LinkedList<>();
        Square five = new Square(5);
        Square six = new Square(6);
        Square seven = new Square(7);
        Square secondFive = new Square(5);

        myFigures.add(five);
        myFigures.add(six);
        myFigures.add(seven);
        myFigures.add(secondFive);

        System.out.println(myFigures);
    }

}
