package data.structures.hashcode;

import java.util.HashMap;
import java.util.Map;

import oop.exercise.figure.Square;

public class HashCodeMapTest {

    public static void main(String[] args) {
        Map<Square, String> squareMap = new HashMap<>();
        Square five = new Square(5);
        Square six = new Square(6);
        Square seven = new Square(7);
        Square secondFive = new Square(5);

        squareMap.put(five, "pięć");
        squareMap.put(six, "sześć");
        squareMap.put(seven, "siedem");
        squareMap.put(secondFive, "suprise");
        System.out.println(squareMap);

        for (Map.Entry entry : squareMap.entrySet()) {
            System.out.println(entry.getKey() + " => " +
                    entry.getValue());
        }

    }

}
