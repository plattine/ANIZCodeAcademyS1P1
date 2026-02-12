package Lesson06.Array.SportEvent;

public class Athlete2 {
    private String name;
    private String sport; // sportstype

    public Athlete2(String name, String sport) {
        this.name = name;
        this.sport = sport;
    }

    public void warmUp() {
        switch (sport.toLowerCase()) {
            case "skiing":
                System.out.println(name + " stretches legs and skis through the snow. ⛷️");
                break;
            case "snowboarding":
                System.out.println(name + " practices flips and jumps on the snowboard. 🏂");
                break;
            case "shooting":
                System.out.println(name + " focuses eyes and practices breathing. 🎯");
                break;
            default:
                System.out.println(name + " does a general warm-up. 💪");
        }
    }

    public void compete() {
        System.out.println(name + " competes in " + sport + "!");
    }

    public void celebrate() {
        switch (sport.toLowerCase()) {
            case "skiing":
                System.out.println(name + " sips hot chocolate after skiing. ☕");
                break;
            case "snowboarding":
                System.out.println(name + " does a victory trick on the snowboard! 🏂");
                break;
            case "shooting":
                System.out.println(name + " raises the rifle proudly on the podium. 🏆");
                break;
            default:
                System.out.println(name + " celebrates with a big smile! 😄");
        }
    }
}
