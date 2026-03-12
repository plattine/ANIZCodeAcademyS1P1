package Lesson19.MoccaMasterSolution.model;


/*
 Cup repræsenterer koppen som serveres.

 Den indeholder en Drink.
*/

public class Cup {

    // reference til drikken
    private Drink drink;

    public Cup(Drink drink){

        this.drink = drink;
    }

    // Returnerer drikken
    public Drink getDrink(){
        return drink;
    }

    // Beskriver koppen
    public String describe(){

        String text = drink.getType().toString();

        // hvis størrelse findes tilføjes den
        if(drink.getSize() != null){
            text += " " + drink.getSize();
        }

        // hvis der er flødeskum tilføjes tekst
        if(drink.hasWhippedCream()){
            text += " with whipped cream";
        }

        return text;
    }
}