package Lesson03.DotOperator;

// Movie.java
public class Movie {
    String title;
    String genre;
    String length;
    int rating;

    void playIt() {

        System.out.println("Playing the movie: " + title + " (" + genre + ") - Rating: " + rating +"," + " Length" + length);
    }
}