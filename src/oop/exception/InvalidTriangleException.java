package oop.exception;

public class InvalidTriangleException extends Exception {

    private static final String MSG_FORMAT = "Nie można utworzyć trójkąta z bokami: %f, %f, %f";

    public InvalidTriangleException(double sideA,
                                    double sideB,
                                    double sideC) {
        super(String.format(MSG_FORMAT, sideA, sideB, sideC));
    }
}
