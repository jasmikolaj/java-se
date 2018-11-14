package exercise;

public class TimeTest {

    public static void main(String[] args) {

        double myPoint = 98.123;
        double myTimeHour = 10;
        double myTimeMinutes = 25;
        Hemisphere myHemisphere = Hemisphere.EAST;

        double destPoint = 123.123;
        Hemisphere destHemisphere = Hemisphere.WEST;

        final int minutesPerDeg = 4;


        // Dest point: 15:40

        //1. Sprawdzamy, czy czas należy odjąć czy dodać.
        //2. Wyliczamy różnicę minut.
        //3. Wypisujemy ładną informację z godziną i minutami.

        double minuteDiff = 0.0;

        if (myHemisphere != destHemisphere) {
            destPoint *= -1;
        }

        if (myPoint > destPoint) {
            minuteDiff = (myPoint - destPoint) * 4;
        } else {
            minuteDiff = (destPoint - myPoint) * 4;
        }

        double myMinutes = myTimeHour * 60 + myTimeMinutes;
        double destMinutes = myMinutes + minuteDiff;

        int destTimeHour = (int) destMinutes / 60;
        int destTimeMinutes = (int) destMinutes % 60;
    }

    enum Hemisphere {
        WEST, EAST
    }

}
