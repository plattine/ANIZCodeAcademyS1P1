package Lesson17.GuineaFarm.model;

public class ShowGuineaPig extends GuineaPig {

    private int competitionScore;

    public ShowGuineaPig(String name, int age, double weight,
                         Color color, Breed breed,
                         int competitionScore) {

        super(name, age, weight, breed, color);
        this.competitionScore = competitionScore;
    }

    public int getCompetitionScore() {
        return competitionScore;
    }

    @Override
    public String getDescription() {

        return "Show Guinea Pig: " + getName() +
                " | Age: " + getAge() +
                " | Weight: " + getWeight() +
                " | Breed: " + getBreed() +
                " | Score: " + competitionScore;
    }
}