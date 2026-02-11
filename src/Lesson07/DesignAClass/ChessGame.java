package Lesson07.DesignAClass;

public class ChessGame {

    // Attributes (fields)
    private String playerOne;
    private String playerTwo;
    private int numberOfMoves;

    // Empty constructor (default constructor)
    public ChessGame() {
        this.playerOne = "Unknown";
        this.playerTwo = "Unknown";
        this.numberOfMoves = 0;
    }

    // Constructor with parameters
    public ChessGame(String playerOne, String playerTwo, int numberOfMoves) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.numberOfMoves = numberOfMoves;
    }

    // Getters
    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public int getNumberOfMoves() {
        return numberOfMoves;
    }

    // Setters
    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void setNumberOfMoves(int numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
    }

    // toString method
    @Override
    public String toString() {
        return "Chess Game between " + playerOne + " and " + playerTwo +
                " | Moves played: " + numberOfMoves;
    }
}
