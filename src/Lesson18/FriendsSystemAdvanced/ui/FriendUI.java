package Lesson18.FriendsSystemAdvanced.ui;

import Lesson18.FriendsSystemAdvanced.model.*;
import Lesson18.FriendsSystemAdvanced.service.FriendFileHandler;
import Lesson18.FriendsSystemAdvanced.util.ErrorHandler;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FriendUI {

    private ArrayList<Friend> friends = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private FriendFileHandler fileHandler = new FriendFileHandler();

    public void start() {

        boolean running = true;

        while (running) {

            showMenu();

            try {

                int choice = scanner.nextInt();

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

                ErrorHandler.handleInputMismatch(e);
                scanner.nextLine();

            }
            catch (Exception e) {

                ErrorHandler.handleUnexpectedError(e);

            }

        }

    }

    private void showMenu() {

        System.out.println("\n--- Friend System ---");
        System.out.println("1 Add family member");
        System.out.println("2 Add buddy");
        System.out.println("3 Show friends");
        System.out.println("4 Save to CSV");
        System.out.println("5 Exit");

        System.out.print("Choose option: ");

    }

    private void addFamily() {

        try {

            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Relation: ");
            String relation = scanner.nextLine();

            friends.add(new Family(name, age, relation));

        }
        catch (Exception e) {

            ErrorHandler.handleUnexpectedError(e);

        }

    }

    private void addBuddy() {

        try {

            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Hobby: ");
            String hobby = scanner.nextLine();

            friends.add(new Buddy(name, age, hobby));

        }
        catch (Exception e) {

            ErrorHandler.handleUnexpectedError(e);

        }

    }

    private void showFriends() {

        if (friends.isEmpty()) {

            System.out.println("No friends added.");
            return;

        }

        for (Friend friend : friends) {

            System.out.println(friend);

        }

    }

    private void saveFriends() {

        fileHandler.saveFriends(friends, "friends.csv");

    }

    private void exitProgram() {

        saveFriends();
        System.out.println("Friends saved. Program closing.");

    }

}