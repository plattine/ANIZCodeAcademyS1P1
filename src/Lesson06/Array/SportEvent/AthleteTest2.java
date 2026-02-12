package Lesson06.Array.SportEvent;

public class AthleteTest2 {
    public static void main(String[] args) {
        Athlete2[] athletes = new Athlete2[3];

        athletes[0] = new Athlete2("Alex", "Skiing");
        athletes[1] = new Athlete2("Maria", "Snowboarding");
        athletes[2] = new Athlete2("Jonas", "Shooting");

        for (Athlete2 a : athletes) {
            a.warmUp();
            a.compete();
            a.celebrate();
            System.out.println(); // tom linje mellem hver athlete
        }
    }
}
