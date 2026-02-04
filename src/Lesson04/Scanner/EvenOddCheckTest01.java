package Lesson04.Scanner;

import java.util.Scanner;

public class EvenOddCheckTest01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv et tal: ");
        int number = input.nextInt();

        // create object
        EvenOddCheck checker = new EvenOddCheck(number);

        // use method
        checker.printResult();

        input.close();
    }
}
