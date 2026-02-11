package Lesson07.DesignAClass;

public class GoGame {

    // Attributes
    private String blackPlayer;
    private String whitePlayer;
    private int boardSize;

    // Empty constructor
    public GoGame() {
        this.blackPlayer = "Anonymous Black";
        this.whitePlayer = "Anonymous White";
        this.boardSize = 19; // Standard Go board
    }

    // Constructor with parameters
    public GoGame(String blackPlayer, String whitePlayer, int boardSize) {
        this.blackPlayer = blackPlayer;
        this.whitePlayer = whitePlayer;
        this.boardSize = boardSize;
    }

    // Getters
    public String getBlackPlayer() {
        return blackPlayer;
    }

    public String getWhitePlayer() {
        return whitePlayer;
    }

    public int getBoardSize() {
        return boardSize;
    }

    // Setters
    public void setBlackPlayer(String blackPlayer) {
        this.blackPlayer = blackPlayer;
    }

    public void setWhitePlayer(String whitePlayer) {
        this.whitePlayer = whitePlayer;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    // toString method
    @Override
    public String toString() {
        return "Go Game | Black: " + blackPlayer +
                ", White: " + whitePlayer +
                ", Board size: " + boardSize + "x" + boardSize;
    }
}
