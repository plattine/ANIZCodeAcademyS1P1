package Lesson17.GuineaFarm.util;

import Lesson17.GuineaFarm.model.GuineaPig;

import java.util.ArrayList;

public class GuineaPigSortering {

    public static void sortByName(ArrayList<GuineaPig> pigs){
        pigs.sort(new NameComparator());
    }

    public static void sortByAge(ArrayList<GuineaPig> pigs){
        pigs.sort(new AgeComparator());
    }

    public static void sortByWeight(ArrayList<GuineaPig> pigs){
        pigs.sort(new WeightComparator());
    }
}