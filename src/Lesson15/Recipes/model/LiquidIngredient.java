package Lesson15.Recipes.model;


/*
 Represents liquid ingredients.
 Demonstrates specialized behavior.
*/

public class LiquidIngredient extends Ingredient {

    public LiquidIngredient(String name, double amount, Unit unit) {
        super(name, amount, unit);
    }

    @Override
    public String formatForShoppingList() {

        // Example of behavior specific to liquids
        if (getUnit() == Unit.ML && getAmount() >= 1000) {
            return getName() + " - " + (getAmount() / 1000) + " L";
        }

        return getName() + " - " + getAmount() + " " + getUnit();
    }
}
