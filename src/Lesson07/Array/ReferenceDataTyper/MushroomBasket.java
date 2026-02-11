package Lesson07.Array.ReferenceDataTyper;

// Main-klasse
public class MushroomBasket {
    public static void main(String[] args) {
        // Array af svampe
        Mushroom[] basket = new Mushroom[5];
        basket[0] = new Mushroom("Champignon", "Hvid");
        basket[1] = new Mushroom("Portobello", "Brun");
        basket[2] = new Mushroom("Østershat", "Grå");
        basket[3] = new Mushroom("Rød fluesvamp", "Rød");


        // Udskriv alle svampe med toString()
        System.out.println("Svampe i kurven:");
        for (Mushroom m : basket) {
            System.out.println(m); // automatisk kalder toString()
        }

        System.out.println();

        // Demonstrer equals()
        Mushroom checkMushroom = new Mushroom("Portobello", "Brun");
        if (basket[1].equals(checkMushroom)) {
            System.out.println("The third mushroom matches Portobello (Brun)! ");
        } else {
            System.out.println("The third mushroom does not match.");
        }

        // Eksempel på ikke-match
        Mushroom wrongMushroom = new Mushroom("Champignon", "Brun");
        if (basket[1].equals(wrongMushroom)) {
            System.out.println("Match!");
        } else {
            System.out.println("The third mushroom does not match Champignon (Brun). ");
        }
    }
}