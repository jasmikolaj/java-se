package data.structures.comparator;

import java.util.Comparator;

import oop.exercise.figure.Square;

public class SquareDescendingComparator implements Comparator<Square> {

    private final SquareAscendingComparator ascendingComparator;

    public SquareDescendingComparator() {
        this.ascendingComparator = new SquareAscendingComparator();
    }

    @Override
    public int compare(Square o1, Square o2) {
        return ascendingComparator.compare(o2, o1);
    }
}
