package Lesson16.SortAListOfStrings;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleSortExample {

    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();

        movies.add("Inception");
        movies.add("Avatar");
        movies.add("The Matrix");
        movies.add("Interstellar");

        System.out.println("Before sorting:");
        System.out.println(movies);

        Collections.sort(movies);

        System.out.println("After sorting:");
        System.out.println(movies);
    }
}