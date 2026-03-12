package Lesson19.MoccaMasterSolution.util;

import Lesson19.MoccaMasterSolution.model.Cup;
import java.util.ArrayList;
import java.util.Collections;

/*
 Klasse der samler sorteringslogik.

 Det gør koden mere organiseret.
*/

public class CupSorter {

    public static void sortCups(ArrayList<Cup> cups){

        // opret comparator
        CupComparator comparator = new CupComparator();

        // sorter listen
        Collections.sort(cups, comparator);
    }
}