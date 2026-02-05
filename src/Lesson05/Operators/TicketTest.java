package Lesson05.Operators;

import java.util.Scanner;

public class TicketTest {
    public static void main(String[] args) {
        test();
    }

    public static void test()
    {
        Scanner input = new Scanner(System.in);

        // Read input
        System.out.print("Hvor gammel er du? ");
        int age = input.nextInt();

        System.out.print("Har du billet? (true/false): ");
        boolean hasTicket = input.nextBoolean();

        // Create Ticket object
        Ticket ticket = new Ticket(age, hasTicket);

        // Print result
        System.out.println(ticket.canEnter());

        input.close();
    }
}
