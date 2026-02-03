package Lesson03.DotOperator;

// MovieTest.java
public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "Inception";
        m1.genre = "Sci-Fi";
        m1.rating = 9;
        m1.length = "188 min";
        m1.playIt();

        Movie m2 = new Movie();
        m2.title = "The Dark Knight";
        m2.genre = "Action";
        m2.rating = 10;
        m2.length = "176 min";
        m2.playIt();

        Movie m3 = new Movie();
        m3.title = "Frozen";
        m3.genre = "Animation";
        m3.rating = 8;
        m3.length = "101 min";
        m3.playIt();

        Movie m4 = new Movie();
        m4.title = "Spiderman 3";
        m4.genre = "Action";
        m4.rating = 7;
        m4.length = "123 min";
        m4.playIt();
    }
}
