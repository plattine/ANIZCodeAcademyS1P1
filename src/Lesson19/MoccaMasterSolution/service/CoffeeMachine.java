package Lesson19.MoccaMasterSolution.service;


import Lesson19.MoccaMasterSolution.model.*;

/*
 CoffeeMachine er en serviceklasse.

 Den indeholder logikken til at lave drikke.
*/

public class CoffeeMachine {

    public Cup serve(DrinkType type, Size size, boolean cream){

        Drink drink;

        // Hvis drikken er en chokoladedrik
        if(type == DrinkType.CHOCOLATE_DRINK
                || type == DrinkType.COCOA_MILK){

            drink = new ChocolateDrink(type, size, cream);
        }
        else{

            drink = new CoffeeDrink(type, size);
        }

        // Returner koppen
        return new Cup(drink);
    }
}