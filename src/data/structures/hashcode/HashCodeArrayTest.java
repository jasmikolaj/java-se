package data.structures.hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import oop.exercise.figure.Square;

public class HashCodeArrayTest {

    public static void main(String[] args) {
        Square five = new Square(5);
        Square six = new Square(6);
        Square seven = new Square(7);
        Square secondFive = new Square(5);

        List<Square> squares = new ArrayList<>();
        squares.add(five);
        squares.add(six);
        squares.add(seven);

        squares.remove(secondFive);

        System.out.println(squares);
    }


}
