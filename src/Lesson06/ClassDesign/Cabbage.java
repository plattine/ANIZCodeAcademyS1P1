package Lesson06.ClassDesign;

// Cabbage.java
public class Cabbage {
    private String type;
    private double diameter; // in cm
    private double weight; // in grams

    public Cabbage() {
        this.type = "Green";
        this.diameter = 15.0;
        this.weight = 800.0;
    }

    public Cabbage(String type, double diameter, double weight) {
        this.type = type;
        this.diameter = diameter;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cabbage [type=" + type + ", diameter=" + diameter + "cm, weight=" + weight + "g]";
    }
}
