package Lesson06.ClassDesign;

// Salad.java
public class Salad {
    private String type;
    private int leaves; // number of leaves
    private double weight; // in grams

    public Salad() {
        this.type = "Lettuce";
        this.leaves = 20;
        this.weight = 200.0;
    }

    public Salad(String type, int leaves, double weight) {
        this.type = type;
        this.leaves = leaves;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Salad [type=" + type + ", leaves=" + leaves + ", weight=" + weight + "g]";
    }
}
