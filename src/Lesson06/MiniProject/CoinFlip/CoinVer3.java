package Lesson06.MiniProject.CoinFlip;

// Coin.java
import java.util.Random;

public class CoinVer3 {
    private String side; // "Heads" eller "Tails"
    private Random random;

    // Constructor
    public CoinVer3() {
        this.random = new Random();
        this.side = "Heads"; // default
    }

    // Metode til at kaste mønten
    public void flip() {
        int result = random.nextInt(2); // 0 eller 1
        if (result == 0) {
            side = "Heads";
        } else {
            side = "Tails";
        }
    }

    // Getter for side
    public String getSide() {
        return side;
    }

    @Override
    public String toString() {
        return side;
    }
}

