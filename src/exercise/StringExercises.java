package exercise;

public class StringExercises {

    public static void main(String[] args) {
        String name = "        mikolaj@bla.pl        ";

        boolean endsWithBla = name.trim().endsWith("bla.pl");

        String trimmed = name.trim();
        boolean endsWithBlaa = trimmed.endsWith("bla.pl");

        System.out.println(endsWithBla);
    }

}
