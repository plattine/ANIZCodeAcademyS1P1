package Lesson04.Costructor;

public class Rectangle {
    // attributes (fields)
    double length;
    double width;

    // constructor
    public Rectangle(double minlength, double minwidth) {
        this.length = minlength;
        this.width = minwidth;
    }

    // method: calculate perimeter (omkreds)
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // method: calculate area (areal)
    public double getArea() {
        return length * width;
    }

    // method: show info
    public void showInfo() {
        System.out.println("Rectangle: length = " + length + ", width = " + width);
        System.out.println("Perimeter = " + getPerimeter());
        System.out.println("Area = " + getArea());
    }
}
