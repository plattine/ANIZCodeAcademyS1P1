package Lesson04.Scanner;

import java.util.Scanner;

public class EvenOddCheckTest02 {

    // a separate method (called from main)
    public static void runProgram() {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv et tal: ");
        int number = input.nextInt();

        EvenOddCheck checker = new EvenOddCheck(number);
        checker.printResult();

        input.close();
    }

    public static void main(String[] args) {
        runProgram(); // <-- main just calls this method
    }
}
