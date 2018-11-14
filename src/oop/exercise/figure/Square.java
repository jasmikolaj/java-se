package oop.exercise.figure;

import java.util.Objects;

public class Square implements Figure {

    protected double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    public double countField() {
        return this.sideA * this.sideA;
    }

    public double countPerimeter() {
        return this.sideA * 4.0;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square squareObject = (Square) o;
            return squareObject.sideA == this.sideA;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Double.hashCode(sideA);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                '}';
    }
}








