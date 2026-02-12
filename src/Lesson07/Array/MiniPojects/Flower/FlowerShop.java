package Lesson07.Array.MiniPojects.Flower;

import java.util.Arrays;

public class FlowerShop {

    public static void main(String[] args) {

        // Creating flower objects
        Flower f1 = new Flower("Rose", 25.0, 'R');
        Flower f2 = new Flower("Tulip", 15.0, 'Y');
        Flower f3 = new Flower("Lily", 30.0, 'W');
        Flower f4 = new Flower("Daisy", 10.0, 'W');

        // Creating a bouquet (array of objects)
        Flower[] bouquet = {f1, f2, f3, f4};

        System.out.println("🌼 Original bouquet:");
        displayFlowers(bouquet);

        // Sort flowers by price
        sortByPrice(bouquet);

        System.out.println("\n🌼 Bouquet sorted by price:");
        displayFlowers(bouquet);

        // Count white flowers
        int whiteCount = countColor(bouquet, 'W');
        System.out.println("\nNumber of white flowers: " + whiteCount);
    }

    // Display array of objects
    public static void displayFlowers(Flower[] flowers) {
        for (Flower f : flowers) {
            System.out.println(f);
        }
    }

    // Sort flowers by price (simple bubble sort)
    public static void sortByPrice(Flower[] flowers) {
        for (int i = 0; i < flowers.length - 1; i++) {
            for (int j = 0; j < flowers.length - 1; j++) {
                if (flowers[j].getPrice() > flowers[j + 1].getPrice()) {
                    Flower temp = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = temp;
                }
            }
        }
    }

    // Traverse and count by color
    public static int countColor(Flower[] flowers, char color) {
        int count = 0;
        for (Flower f : flowers) {
            if (f.getColorCode() == color) {
                count++;
            }
        }
        return count;
    }
}
