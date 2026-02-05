package Lesson05.WhileLoop;

public class SheepCounter {
    private int sheep;

    public SheepCounter(int sheep) {
        this.sheep = sheep;
    }

    public void countSheep() {
        int i = 1;
        while (i <= sheep) {
            System.out.println("Sheep number " + i + " 🐑");
            i++;
        }
        System.out.println("You fall asleep... 😴");
    }
}
