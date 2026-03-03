package Lesson15.WritingStringToTextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleBufferedWriter {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        try {
            FileWriter fileWriter = new FileWriter("exampleBufferedFileWriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 1; i <= 10000; i++) {
                bufferedWriter.write("Linje nummer: " + i);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("CPU tid (nanosekunder): " + (endTime - startTime));
    }
}