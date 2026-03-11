package Lesson18.FriendsSystem.service;

import Lesson18.FriendsSystem.model.Friend;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FriendFileHandler {

    public void saveFriends(ArrayList<Friend> friends, String fileName) {

        if (friends == null) {
            throw new IllegalArgumentException("Friend list cannot be null.");
        }

        BufferedWriter writer = null;

        try {

            writer = new BufferedWriter(new FileWriter(fileName));

            for (Friend friend : friends) {

                if (friend == null) {
                    throw new NullPointerException("Friend object is null.");
                }

                writer.write(friend.toCSV());
                writer.newLine();
            }

            System.out.println("Friends successfully saved to CSV file.");

        }

        catch (FileNotFoundException e) {

            System.out.println("Error: File could not be created or found.");
            e.printStackTrace();

        }

        catch (SecurityException e) {

            System.out.println("Error: Program does not have permission to write the file.");
            e.printStackTrace();

        }

        catch (IOException e) {

            System.out.println("Error while writing to file.");
            e.printStackTrace();

        }

        catch (NullPointerException e) {

            System.out.println("Error: One of the friend objects was null.");
            e.printStackTrace();

        }

        catch (IllegalArgumentException e) {

            System.out.println("Error: Invalid argument provided.");
            e.printStackTrace();

        }

        catch (Exception e) {

            System.out.println("Unexpected error occurred.");
            e.printStackTrace();

        }

        finally {

            try {

                if (writer != null) {
                    writer.close();
                }

            }

            catch (IOException e) {

                System.out.println("Error closing the file.");
                e.printStackTrace();

            }
        }
    }
}