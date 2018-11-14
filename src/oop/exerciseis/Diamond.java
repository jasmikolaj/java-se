package oop.exerciseis;

public class Diamond extends Figure {
    private double e;
    private double f;
    private double a;

    public Diamond(double e, double f, double a, String color) {
        super(color);
        this.e = e;
        this.f = f;
        this.a = a;
    }

    public Diamond(double a, String color) {
        this(a / 10.0, a / 5.0, a, color);
    }

    public double countArea() {
        return e * f;
    }

    public void incrementE() {
        e++;
    }
}