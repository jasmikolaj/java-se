package exercise;

public class StringTest {

    public static void main(String[] args) {
        String firstName = "Mikołaj";
        String lastName = "Jaskulski";
        char prefix = 'P';

        double age = 27.0;
        double age2 = 18.0;

        String fullName = prefix + firstName + " " + lastName + (age + age2);
        System.out.println(fullName);
    }

}
