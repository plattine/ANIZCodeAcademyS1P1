package Lesson15.Recipes.model;


/*
 Represents solid ingredients.
 Demonstrates inheritance and polymorphism.
*/

public class SolidIngredient extends Ingredient {

    public SolidIngredient(String name, double amount, Unit unit) {
        super(name, amount, unit);
    }

    @Override
    public String formatForShoppingList() {
        return getName() + " - " + getAmount() + " " + getUnit();
    }
}