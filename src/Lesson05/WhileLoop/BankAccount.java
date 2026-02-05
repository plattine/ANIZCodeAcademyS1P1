package Lesson05.WhileLoop;


import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdrawLoop() {
        Scanner sc = new Scanner(System.in);

        while (balance > 0) {
            System.out.println("Balance: " + balance);
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                System.out.println("Not enough money!");
            } else {
                balance -= amount;
            }
        }

        System.out.println("Account empty! ❌");
        sc.close();
    }
}

