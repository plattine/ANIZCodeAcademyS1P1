package Lesson15.ReadingFromFile;


import java.io.FileReader;
import java.io.IOException;

public class ExampleFileRead {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        try {
            FileReader reader = new FileReader("eventyr.txt");

            int character;

            while ((character = reader.read()) != -1) {
                char c = (char) character;
                // System.out.print(c);  // Undlad print for korrekt performance-måling
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("FileReader CPU tid (nanosekunder): " + duration);
    }
}