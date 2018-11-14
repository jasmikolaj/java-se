package data.structures.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import oop.exercise.figure.Square;

public class SquareComparatorTest {

    public static void main(String[] args) {
        Comparator<Square> ascComparator = new SquareAscendingComparator();
        Comparator<Square> descComparator = new SquareDescendingComparator();
        Square five = new Square(5);
        Square six = new Square(6);
        Square seven = new Square(7);
        Square eight = new Square(8);

        List<Square> squares = new LinkedList<>();
        squares.add(six);
        squares.add(five);
        squares.add(eight);
        squares.add(seven);
        System.out.println(squares);

        squares.sort(ascComparator);
        System.out.println(squares);
        squares.sort(descComparator);
        System.out.println(squares);
    }

}
