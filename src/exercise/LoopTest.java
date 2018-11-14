package exercise;

public class LoopTest {
    public static void main(String[] args) {
        int[] yCoordinates = {1, 2, 3, 4, 5};

        //for
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += yCoordinates[i];
        }

        //for-each
        sum = 0;
        for (int yCoordinate : yCoordinates) {
            sum += yCoordinate;
        }

        //while
        sum = 0;
        int i = 0;

        while (true) {
            System.out.println("Adding value: " + yCoordinates[i]);
            if (i == 5) {
                break;
            }
            sum += yCoordinates[i];
            i++;

        }

        System.out.println(sum);

        //do ... while
        sum = 0;
        i = 0;
        do {
            sum += yCoordinates[i];
            i++;
        } while (i < 5);
    }
}
