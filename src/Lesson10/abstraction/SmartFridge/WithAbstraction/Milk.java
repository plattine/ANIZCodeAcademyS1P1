package Lesson10.abstraction.SmartFridge.WithAbstraction;

public class Milk extends Product {

    public Milk(String name, int expiryDays) {
        super(name, expiryDays);
    }

    public void pourGlass() {
        System.out.println(getName() + " is poured into a glass 🥛");
    }

    @Override
    public void useProduct() {
        pourGlass();
    }

    @Override
    public String toString() {
        return "Milk 🥛 | " + super.toString();
    }
}
