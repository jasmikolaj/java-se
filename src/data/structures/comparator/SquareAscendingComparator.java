package data.structures.comparator;

import java.util.Comparator;

import oop.exercise.figure.Square;

public class SquareAscendingComparator implements Comparator<Square> {

    @Override
    public int compare(Square o1, Square o2) {
        if (o1.getSideA() > o2.getSideA()) {
            return 1;
        } else if (o1.getSideA() == o2.getSideA()) {
            return 0;
        } else {
            return -1;
        }
    }

}
