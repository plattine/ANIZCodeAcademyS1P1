package Lesson15.Recipes.ui;

import Lesson15.Recipes.model.Ingredient;
import Lesson15.Recipes.service.*;

        import java.util.ArrayList;
import java.util.Scanner;

/*
 UI layer.
 Handles user interaction only.
*/

public class RecipeAppBetter {

    public static void main(String[] args) {

        RecipeFileHandlerVer1 handler = new RecipeFileHandlerVer1();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> recipes = getRecipes(handler);

        printRecipes(recipes);

        int choice = getUserChoice(scanner);

        handleChoice(choice, recipes, handler);

        scanner.close();
    }

    /*
     Retrieves recipe names from file handler
    */
    private static ArrayList<String> getRecipes(RecipeFileHandlerVer1 handler) {
        return handler.getRecipeNames();
    }

    /*
     Prints available recipes
    */
    private static void printRecipes(ArrayList<String> recipes) {

        System.out.println("Available recipes:");

        for (int i = 0; i < recipes.size(); i++) {
            System.out.println((i + 1) + ". " + recipes.get(i));
        }
    }

    /*
     Gets user input
    */
    private static int getUserChoice(Scanner scanner) {

        System.out.print("Choose a recipe number: ");
        return scanner.nextInt();
    }

    /*
     Handles user selection logic
    */
    private static void handleChoice(int choice,
                                     ArrayList<String> recipes,
                                     RecipeFileHandlerVer1 handler) {

        if (choice > 0 && choice <= recipes.size()) {

            String selectedRecipe = recipes.get(choice - 1);

            ArrayList<Ingredient> ingredients =
                    handler.loadRecipe(selectedRecipe);

            handler.writeShoppingList(ingredients);

            System.out.println("Shopping list created successfully.");

        } else {
            System.out.println("Invalid choice.");
        }
    }
}