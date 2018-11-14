package oop.exercise.figure;

public class Rectangle extends Square implements Figure {

    private double sideB;

    public Rectangle(double sideA,
                     double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    public Rectangle(double side) {
        super(side);
        this.sideB = side;
    }

    public double countPerimeter() {
        return this.sideA * 2 + this.sideB * 2;
    }

    //przeciazenie metody countArea
    public double countPerimeter(int param) {
        return this.sideA * 2 + this.sideB * 2 * (1.0 / param);
    }

    public double countField() {
        return this.sideA * this.sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle rectangleO = (Rectangle) o;
            return rectangleO.sideA == this.sideA &&
                    rectangleO.sideB == this.sideB;
        } else {
            return false;
        }
    }
}
