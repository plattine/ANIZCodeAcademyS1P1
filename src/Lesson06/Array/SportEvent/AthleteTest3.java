package Lesson06.Array.SportEvent;

import java.util.Scanner;

public class AthleteTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hvor mange athletes vil du oprette? ");
        int antal = sc.nextInt();
        sc.nextLine(); // ryd buffer

        Athlete2[] athletes = new Athlete2[antal];

        for (int i = 0; i < antal; i++) {
            System.out.print("Indtast navn på athlete #" + (i+1) + ": ");
            String name = sc.nextLine();

            System.out.print("Indtast sport for " + name + ": ");
            String sport = sc.nextLine();

            athletes[i] = new Athlete2(name, sport);
            System.out.println();
        }

        System.out.println("=== START EVENT ===\n");

        for (Athlete2 a : athletes) {
            a.warmUp();
            a.compete();
            a.celebrate();
            System.out.println();
        }

        sc.close();
    }
}
