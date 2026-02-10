package Lesson06.Array;

// CatTest.java
public class CatTest {
    public static void main(String[] args) {
        // Lav et array af katte
        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Luna");
        cats[1] = new Cat("Simba");
        cats[2] = new Cat("Milo");

        // Brug arrayet til at kalde metoder
        for (Cat cat : cats) {
            cat.eat();
            cat.chaseMouse();
            cat.sleep();
            System.out.println(); // tom linje for bedre læsbarhed
        }
    }
}
