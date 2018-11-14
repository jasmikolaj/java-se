package data.structures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import oop.exercise.figure.Square;

public class IteratorTest {

    public static void main(String[] args) {
        Square five = new Square(5);
        Square six = new Square(6);
        Square seven = new Square(7);
        Square secondFive = new Square(5);

        Set<Square> squares = new HashSet<>();
        squares.add(five);
        squares.add(six);
        squares.add(seven);

        Iterator<Square> it = squares.iterator();
        while(it.hasNext()) {
            Square next = it.next();
            if (next.getSideA() == 6) {
                it.remove();
            }
        }

        System.out.println(squares);
    }

}
