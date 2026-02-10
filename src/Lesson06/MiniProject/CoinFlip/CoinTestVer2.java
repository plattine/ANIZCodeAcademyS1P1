package Lesson06.MiniProject.CoinFlip;

// CoinTest.java
public class CoinTestVer2 {
    public static void main(String[] args) {
        CoinVer2 myCoin = new CoinVer2();
        int headsCount = 0;
        int tailsCount = 0;

        // Kaste mønten 5 gange
        for (int i = 1; i <= 5; i++) {
            myCoin.flip();
            System.out.println("Flip " + i + ": " + myCoin);

            // Tæl resultater
            if (myCoin.getSide().equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Print opsummering
        System.out.println("\nSummary:");
        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);
    }
}

