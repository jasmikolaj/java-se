package data.structures.mycollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class BookShelf implements Collection<Book> {

    private Book[] books;
    private int booksCounter;
    private final int size;

    public BookShelf(int size) {
        this.size = size;
        books = new Book[size];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super Book> filter) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            return booksCounter < size - 1;
        }
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Book> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Book book) {
        if (booksCounter == size) {
            throw new ShelfIsFullException();
        }
        books[booksCounter] = book;
        booksCounter++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].equals(o)) {
                books[i] = null;
                moveNullsToRight();
                booksCounter--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Book> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        books = new Book[size];
        booksCounter = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(books);
    }

    private void moveNullsToRight() {
        for (int i = 0; i < booksCounter; i++) {
            if (books[i] == null) {
                replaceNullStartingFrom(i);
            }
        }

    }

    private void replaceNullStartingFrom(int nullIndex) {
        for (int i = nullIndex; i < booksCounter; i++) {
            if (books[i] != null) {
                books[nullIndex] = books[i];
                books[i] = null;
                return;
            }
        }
    }
}
