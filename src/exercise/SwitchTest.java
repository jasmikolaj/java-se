package exercise;

public class SwitchTest {

    public static void main(String[] args) {
        Direction direction = Direction.LEFT;

        switch (direction) {
            case LEFT:
                System.out.println("lewo");
                break;
            case RIGHT:
                System.out.println("prawo");
                break;
            case UP:
                System.out.println("góra");
                break;
            case DOWN:
                System.out.println("dół");
                break;
            default:
                System.out.println("brak kierunku");
        }

    }

    enum Direction {
        LEFT, RIGHT, UP, DOWN, UNKNOWN
    }
}
