package Lesson15.ReadingFromFile;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExampleFileReadScanner {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        try {
            FileReader reader = new FileReader("eventyr.txt");
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // System.out.println(line);
            }

            scanner.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Scanner CPU tid (nanosekunder): " + duration);
    }
}