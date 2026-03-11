package Lesson18.FriendsSystemAdvanced.service;


import Lesson18.FriendsSystemAdvanced.model.Friend;
import Lesson18.FriendsSystemAdvanced.util.ErrorHandler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FriendFileHandler {

    public void saveFriends(ArrayList<Friend> friends, String fileName) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for (Friend friend : friends) {

                writer.write(friend.toCSV());
                writer.newLine();

            }

            writer.close();

            System.out.println("Friends saved to file.");

        }

        catch (IOException e) {

            ErrorHandler.handleFileError(e);

        }

    }

}