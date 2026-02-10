package Lesson06.ClassDesign;

// Carrot.java
public class Carrot {
    private String color;
    private double length; // in cm
    private double weight; // in grams

    // Default constructor
    public Carrot() {
        this.color = "Orange";
        this.length = 10.0;
        this.weight = 50.0;
    }

    // Constructor with parameters
    public Carrot(String color, double length, double weight) {
        this.color = color;
        this.length = length;
        this.weight = weight;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Carrot [color=" + color + ", length=" + length + "cm, weight=" + weight + "g]";
    }
}
