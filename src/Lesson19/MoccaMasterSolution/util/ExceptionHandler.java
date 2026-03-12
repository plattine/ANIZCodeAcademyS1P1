package Lesson19.MoccaMasterSolution.util;


/*
 Denne klasse samler alle exceptions ét sted.

 Den indeholder også specialiserede exceptions
 til filhåndtering.
*/

public class ExceptionHandler {

    /*
     Metode til at håndtere fejl.
     Den modtager en Exception som parameter.
    */
    public static void handle(Exception e){

        // hvis det er en FileReadException
        if(e instanceof FileReadException){

            System.out.println("Error reading file:");
            System.out.println(e.getMessage());
        }

        // hvis det er en FileWriteException
        else if(e instanceof FileWriteException){

            System.out.println("Error writing file:");
            System.out.println(e.getMessage());
        }

        else{

            System.out.println("Unexpected error:");
            System.out.println(e.getMessage());
        }
    }

    /*
     Custom exception for fil-læsning
    */
    public static class FileReadException extends Exception{

        public FileReadException(String message){
            super(message);
        }
    }

    /*
     Custom exception for fil-skrivning
    */
    public static class FileWriteException extends Exception{

        public FileWriteException(String message){
            super(message);
        }
    }
}