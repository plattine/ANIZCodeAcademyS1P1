package Lesson10.abstraction.SmartFridge.WithoutAbstraction;

public class Fruit extends Product {

    public Fruit(String name, int expiryDays) {
        super(name, expiryDays);
    }

    public void makeJuice() {
        System.out.println(getName() + " is turned into juice 🧃");
    }

    @Override
    public String toString() {
        return "Fruit 🍎 | " + super.toString();
    }
}
