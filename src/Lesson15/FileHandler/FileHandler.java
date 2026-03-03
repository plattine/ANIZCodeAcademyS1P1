package Lesson15.FileHandler;

import java.io.*;
import java.time.Instant;

public class FileHandler {
    private String filnavn;

    public FileHandler(String filnavn) {
        this.filnavn = filnavn;
    }

    // Skriver (overskriver alt indhold)
    public void skrivMaalOverskriv(String tekst) {
        try (FileWriter fw = new FileWriter(filnavn)) {
            fw.write("Vi har lært i dag:  "+ tekst + System.lineSeparator() );
            File folder = new File("..\\..\\");
            File[] listOfFiles = folder.listFiles();
            System.out.println("Skrevet (overskrevet) til filen.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Tilføjer i bunden af filen
    public void tilfoejTilFilen(String tekst) {
        try (FileWriter fw = new FileWriter(filnavn, true)) {
            fw.write("Min delmål er: " + tekst + System.lineSeparator() );
            System.out.println("Tilføjet til filen.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Læser filen linje for linje
    public void læsFil() {
        System.out.println("Læs fra en fil:");
        try (BufferedReader br = new BufferedReader(new FileReader(filnavn))) {
            String line;
            System.out.println("Indhold af " + filnavn + ":");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Kunne ikke læse filen.");
            e.printStackTrace();
        }
    }
}
