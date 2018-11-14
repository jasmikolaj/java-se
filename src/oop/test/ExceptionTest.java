package oop.test;

import oop.exception.InvalidTriangleException;
import oop.exercise.figure.Triangle;

public class ExceptionTest {

    public static void main(String[] args) {
        Triangle triangle;
        try {
            triangle = new Triangle(10.0, 10.1, 20.0, 30.0);
        } catch (InvalidTriangleException e) {
            System.out.println("Suma dwoch mniejszych musi " +
                    "byc wieksza od wiekszego.");
            triangle = new Triangle();
        } catch (IllegalArgumentException e) {
            System.out.println("Boki musza byc dodatnie.");
            triangle = new Triangle();
        } finally {

        }


        System.out.println(triangle.countPerimeter());
    }
}
