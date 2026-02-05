package Lesson05.WhileLoop;


import java.util.Random;

public class Dice6 {
    private Random rand = new Random();

    public void rollUntilSix() {
        int roll = 0;
        while (roll != 6) {
            roll = rand.nextInt(6) + 1;
            System.out.println("Rolled: " + roll);
        }
        System.out.println("Finally got a SIX! 🎉");
    }
}

