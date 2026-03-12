package Lesson19.MoccaMasterSolution.model;



/*
 ChocolateDrink er en anden type drik.

 Den kan have flødeskum.
*/

public class ChocolateDrink extends Drink {

    public ChocolateDrink(DrinkType type, Size size, boolean cream){

        super(type, size, cream);
    }

    @Override
    public String prepare(){

        return "Preparing chocolate drink";
    }
}