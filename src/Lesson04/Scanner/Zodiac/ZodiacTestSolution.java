package Lesson04.Scanner.Zodiac;

import java.util.Scanner;

/**
 * Test class
 * Asks the user for birth date and prints the zodiac sign
 */
public class ZodiacTestSolution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which zodiac sign are you?");
        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();

        System.out.print("Enter your birth month: ");
        int month = scanner.nextInt();

        // Create ZodiacSign object
        ZodiacSign zodiac = new ZodiacSign(day, month);

        // Print result
        System.out.println("Your zodiac sign is: " + zodiac.getZodiacSign());

        scanner.close();
    }
}
