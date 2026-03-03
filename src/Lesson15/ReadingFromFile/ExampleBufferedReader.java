package Lesson15.ReadingFromFile;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ExampleBufferedReader {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        try {
            FileReader reader = new FileReader("eventyr.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("BufferedReader CPU tid (nanosekunder): " + duration);
    }
}