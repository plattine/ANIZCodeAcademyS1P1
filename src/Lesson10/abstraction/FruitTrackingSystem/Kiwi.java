package Lesson10.abstraction.FruitTrackingSystem;

class Kiwi extends Fruit {

    public Kiwi(double weight) {
        super("Kiwi", weight, 610);
    }

    @Override
    public String describeTaste() {
        return "Kiwis are fresh and tangy.";
    }

    @Override
    public double calculateCalories() {
        return getWeight() * getCaloriesPerKg();
    }
}
