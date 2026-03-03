package Lesson15.ReadingFromFile;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadPerformanceTest {

    public static void main(String[] args) {

        System.out.println("Starter read performance test...");
        System.out.println("----------------------------------");

        // =========================
        // 1️⃣ FileReader (tegn for tegn)
        // =========================
        long startFileReader = System.nanoTime();

        try {
            FileReader reader = new FileReader("eventyr.txt");

            int character;
            while ((character = reader.read()) != -1) {
                // Vi læser men printer ikke (for performance)
                char c = (char) character;
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endFileReader = System.nanoTime();
        long fileReaderTime = endFileReader - startFileReader;

        System.out.println("FileReader tid (nanosekunder): " + fileReaderTime);


        // =========================
        // 2️⃣ FileReader + Scanner
        // =========================
        long startScanner = System.nanoTime();

        try {
            FileReader reader = new FileReader("eventyr.txt");
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
            }

            scanner.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endScanner = System.nanoTime();
        long scannerTime = endScanner - startScanner;

        System.out.println("Scanner tid (nanosekunder): " + scannerTime);


        // =========================
        // 3️⃣ BufferedReader
        // =========================
        long startBuffered = System.nanoTime();

        try {
            FileReader reader = new FileReader("eventyr.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // læser linje for linje
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endBuffered = System.nanoTime();
        long bufferedTime = endBuffered - startBuffered;

        System.out.println("BufferedReader tid (nanosekunder): " + bufferedTime);

        System.out.println("----------------------------------");

        // =========================
        // 4️⃣ Sammenligning
        // =========================
        System.out.println("Hurtigste metode:");

        long fastest = Math.min(fileReaderTime,
                Math.min(scannerTime, bufferedTime));

        if (fastest == fileReaderTime) {
            System.out.println("FileReader");
        } else if (fastest == scannerTime) {
            System.out.println("Scanner");
        } else {
            System.out.println("BufferedReader");
        }
    }
}