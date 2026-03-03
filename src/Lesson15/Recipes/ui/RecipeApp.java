package Lesson15.Recipes.ui;


import Lesson15.Recipes.model.Ingredient;
import Lesson15.Recipes.service.*;

import java.util.ArrayList;
import java.util.Scanner;

/*
 UI layer.
 Handles user interaction only.
*/

public class RecipeApp {

    public static void main(String[] args) {

        RecipeFileHandlerVer1 handler = new RecipeFileHandlerVer1();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> recipes = handler.getRecipeNames();

        System.out.println("Available recipes:");

        for (int i = 0; i < recipes.size(); i++) {
            System.out.println((i + 1) + ". " + recipes.get(i));
        }

        System.out.print("Choose a recipe number: ");
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= recipes.size()) {

            String selectedRecipe = recipes.get(choice - 1);

            ArrayList<Ingredient> ingredients =
                    handler.loadRecipe(selectedRecipe);

            handler.writeShoppingList(ingredients);

            System.out.println("Shopping list created successfully.");

        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}