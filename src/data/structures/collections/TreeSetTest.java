package data.structures.collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import data.structures.comparator.SquareAscendingComparator;
import data.structures.comparator.SquareDescendingComparator;
import oop.exercise.figure.Square;

public class TreeSetTest {

    public static void main(String[] args) {
        Comparator<Square> ascComparator = new SquareAscendingComparator();
        Comparator<Square> descComparator = new SquareDescendingComparator();
        Square five = new Square(5);
        Square six = new Square(6);
        Square seven = new Square(7);
        Square eight = new Square(8);

        Set<Square> squares = new TreeSet<>(descComparator);
        squares.add(six);
        squares.add(five);
        squares.add(eight);
        squares.add(seven);
        System.out.println(squares);
    }

}
