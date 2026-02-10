package Lesson06.ClassDesign;

public class Tomato {
    private double weight;
    private String ripeness;

    public Tomato() {
        this.weight = 65.0;
        this.ripeness = "ripe";

    }

    public Tomato(String ripeness, double weight) {
        this.weight = weight;
        this.ripeness = ripeness;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRipeness() {
        return ripeness;
    }

    public void setRipeness(String ripeness) {
        this.ripeness = ripeness;
    }

    public String toString() {
        return "Tomato [ripeness=" + ripeness + ", weight=" + weight + "g]";
    }


}
