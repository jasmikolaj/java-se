package exercise;

public class EnumTest {

    public static void main(String[] args) {

        int shapeX = 5;
        int shapeY = 10;
        ShapeType shapeType = ShapeType.CIRCLE;

        if (shapeType == ShapeType.CIRCLE) {
            System.out.println("To jest koło.");
        } else if (shapeType == ShapeType.RECTANGLE) {
            System.out.println("To jest kwadrat.");
        } else {
            System.out.println("To jest trójkąt.");
        }

    }


    enum ShapeType {
        CIRCLE, TRIANGLE, RECTANGLE
    }
}
