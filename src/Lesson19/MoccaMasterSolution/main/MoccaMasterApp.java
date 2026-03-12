package Lesson19.MoccaMasterSolution.main;


import Lesson19.MoccaMasterSolution.ui.CoffeeMachineUI;

/*
 Main-klassen er programmets startpunkt.
 Java starter altid i main() metoden.

 I større programmer skal main være meget lille
 og kun starte programmet.
*/

public class MoccaMasterApp {

    public static void main(String[] args) {

        // Her oprettes UI-klassen som styrer programmet
        CoffeeMachineUI ui = new CoffeeMachineUI();

        // Her startes programmet
        ui.start();
    }
}