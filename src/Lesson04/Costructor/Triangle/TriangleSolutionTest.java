package Lesson04.Costructor.Triangle;

public class TriangleSolutionTest {


    public static void main(String[] args) {

        // Assignment 1: create three triangles
        TriangleSolution t1 = new TriangleSolution(3, 4, 5);
        TriangleSolution t2 = new TriangleSolution(6, 6, 6);
        TriangleSolution t3 = new TriangleSolution(5, 5, 8);

        // show info
        t1.showInfo();
        System.out.println();

        t2.showInfo();
        System.out.println();

        t3.showInfo();
        System.out.println();

        // compare areas
        TriangleSolution largest = t1;

        if (t2.getArea() > largest.getArea()) {
            largest = t2;
        }

        if (t3.getArea() > largest.getArea()) {
            largest = t3;
        }

        System.out.println("Triangle with the largest area:");
        largest.showInfo();

        // Assignment 5: test scaleTriangle
        System.out.println("\nScaling triangle t1 by factor 2:");
        t1.scaleTriangle(2);
        t1.showInfo();
    }
}
