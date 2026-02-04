package Lesson04.Scanner;


public class EvenOddCheck {
    private int number;

    // constructor
    public EvenOddCheck(int number) {
        this.number = number;
    }

    // method: check if even
    public boolean isEven() {
        return number % 2 == 0;
    }

    // method: check if odd
    public boolean isOdd() {
        return !isEven();
    }

    // method: print result
    public void printResult() {
        if (isEven()) {
            System.out.println(number + " er et lige tal.");
        } else {
            System.out.println(number + " er et ulige tal.");
        }
    }
}
