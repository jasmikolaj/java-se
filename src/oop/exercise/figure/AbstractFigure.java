package oop.exercise.figure;

import java.awt.*;

public abstract class AbstractFigure implements Figure {

    protected Point[] points;

    public AbstractFigure(int pointsNumber) {
        this.points = new Point[pointsNumber];
    }

    public AbstractFigure(Point[] points) {
        this.points = points;
    }
}
