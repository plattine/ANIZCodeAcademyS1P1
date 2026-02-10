package Lesson05.Operators;



public class Grade {
    //attribute private!
    private int score;

    // Constructor
    public Grade(int score) {
        this.score = score;
    }

    // Method to determine grade
    public String getGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    // Optional getter
    public int getScore() {
        return score;
    }
}

