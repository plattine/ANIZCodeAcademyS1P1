package Lesson04.Costructor.Triangle;


public class TriangleSolution {

    // attributes
    double sideA;
    double sideB;
    double sideC;

    // constructor
    public TriangleSolution(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    // calculate perimeter
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    // calculate area (Heron's formula)
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Assignment 3
    public boolean isEquilateral() {
        return sideA == sideB && sideB == sideC;
    }

    // Assignment 4
    public boolean isIsosceles() {
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }

    // Assignment 5
    public void scaleTriangle(double factor) {
        sideA = sideA * factor;
        sideB = sideB * factor;
        sideC = sideC * factor;
    }

    // show information
    public void showInfo() {
        System.out.println("Triangle sides: " + sideA + ", " + sideB + ", " + sideC);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("Is equilateral: " + isEquilateral());
        System.out.println("Is isosceles: " + isIsosceles());
    }
}

