package Lesson19.MoccaMasterSolution.model;


/*
 Drink er en abstrakt klasse.

 Det betyder:
 - Man kan ikke lave new Drink()
 - Den bruges som superklasse for andre drikke

 Dette er et eksempel på ARV (inheritance)
*/

public abstract class Drink {

    // Type af drik (espresso, latte osv.)
    private DrinkType type;

    // Størrelse på drikken
    private Size size;

    // Om der er flødeskum
    private boolean whippedCream;

    // Constructor bruges når objektet oprettes
    public Drink(DrinkType type, Size size, boolean whippedCream){

        // Gem værdier i objektets variabler
        this.type = type;
        this.size = size;
        this.whippedCream = whippedCream;
    }

    // Getter metode der returnerer typen
    public DrinkType getType(){
        return type;
    }

    // Getter for størrelse
    public Size getSize(){
        return size;
    }

    // Returnerer om der er flødeskum
    public boolean hasWhippedCream(){
        return whippedCream;
    }

    /*
     Abstrakt metode.

     Alle underklasser SKAL implementere den.
    */
    public abstract String prepare();
}