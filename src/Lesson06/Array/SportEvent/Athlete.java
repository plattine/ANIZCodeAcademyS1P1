package Lesson06.Array.SportEvent;

public class Athlete {
    // Attribut
    private String name;

    // Konstruktør
    public Athlete(String name) {
        this.name = name;
    }

    // Metoder
    public void warmUp() {
        System.out.println(name + " warms up before the competition.");
    }

    public void compete() {
        System.out.println(name + " competes in the event.");
    }

    public void celebrate() {
        System.out.println(name + " celebrates their achievement with a smile.");
    }
}
