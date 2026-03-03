package Lesson15.WritingStringToTextFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleFileWriterAndScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long startTime = System.nanoTime();

        try {
            FileWriter writer = new FileWriter("exampleFileWriterAndScanner.txt");

            System.out.print("Skriv dit navn: ");
            String navn = scanner.nextLine();

            System.out.print("Skriv din alder: ");
            String alder = scanner.nextLine();

            writer.write("Navn: " + navn + "\n");
            writer.write("Alder: " + alder + "\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("CPU tid (nanosekunder): " + (endTime - startTime));

        scanner.close();
    }
}