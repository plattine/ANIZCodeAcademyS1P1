package Lesson04.Costructor.Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        t1.showInfo();

        System.out.println();

        Triangle t2 = new Triangle(6, 6, 6);
        t2.showInfo();
    }
}