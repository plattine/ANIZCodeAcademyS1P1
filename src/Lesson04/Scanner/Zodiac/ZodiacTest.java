package Lesson04.Scanner.Zodiac;

import java.util.Scanner;
// We import Scanner so we can read input from the keyboard

/**
 * ZodiacTest
 * This class is used to TEST the ZodiacSign class
 * It contains the main method, which is the starting point of the program
 */
public class ZodiacTest {

    public static void main(String[] args) {

        // Create a Scanner object
        // This allows the program to read input from the user


        // Print a title to the user
        System.out.println("Which zodiac sign are you?");

        // Ask the user to enter their birth day
        System.out.print("Enter your birth day: ");

        // Read an integer from the keyboard and store it in the variable 'day'


        // Ask the user to enter their birth month
        System.out.print("Enter your birth month: ");

        // Read an integer from the keyboard and store it in the variable 'month'


        // Create an object of the ZodiacSign class
        // We send 'day' and 'month' to the constructor


        // Call the getZodiacSign() method on the object
        // The method returns a String with the zodiac sign


        // Print the result to the user


        // Close the scanner
        // This is good practice to free system resources

    }
}
