package Lesson17.GuineaFarm.util;

import Lesson17.GuineaFarm.model.GuineaPig;
import java.util.Comparator;

class NameComparator implements Comparator<GuineaPig> {

    @Override
    public int compare(GuineaPig g1, GuineaPig g2) {
        return g1.getName().compareToIgnoreCase(g2.getName());
    }
}

class AgeComparator implements Comparator<GuineaPig> {

    @Override
    public int compare(GuineaPig g1, GuineaPig g2) {
        return Integer.compare(g1.getAge(), g2.getAge());
    }
}

class WeightComparator implements Comparator<GuineaPig> {

    @Override
    public int compare(GuineaPig g1, GuineaPig g2) {
        return Double.compare(g1.getWeight(), g2.getWeight());
    }
}
/*
public class BreedComparator implements Comparator<GuineaPig> {

    @Override
    public int compare(GuineaPig g1, GuineaPig g2) {
        return g1.getBreed().compareToIgnoreCase(g2.getBreed());
    }
}

public class PriceComparator implements Comparator<GuineaPig> {

    @Override
    public int compare(GuineaPig g1, GuineaPig g2) {
        return Double.compare(g1.getPrice(), g2.getPrice());
    }
}

 */