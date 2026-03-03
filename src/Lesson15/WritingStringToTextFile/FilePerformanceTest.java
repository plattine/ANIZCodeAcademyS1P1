package Lesson15.WritingStringToTextFile;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FilePerformanceTest {

    public static void main(String[] args) {

        int antalLinjer = 100000;

        System.out.println("Starter performance test...");
        System.out.println("Antal linjer: " + antalLinjer);
        System.out.println("----------------------------------");

        // Test 1: Almindelig FileWriter
        long startFileWriter = System.nanoTime();

        try {
            FileWriter writer = new FileWriter("filewriter.txt");

            for (int i = 1; i <= antalLinjer; i++) {
                writer.write("Linje nummer: " + i + "\n");
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endFileWriter = System.nanoTime();
        long fileWriterTime = endFileWriter - startFileWriter;

        System.out.println("FileWriter tid (nanosekunder): " + fileWriterTime);

        // Test 2: BufferedWriter
        long startBuffered = System.nanoTime();

        try {
            FileWriter fw = new FileWriter("bufferedwriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fw);

            for (int i = 1; i <= antalLinjer; i++) {
                bufferedWriter.write("Linje nummer: " + i);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endBuffered = System.nanoTime();
        long bufferedTime = endBuffered - startBuffered;

        System.out.println("BufferedWriter tid (nanosekunder): " + bufferedTime);

        System.out.println("----------------------------------");

        // Sammenligning
        if (bufferedTime < fileWriterTime) {
            System.out.println("BufferedWriter er hurtigere.");
        } else {
            System.out.println("FileWriter er hurtigere.");
        }

        System.out.println("Forskel (nanosekunder): " + Math.abs(fileWriterTime - bufferedTime));
    }
}