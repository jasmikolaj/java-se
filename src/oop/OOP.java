package oop;

import oop.exerciseis.Diamond;
import oop.exerciseis.Figure;
import oop.exerciseis.Rectangle;
import oop.exerciseis.Square;

public class OOP {

    public static void main(String[] args) {
        Square myRect = new Square(10, "red");
        Rectangle mySquare = new Rectangle(10, 20, "black");
        Diamond myDiamond = new Diamond(10, 20, 5, "green");
        Triangle myTriangle = new Triangle(...);

        Figure[] figures = new Figure[4];
        figures[0] = myRect;
        figures[1] = mySquare;
        figures[2] = myDiamond;
        figures[3] = myTriangle;

        double area = 0.0;
        for (Figure figure : figures) {
            area += figure.countArea();
        }

        System.out.println("Area of all fields: " + area);
    }


}
