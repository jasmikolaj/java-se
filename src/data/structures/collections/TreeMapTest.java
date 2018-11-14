package data.structures.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import data.structures.comparator.SquareAscendingComparator;
import data.structures.comparator.SquareDescendingComparator;
import oop.exercise.figure.Square;

public class TreeMapTest {

    public static void main(String[] args) {
        Comparator<Square> ascComparator = new SquareAscendingComparator();
        Comparator<Square> descComparator = new SquareDescendingComparator();
        Square five = new Square(5);
        Square six = new Square(6);
        Square seven = new Square(7);
        Square eight = new Square(8);

        TreeMap<Square, String> squares = new TreeMap<>(ascComparator);
        squares.put(six, "szósty");
        squares.put(five, "piąty");
        squares.put(eight, "ósmy");
        squares.put(seven, "siódmy");
        System.out.println(squares);
    }

}
