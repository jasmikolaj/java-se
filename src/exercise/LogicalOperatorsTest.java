package exercise;

public class LogicalOperatorsTest {
    public static void main(String[] args) {

        boolean isCircle = true;
        double r = 5.25;

        double circleField = 3.14 * r * r;


        int year = -20000;
        String era;
        if (year < 0) {
            era = "BC";
        } else {
            era = "AD";
        }

        era = year < 0 ? "BC" : "AD";


        if (isBigCircle(isCircle, r)) {
            System.out.println("To jest duże koło.");
        } else if (isCircle){
            System.out.println("To jest małe koło.");
        } else {
            System.out.println("To nie jest w ogóle koło.");
        }
    }


    static boolean isBigCircle(boolean isCricle, double r) {
        return isCricle && r > 10;
    }
}
