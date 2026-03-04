package Lesson16.SortClass;

import java.util.ArrayList;
import java.util.Collections;

public class SortMovies {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception"));
        movies.add(new Movie("Avatar"));
        movies.add(new Movie("The Matrix"));
        movies.add(new Movie("Interstellar"));

        System.out.println("Before sorting:");
        System.out.println(movies);

        Collections.sort(movies);

        System.out.println("After sorting:");
        System.out.println(movies);
    }
}