package Lesson04.Conditionals;

import java.util.Scanner;

public class TivoliRideTestScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TivoliRide ride = new TivoliRide(140); // minimumshøjde 140 cm

        System.out.print("Indtast din højde i cm: ");
        int height = scanner.nextInt();

        check(ride, height);

        scanner.close();

    }

    public static void check(TivoliRide ride, int height) {
        ride.checkHeight(height); // Test
    }
}

