package data.structures.mycollection;

public class Book {

    private final String name;

    public Book(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            return this.name.equals(((Book) obj).getName());
        }

        return false;
    }


    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
