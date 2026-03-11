package Lesson17.GuineaFarm.service;

import Lesson17.GuineaFarm.model.*;

import java.io.*;
import java.util.ArrayList;

/*
 Denne klasse har ansvar for filhåndtering.

 Den læser og skriver marsvin (GuineaPig objekter)
 til en CSV fil.

 CSV betyder:
 Comma Separated Values

 Eksempel på en linje i filen:

 PET,Bella,2,0.9,BROWN,ABYSSINIAN,true

 Her repræsenterer hver værdi et felt i et objekt.
*/

public class GuineaPigFileHandlerSolutionCmments {

    // Konstant der indeholder navnet på CSV filen
    // static betyder at variablen tilhører klassen
    // final betyder at værdien ikke kan ændres
    private static final String FILE_NAME = "guineapigs.csv";


    /*
     Denne metode læser marsvin fra CSV filen
     og returnerer dem som en ArrayList.

     Return type:
     ArrayList<GuineaPig>

     Vi bruger GuineaPig som type fordi
     PetGuineaPig og ShowGuineaPig nedarver fra den.
     Det er et eksempel på polymorphism.
    */
    public ArrayList<GuineaPig> loadPigs() {

        // Liste der skal indeholde alle marsvin
        ArrayList<GuineaPig> pigs = new ArrayList<>();


        /*
         try-with-resources

         BufferedReader bruges til at læse tekst fra en fil.

         FileReader åbner filen
         BufferedReader gør læsningen hurtigere
         fordi den læser i buffer blokke.
        */
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            // Variabel til at gemme hver linje i filen
            String line;


            /*
             while loop læser filen linje for linje

             readLine() returnerer:
             - en tekstlinje
             - eller null hvis filen er slut
            */
            while ((line = reader.readLine()) != null) {

                /*
                 CSV linjen deles op ved komma

                 Eksempel:
                 PET,Bella,2,0.9,BROWN,ABYSSINIAN,true

                 bliver til:

                 parts[0] = PET
                 parts[1] = Bella
                 parts[2] = 2
                 parts[3] = 0.9
                 parts[4] = BROWN
                 parts[5] = ABYSSINIAN
                 parts[6] = true
                */
                String[] parts = line.split(",");


                // Første værdi fortæller hvilken type marsvin det er
                String type = parts[0];

                // De næste værdier indeholder data
                String name = parts[1];

                // String konverteres til int
                int age = Integer.parseInt(parts[2]);

                // String konverteres til double
                double weight = Double.parseDouble(parts[3]);

                /*
                 Enums

                 valueOf konverterer tekst til enum værdi
                 Eksempel:

                 "BROWN" -> Color.BROWN
                */
                Color color = Color.valueOf(parts[4]);
                Breed breed = Breed.valueOf(parts[5]);


                /*
                 Her bruger vi typen til at afgøre
                 hvilken klasse der skal oprettes.

                 Dette er et eksempel på polymorphism
                 fordi listen indeholder forskellige
                 objekttyper som alle er GuineaPig.
                */
                if (type.equals("PET")) {

                    // Ekstra felt for PetGuineaPig
                    boolean goodWithChildren =
                            Boolean.parseBoolean(parts[6]);


                    /*
                     Vi opretter et nyt objekt
                     og tilføjer det til ArrayList
                    */
                    pigs.add(new PetGuineaPig(
                            name, age, weight,
                            color, breed,
                            goodWithChildren));

                }

                else if (type.equals("SHOW")) {

                    // Ekstra felt for ShowGuineaPig
                    int score = Integer.parseInt(parts[6]);

                    pigs.add(new ShowGuineaPig(
                            name, age, weight,
                            color, breed,
                            score));
                }
            }

        }

        /*
         IOException kan opstå hvis:

         - filen ikke findes
         - filen ikke kan læses
         - der opstår en diskfejl
        */
        catch (IOException e) {

            // printer fejl til konsollen
            e.printStackTrace();
        }


        // Returnerer listen med alle marsvin
        return pigs;
    }


    /*
     Denne metode gemmer alle marsvin i CSV filen.

     Parameter:
     ArrayList<GuineaPig> pigs
    */
    public void savePigs(ArrayList<GuineaPig> pigs) {


        /*
         BufferedWriter bruges til at skrive tekst til en fil.

         FileWriter opretter eller overskriver filen.
        */
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {


            /*
             Vi gennemløber alle marsvin i listen
             med en enhanced for-loop
            */
            for (GuineaPig pig : pigs) {


                /*
                 instanceof bruges til at teste
                 hvilken type objekt vi har.

                 Dette er nødvendigt fordi
                 ArrayList indeholder GuineaPig
                 men objekterne kan være forskellige typer.
                */
                if (pig instanceof PetGuineaPig) {

                    /*
                     Downcasting

                     Vi konverterer GuineaPig til PetGuineaPig
                     så vi kan bruge metoder fra den klasse.
                    */
                    PetGuineaPig p = (PetGuineaPig) pig;


                    /*
                     Her opbygger vi CSV linjen.

                     Hver værdi adskilles med komma.
                    */
                    writer.write("PET," +
                            p.getName() + "," +
                            p.getAge() + "," +
                            p.getWeight() + "," +
                            p.getColor() + "," +
                            p.getBreed() + "," +
                            p.isGoodWithChildren());

                }

                else if (pig instanceof ShowGuineaPig) {

                    ShowGuineaPig s = (ShowGuineaPig) pig;

                    writer.write("SHOW," +
                            s.getName() + "," +
                            s.getAge() + "," +
                            s.getWeight() + "," +
                            s.getColor() + "," +
                            s.getBreed() + "," +
                            s.getCompetitionScore());
                }

                // skriver ny linje i filen
                writer.newLine();
            }

        }

        /*
         IOException kan opstå hvis:

         - filen ikke kan skrives
         - filen er låst
         - der opstår diskfejl
        */
        catch (IOException e) {

            e.printStackTrace();
        }
    }
}