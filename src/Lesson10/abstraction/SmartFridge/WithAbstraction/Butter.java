package Lesson10.abstraction.SmartFridge.WithAbstraction;

public class Butter extends Product {

    public Butter(String name, int expiryDays) {
        super(name, expiryDays);
    }

    public void spreadOnBread() {
        System.out.println(getName() + " is being spread on bread 🥖");
    }

    @Override
    public void useProduct() {
        spreadOnBread();
    }

    @Override
    public String toString() {
        return "Butter 🧈 | " + super.toString();
    }
}
