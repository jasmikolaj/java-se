package data.structures.hashcode;

import java.util.HashSet;
import java.util.Set;

import oop.exercise.figure.Square;

public class HashCodeSetTest {

    public static void main(String[] args) {
        Square five = new Square(5);
        Square six = new Square(6);
        Square seven = new Square(7);
        Square secondFive = new Square(5);

        Set<Square> squares = new HashSet<>();
        squares.add(five);
        squares.add(six);
        squares.add(seven);
        squares.add(secondFive);
        squares.remove(secondFive);

        System.out.println(squares);
    }

}
