package Lesson19.MoccaMasterSolution.model;


/*
 CoffeeDrink arver fra Drink.

 Det betyder at den automatisk får:
  - type
  - size
  - whippedCream
*/

public class CoffeeDrink extends Drink {

    // Constructor kalder superklassens constructor
    public CoffeeDrink(DrinkType type, Size size){

        // espresso har ikke flødeskum
        super(type, size, false);
    }

    // Implementation af abstrakt metode
    @Override
    public String prepare(){

        return "Preparing coffee: " + getType();
    }
}