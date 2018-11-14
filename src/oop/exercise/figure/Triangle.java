package oop.exercise.figure;

import oop.exception.InvalidTriangleException;

public class Triangle implements Figure, Comparable<Triangle> {

    private double height;
    private double base;
    private double sideA;
    private double sideB;

    public Triangle(double height,
                    double base,
                    double sideA,
                    double sideB) throws InvalidTriangleException {
        if (sideA <= 0 || sideB <= 0 || base <= 0) {
            throw new IllegalArgumentException("Sides must be positive.");
        }
        if (!isTriangle(sideA, sideB, base)){
            throw new InvalidTriangleException(sideA, sideB, base);
        }

        this.height = height;
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //create default triangle with all sides equal to 1
    public Triangle() {
        this.height = 1;
        this.base = 1;
        this.sideA = 1;
        this.sideB = 1;
    }

    private boolean isTriangle(double sideA, double sideB, double sideC) {
        return (sideA < sideB + sideC) &&
                (sideB < sideA + sideC) &&
                (sideC < sideA + sideB);
    }

    @Override
    public double countPerimeter() {
        return base + sideA + sideB;
    }

    @Override
    public double countField() {
        return height * base * 0.5;
    }

    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public int compareTo(Triangle o) {
        double myPerimeter = this.countPerimeter();
        double otherPerimeter = o.countPerimeter();

        return Double.compare(myPerimeter, otherPerimeter);
    }
}