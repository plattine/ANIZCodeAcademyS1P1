package Lesson15.Recipes.model;


/*
 Abstract superclass.
 Encapsulates shared state and enforces polymorphic behavior.
*/

public abstract class Ingredient {

    private String name;
    private double amount;
    private Unit unit;

    public Ingredient(String name, double amount, Unit unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    // Getters and setters (encapsulation principle)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    /*
     Polymorphic method.
     Each subclass decides formatting behavior.
    */
    public abstract String formatForShoppingList();

    @Override
    public String toString() {
        return name + "," + amount + "," + unit;
    }
}