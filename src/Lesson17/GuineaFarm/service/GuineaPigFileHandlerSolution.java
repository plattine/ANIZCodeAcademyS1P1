package Lesson17.GuineaFarm.service;



import Lesson17.GuineaFarm.model.*;

import java.io.*;
import java.util.ArrayList;

public class GuineaPigFileHandlerSolution {

    private static final String FILE_NAME = "guineapigs.csv";

    public ArrayList<GuineaPig> loadPigs() {

        ArrayList<GuineaPig> pigs = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                String type = parts[0];
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                double weight = Double.parseDouble(parts[3]);
                Color color = Color.valueOf(parts[4]);
                Breed breed = Breed.valueOf(parts[5]);

                if (type.equals("PET")) {

                    boolean goodWithChildren =
                            Boolean.parseBoolean(parts[6]);

                    pigs.add(new PetGuineaPig(
                            name, age, weight,
                            color, breed,
                            goodWithChildren));

                } else if (type.equals("SHOW")) {

                    int score = Integer.parseInt(parts[6]);

                    pigs.add(new ShowGuineaPig(
                            name, age, weight,
                            color, breed,
                            score));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return pigs;
    }

    public void savePigs(ArrayList<GuineaPig> pigs) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (GuineaPig pig : pigs) {

                if (pig instanceof PetGuineaPig) {

                    PetGuineaPig p = (PetGuineaPig) pig;

                    writer.write("PET," +
                            p.getName() + "," +
                            p.getAge() + "," +
                            p.getWeight() + "," +
                            p.getColor() + "," +
                            p.getBreed() + "," +
                            p.isGoodWithChildren());

                } else if (pig instanceof ShowGuineaPig) {

                    ShowGuineaPig s = (ShowGuineaPig) pig;

                    writer.write("SHOW," +
                            s.getName() + "," +
                            s.getAge() + "," +
                            s.getWeight() + "," +
                            s.getColor() + "," +
                            s.getBreed() + "," +
                            s.getCompetitionScore());
                }

                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}