package Lesson06.MiniProject.CoinFlip;

// CoinTest.java
public class CoinTestVer3 {
    public static void main(String[] args) {
        CoinVer3 myCoin = new CoinVer3();
        int headsCount = 0;
        int tailsCount = 0;
        int totalFlips = 0;

        // Kaster mønten indtil vi har 5 Heads
        while (headsCount < 5) {
            myCoin.flip();
            totalFlips++;
            System.out.println("Flip " + totalFlips + ": " + myCoin);

            if (myCoin.getSide().equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Opsummering
        System.out.println("\nFinished!");
        System.out.println("Total flips: " + totalFlips);
        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);
    }
}
