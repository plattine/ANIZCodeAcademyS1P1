package Lesson03.Constructors;


public class CircleTest02 {
    public static void main(String[] args) {
        circleAreal();
    }

    public static void circleAreal()
    {
        // Opret cirkler
        Circle01 c1 = new Circle01(5);
        Circle01 c2 = new Circle01(10);
        Circle01 c3 = new Circle01(13);
        Circle01 c4 = new Circle01(20);
        Circle01 c5 = new Circle01(3);

        // Udskriv og vurder arealer
        double areal1 = c1.beregnAreal();
        double areal2 = c2.beregnAreal();
        double areal3 = c3.beregnAreal();
        double areal4 = c4.beregnAreal();
        double areal5 = c5.beregnAreal();

        System.out.println("Areal af cirkel 1: " + areal1);
        if (areal1 > 100) {
            System.out.println("Cirklen 1 er stor!");
        } else {
            System.out.println("Cirklen 1 er lille.");
        }

        System.out.println("Areal af cirkel 2: " + areal2);
        if (areal2 > 100) {
            System.out.println("Cirklen 2 er stor!");
        } else {
            System.out.println("Cirklen 2 er lille.");
        }
        System.out.println("Areal af cirkel 1: " + areal3);
        if (areal3 > 100) {
            System.out.println("Cirklen 3 er stor!");
        } else {
            System.out.println("Cirklen 3 er lille.");
        }
        System.out.println("Areal af cirkel 4: " + areal4);
        if (areal4 > 100) {
            System.out.println("Cirklen 4 er stor!");
        } else {
            System.out.println("Cirklen 4 er lille.");
        }
        System.out.println("Areal af cirkel 5: " + areal5);
        if (areal5 > 100) {
            System.out.println("Cirklen 5 er stor!");
        } else {
            System.out.println("Cirklen 5 er lille.");
        }
    }
}
