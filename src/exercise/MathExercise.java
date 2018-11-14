package exercise;

import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class MathExercise {

    public static void main(String[] args) {

        double x = 0.0, y = 0.0, z = 0.0, w = 0.0, p = 0.0;

        double licznik = sqrt(
                sqrt(x) / y * abs(sin(z))
        );

        double mianownik = abs(1.0 / w) - tan(p);

        System.out.println(licznik / mianownik);
    }

}
