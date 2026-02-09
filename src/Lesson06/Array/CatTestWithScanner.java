package Lesson06.Array;

// CatTest.java
import java.util.Scanner;

public class CatTestWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Spørg hvor mange katte der skal laves
        System.out.print("How many cats would you like to register? ");
        int numberOfCats = scanner.nextInt();
        scanner.nextLine(); // "spiser" linjeskift efter nextInt()

        // Opret array af katte
        Cat[] cats = new Cat[numberOfCats];

        // Spørg om navne og opret katte
        for (int i = 0; i < numberOfCats; i++) {
            System.out.print("Enter name for cat " + (i + 1) + ": ");
            String name = scanner.nextLine();
            cats[i] = new Cat(name);
        }

        // Vis kattene med handlinger
        System.out.println("\nHere are your cats in action:");
        for (Cat cat : cats) {
            cat.eat();
            cat.chaseMouse();
            cat.sleep();
            System.out.println();
        }

        scanner.close();
    }
}

