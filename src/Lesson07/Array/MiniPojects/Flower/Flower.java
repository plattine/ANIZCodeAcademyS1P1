package Lesson07.Array.MiniPojects.Flower;

public class Flower {

    private String name;
    private double price;
    private char colorCode; // fx R = red, Y = yellow, W = white

    public Flower(String name, double price, char colorCode) {
        this.name = name;
        this.price = price;
        this.colorCode = colorCode;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public char getColorCode() {
        return colorCode;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return "Flower{name='" + name +
                "', price=" + price +
                ", color=" + colorCode + "}";
    }
}
