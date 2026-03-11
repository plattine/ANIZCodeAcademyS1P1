package Lesson18.FriendsSystem.model;


public class Buddy extends Friend {

    private String hobby;

    public Buddy(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public String getType() {
        return "Buddy";
    }

    @Override
    public String toCSV() {
        return getType() + "," + getName() + "," + getAge() + "," + hobby;
    }
}