package data.structures.mycollection;

public class MyCollectionTest {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.add(new Book("Pierwsza"));
        bookShelf.add(new Book("Druga"));
        bookShelf.add(new Book("Trzecia"));

        bookShelf.remove(new Book("Druga"));
        System.out.println(bookShelf.contains(bookShelf));
    }

}
