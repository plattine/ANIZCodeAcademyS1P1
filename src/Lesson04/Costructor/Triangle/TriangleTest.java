package Lesson04.Costructor.Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        t1.showInfo();

        System.out.println();

        Triangle t2 = new Triangle(6, 6, 6);
        t2.showInfo();

        System.out.println();

        Triangle t3 = new Triangle(6, 5, 9);
        t3.showInfo();

        double area1 = t1.getArea();
        double area2 = t2.getArea();
        double area3 = t3.getArea();

        if (area1 >= area2 && area1 >= area3) {
            System.out.println("Triangle 1 is biggest");
        }
        else if (area2 >= area1 && area2 >= area3) {
            System.out.println("Triangle 2 is biggest");
        }
        else {
            System.out.println("Triangle 3 is biggest");
    }




    }
}