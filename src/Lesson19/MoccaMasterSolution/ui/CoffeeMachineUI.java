package Lesson19.MoccaMasterSolution.ui;


import Lesson19.MoccaMasterSolution.model.*;
import Lesson19.MoccaMasterSolution.service.CoffeeMachine;
import Lesson19.MoccaMasterSolution.util.CupSorter;
import Lesson19.MoccaMasterSolution.file.FileHandler;

import java.util.ArrayList;

/*
 UI-klassen styrer brugerinteraktionen.

 I større programmer skal UI ikke indeholde
 forretningslogik eller filhåndtering.

 Den skal kun:
  - vise information
  - kalde serviceklasser
*/

public class CoffeeMachineUI {

    // Kaffemaskinen der laver drikke
    private CoffeeMachine machine = new CoffeeMachine();

    public void start(){

        // ArrayList bruges fordi antallet af ordrer kan ændre sig
        ArrayList<Cup> orders = new ArrayList<>();

        // Her bestilles nogle drikke (mock data)
        orders.add(machine.serve(DrinkType.BLACK_COFFEE, Size.MEDIUM, false));
        orders.add(machine.serve(DrinkType.CHOCOLATE_DRINK, Size.LARGE, true));
        orders.add(machine.serve(DrinkType.LATTE_MACCHIATO, Size.SMALL, false));

        // Sorter listen af drikke
        CupSorter.sortCups(orders);

        // Print alle ordrer
        for(Cup cup : orders){

            // describe() fortæller hvad koppen indeholder
            System.out.println(cup.describe());
        }

        // Gem ordrer i en CSV fil
        FileHandler.writeOrders("orders.csv", orders);
    }
}