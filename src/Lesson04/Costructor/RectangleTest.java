package Lesson04.Costructor;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = input.nextDouble();

        // Create Rectangle object
        Rectangle rect = new Rectangle(length, width);

        // Show info
        rect.showInfo();

        input.close();
    }
}
