package exercise;

public class BooleanTest {

    public static void main(String[] args) {
        boolean isCircle = false;
        ShapeType shapeType = ShapeType.RECTANGLE;

        if (shapeType != ShapeType.CIRCLE) {
            isCircle = true;
        }

        isCircle = shapeType == ShapeType.CIRCLE;
        System.out.println("Provided shape is circle: " + isCircle);
    }

    enum ShapeType {
        CIRCLE, TRIANGLE, RECTANGLE
    }
}
