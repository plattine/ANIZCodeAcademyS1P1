package Lesson15.FileHandler;

public class FileHandlerTest {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler("src\\Lesson15\\FileHandler\\notesLesson15.txt");

        // 1. Overskriv med et mål
        fh.skrivMaalOverskriv("Lær filhåndtering i Java");

        // 2. Tilføj flere mål
        fh.tilfoejTilFilen("Bliv bedre til OOP");
        fh.tilfoejTilFilen("Brug FileWriter og FileReader");

        // 3. Læs alt indhold af filen
        fh.læsFil();
    }
}
