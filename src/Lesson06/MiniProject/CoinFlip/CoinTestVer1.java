package Lesson06.MiniProject.CoinFlip;

public class CoinTestVer1 {

        public static void main(String[] args) {
            // Opret Coin objekt
            CoinVer1 myCoin = new CoinVer1();

            // Kaste mønten flere gange
            for (int i = 1; i <= 5; i++) {
                myCoin.flip();
                System.out.println("Flip " + i + ": " + myCoin);
            }
        }
    }


