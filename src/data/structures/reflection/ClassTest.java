package data.structures.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import oop.exception.InvalidTriangleException;
import oop.exercise.figure.Figure;
import oop.exercise.figure.Rectangle;
import oop.exercise.figure.Square;
import oop.exercise.figure.Triangle;

public class ClassTest {

    public static void main(String[] args) throws InvalidTriangleException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Square mySquare = new Square(9);
        Rectangle myRectangle = new Rectangle(15, 20);

        Figure[] myFigures = {mySquare, myRectangle};
        List<Figure> reflectionFigures = new ArrayList<>();
        for (Figure figure : myFigures) {
            Class<? extends Figure> figureClass = figure.getClass();
            System.out.println(figureClass);

            Constructor<?>[] declaredConstructors = figureClass.getDeclaredConstructors();

            if (figureClass == Square.class) {
                reflectionFigures.add(figureClass.getDeclaredConstructor(double.class).newInstance(9));
            }
            if (figureClass == Rectangle.class) {
                reflectionFigures.add(figureClass.getDeclaredConstructor(double.class, double.class).newInstance(9, 20));
            }

        }

        System.out.println(reflectionFigures.toString());
    }

}
