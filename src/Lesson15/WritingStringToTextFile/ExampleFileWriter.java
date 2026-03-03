package Lesson15.WritingStringToTextFile;


import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileWriter {

    public static void main(String[] args) {

        long startTime = System.nanoTime();  // Start CPU tid

        try {
            FileWriter writer = new FileWriter("exampleFileWriter.txt");
            writer.write("Hej verden!\n");
            writer.write("Dette er en test af FileWriter.\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();  // Printer fejlen
        }

        long endTime = System.nanoTime();  // Slut CPU tid
        long duration = endTime - startTime;

        System.out.println("CPU tid (nanosekunder): " + duration);
    }
}