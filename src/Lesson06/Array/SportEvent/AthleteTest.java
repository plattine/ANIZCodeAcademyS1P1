package Lesson06.Array.SportEvent;

public class AthleteTest {
    public static void main(String[] args) {
        // Opret array af athletes
        Athlete[] athletes = new Athlete[3];

        athletes[0] = new Athlete("Alex");
        athletes[1] = new Athlete("Maria");
        athletes[2] = new Athlete("Jonas");

        // Brug for-each loop til at kalde metoder
        for (Athlete a : athletes) {
            a.warmUp();
            a.compete();
            a.celebrate();
            System.out.println(); // tom linje mellem hver athlete
        }
    }
}
