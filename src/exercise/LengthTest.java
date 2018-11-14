package exercise;

public class LengthTest {

    public static void main(String args[]) {
        double coordinateX1 = 127.89;
        double coordinateY1 = 92.12;

        double coordinateX2 = 24.12;
        double coordinateY2 = 82.91;

        double xPart =(coordinateX2 - coordinateX1) *
                (coordinateX2 - coordinateX1);

        double yPart =(coordinateY2 - coordinateY1) *
                (coordinateY2 - coordinateY1);

        double result = Math.sqrt(xPart + yPart);
        System.out.println(result);
    }

}
