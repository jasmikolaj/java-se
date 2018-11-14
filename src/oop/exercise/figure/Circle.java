package oop.exercise.figure;

public final class Circle implements Figure {

    public static final double PI_VALUE = 3.14;

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double countPerimeter() {
        return 2 * PI_VALUE * r;
    }

    @Override
    public double countField() {
        return PI_VALUE * r * r;
    }
}
