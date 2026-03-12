package Lesson19.MoccaMasterSolution.file;

import Lesson19.MoccaMasterSolution.model.*;
import Lesson19.MoccaMasterSolution.util.ExceptionHandler;

import java.io.*;
import java.util.ArrayList;

/*
 FileHandler håndterer alle filoperationer.

 Den læser og skriver CSV filer.
*/

public class FileHandler {

    public static void writeOrders(String filename, ArrayList<Cup> cups){

        try{

            // Opret writer til filen
            PrintWriter writer =
                    new PrintWriter(new FileWriter(filename));

            // Loop gennem alle kopper
            for(Cup cup : cups){

                // skriv CSV linje
                writer.println(
                        cup.getDrink().getType() + "," +
                                cup.getDrink().getSize() + "," +
                                cup.getDrink().hasWhippedCream()
                );
            }

            // luk filen
            writer.close();

        }
        catch(IOException e){

            ExceptionHandler.handle(
                    new ExceptionHandler.FileWriteException(
                            "Could not write file: " + filename
                    )
            );
        }
    }
}