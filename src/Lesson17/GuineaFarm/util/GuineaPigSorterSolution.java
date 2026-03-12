package Lesson17.GuineaFarm.util;


import Lesson17.GuineaFarm.model.GuineaPig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GuineaPigSorterSolution {



    public static void sortByName(ArrayList<GuineaPig> pigs) {

        Collections.sort(pigs,
                Comparator.comparing(GuineaPig::getName));
    }

    public static void sortByAge(ArrayList<GuineaPig> pigs) {

        Collections.sort(pigs,
                Comparator.comparingInt(GuineaPig::getAge));
    }

    public static void sortByWeight(ArrayList<GuineaPig> pigs) {

        Collections.sort(pigs,
                Comparator.comparingDouble(GuineaPig::getWeight));
    }

    public static void sortByBreed(ArrayList<GuineaPig> pigs) {

        Collections.sort(pigs,
                Comparator.comparing(p -> p.getBreed().name()));
    }
}