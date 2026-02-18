package Lesson10.abstraction.SmartFridge.WithoutAbstraction;

public class Milk extends Product {

    public Milk(String name, int expiryDays) {
        super(name, expiryDays);
    }

    public void pourGlass() {
        System.out.println(getName() + " is poured into a glass 🥛");
    }

    @Override
    public String toString() {
        return "Milk 🥛 | " + super.toString();
    }
}
