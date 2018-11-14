package oop.exerciseis;

public class Rectangle extends Figure {

    protected double a;
    protected double b;

    public Rectangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        System.out.println("Set w prostokącie.");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double countArea() {
        return a * b;
    }

    public static double countArea(double a, double b) {
        return a * b;
    }
}
