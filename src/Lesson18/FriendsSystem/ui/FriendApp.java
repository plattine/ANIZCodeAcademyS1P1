package Lesson18.FriendsSystem.ui;


import Lesson18.FriendsSystem.model.*;
import Lesson18.FriendsSystem.service.FriendFileHandler;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FriendApp {

    private static ArrayList<Friend> friends = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static FriendFileHandler fileHandler = new FriendFileHandler();

    public static void main(String[] args) {

        runProgram();

    }

    public static void runProgram() {

        boolean running = true;

        while (running) {

            showMenu();

            try {

                int choice = getUserChoice();

                switch (choice) {

                    case 1:
                        addFamily();
                        break;

                    case 2:
                        addBuddy();
                        break;

                    case 3:
                        showFriends();
                        break;

                    case 4:
                        saveFriends();
                        break;

                    case 5:
                        exitProgram();
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid choice.");

                }

            }
            catch (InputMismatchException e) {

                System.out.println("Error: Please enter a number.");
                scanner.nextLine();

            }
            catch (Exception e) {

                System.out.println("Unexpected error.");
                e.printStackTrace();

            }

        }
    }

    public static void showMenu() {

        System.out.println("\n--- Friend System ---");
        System.out.println("1 Add family member");
        System.out.println("2 Add buddy");
        System.out.println("3 Show friends");
        System.out.println("4 Save to CSV");
        System.out.println("5 Exit");

    }

    public static int getUserChoice() {

        System.out.print("Choose option: ");
        return scanner.nextInt();

    }

    public static void addFamily() {

        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Relation: ");
        String relation = scanner.nextLine();

        friends.add(new Family(name, age, relation));

        System.out.println("Family member added.");

    }

    public static void addBuddy() {

        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Hobby: ");
        String hobby = scanner.nextLine();

        friends.add(new Buddy(name, age, hobby));

        System.out.println("Buddy added.");

    }

    public static void showFriends() {

        if (friends.isEmpty()) {

            System.out.println("No friends added.");
            return;

        }

        for (Friend friend : friends) {

            System.out.println(friend);

        }

    }

    public static void saveFriends() {

        fileHandler.saveFriends(friends, "friends.csv");

    }

    public static void exitProgram() {

        saveFriends();

        System.out.println("Program closing. Friends saved.");

        scanner.close();

    }
}