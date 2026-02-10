package Lesson06.ClassDesign;

// Beans.java
public class Beans {
    private String variety;
    private int pods; // number of pods
    private double length; // length of each pod in cm

    public Beans() {
        this.variety = "Green Bean";
        this.pods = 10;
        this.length = 8.0;
    }

    public Beans(String variety, int pods, double length) {
        this.variety = variety;
        this.pods = pods;
        this.length = length;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getPods() {
        return pods;
    }

    public void setPods(int pods) {
        this.pods = pods;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Beans [variety=" + variety + ", pods=" + pods + ", length=" + length + "cm]";
    }
}
