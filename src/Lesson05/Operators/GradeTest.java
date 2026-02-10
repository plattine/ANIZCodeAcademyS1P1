package Lesson05.Operators;


import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        test();
    }

    public static void test()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv din karakter (0-100): ");
        int score = input.nextInt();

        // Create Grade object
        Grade grade = new Grade(score);

        // Print result
        System.out.println("Din score: " + grade.getScore());
        System.out.println("Din karakter: " + grade.getGrade());

        input.close();
    }
}
