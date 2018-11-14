package data.structures.comparator;

import java.util.Arrays;

import oop.exception.InvalidTriangleException;
import oop.exercise.figure.Triangle;

public class TriangleComparableTest {

    public static void main(String[] args) throws InvalidTriangleException {
        Triangle small = new Triangle(1, 2, 3, 4);
        Triangle medium = new Triangle(2, 3, 3, 4);
        Triangle large = new Triangle(2, 5, 6, 7);

        Triangle[] triangles = new Triangle[]{medium, large, small};
        System.out.println(Arrays.toString(triangles));
        Arrays.sort(triangles);
        System.out.println(Arrays.toString(triangles));
    }

}
