package Lesson06.MiniProject.CoinFlip;

// CoinTest.java
public class CoinTestVer4 {
    public static void main(String[] args) {
        CoinVer4 myCoin = new CoinVer4();
        int headsCount = 0;
        int tailsCount = 0;
        int totalFlips = 0;

        // Kaster mønten indtil vi har 5 Heads
        while (headsCount < 5) {
            myCoin.flip();
            totalFlips++;
            System.out.println("Flip " + totalFlips + ": " + myCoin);

            // Brug switch til at opdatere tællere
            switch (myCoin.getSide()) {
                case "Heads":
                    headsCount++;
                    break;
                case "Tails":
                    tailsCount++;
                    break;
                default:
                    System.out.println("Unknown result!");
            }
        }

        // Opsummering
        System.out.println("\nFinished!");
        System.out.println("Total flips: " + totalFlips);
        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);
    }
}
