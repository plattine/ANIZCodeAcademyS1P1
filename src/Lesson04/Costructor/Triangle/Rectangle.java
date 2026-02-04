package Lesson04.Costructor.Triangle;

public class Rectangle {

    double sideA;
    double sideB;


    public Rectangle(double a, double b) {

        this.sideA =a;
        this.sideB =b;

    }

    public double getPerimeter() {

        return sideA + sideB;
    }

    public double getArea() {

        return sideA * sideB;
    }

    public void showInfo() {
        System.out.println("Rectangle Side A:" + sideA + ", Side B:" + sideB);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }





}

