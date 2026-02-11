package Lesson07.DesignAClass;

public class GameDemo {

    public static void main(String[] args) {

        // Create objects using the empty constructors
        ChessGame chess1 = new ChessGame();
        GoGame go1 = new GoGame();

        // Create objects using constructors with parameters
        ChessGame chess2 = new ChessGame("Magnus", "Hikaru", 42);
        GoGame go2 = new GoGame("Lee Sedol", "AlphaGo", 19);

        // Print objects (toString is called automatically)
        System.out.println(chess1);
        System.out.println(go1);

        System.out.println();

        System.out.println(chess2);
        System.out.println(go2);

        System.out.println();

        // Change some values using setters
        chess1.setPlayerOne("Beginner Bob");
        chess1.setPlayerTwo("AI Bot");
        chess1.setNumberOfMoves(5);

        go1.setBlackPlayer("Student");
        go1.setWhitePlayer("Teacher");
        go1.setBoardSize(9);

        // Fun output after changes
        System.out.println("After some dramatic moves...");
        System.out.println(chess1);
        System.out.println(go1);
    }
}
