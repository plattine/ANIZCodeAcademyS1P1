package Lesson18.FriendsSystemAdvanced.util;

import java.io.IOException;
import java.util.InputMismatchException;

public class ErrorHandler {

    public static void handleInputMismatch(InputMismatchException e) {

        System.out.println("Error: Please enter a valid number.");

    }

    public static void handleFileError(IOException e) {

        System.out.println("File error occurred.");
        e.printStackTrace();

    }

    public static void handleNullError(NullPointerException e) {

        System.out.println("Error: Null value encountered.");
        e.printStackTrace();

    }

    public static void handleUnexpectedError(Exception e) {

        System.out.println("Unexpected error occurred.");
        e.printStackTrace();

    }

}