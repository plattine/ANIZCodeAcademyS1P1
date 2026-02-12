package Lesson07.Array.ReferenceDataTyper;

public class MushroomBasketSolution {
    public static void main(String[] args) {
        // Step 1: Original basket
        Mushroom[] basket = new Mushroom[4]; // increase size to 4
        basket[0] = new Mushroom("Champignon", "Hvid");
        basket[1] = new Mushroom("Portobello", "Brun");
        basket[2] = new Mushroom("Østershat", "Grå");
        basket[3] = new Mushroom("Rød fluesvamp", "Rød");
        basket[4] = new Mushroom("Shiitake", "Brun"); // added new mushroom


        // Step 2: Print all mushrooms
        System.out.println("All mushrooms in the basket:");
        for (Mushroom m : basket) {
            System.out.println(m);
        }

        System.out.println();

        // Step 3: Check if "Østershat" exists
        Mushroom checkMushroom = new Mushroom("Østershat", "Grå");
        boolean found = false;
        for (Mushroom m : basket) {
            if (m.equals(checkMushroom)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }

        System.out.println();

        // Step 4: Print only mushrooms with color "Brun"
        System.out.println("Mushrooms with color Brun:");
        for (Mushroom m : basket) {
            if (m.getColor().equals("Brun")) {
                System.out.println(m);
            }
        }
    }
}
