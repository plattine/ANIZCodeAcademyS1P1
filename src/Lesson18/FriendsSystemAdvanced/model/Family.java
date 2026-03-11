package Lesson18.FriendsSystemAdvanced.model;

public class Family extends Friend {

    private String relation;

    public Family(String name, int age, String relation) {
        super(name, age);
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    @Override
    public String getType() {
        return "Family";
    }

    @Override
    public String toCSV() {
        return getType() + "," + getName() + "," + getAge() + "," + relation;
    }
}