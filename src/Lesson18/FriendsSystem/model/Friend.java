package Lesson18.FriendsSystem.model;

public abstract class Friend {

    private String name;
    private int age;

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getType();

    public String toCSV() {
        return getType() + "," + name + "," + age;
    }

    @Override
    public String toString() {
        return getType() + " - " + name + " (" + age + ")";
    }
}