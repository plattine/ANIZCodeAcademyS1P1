package Lesson19.MoccaMasterSolution.util;


import Lesson19.MoccaMasterSolution.model.Cup;
import java.util.Comparator;

/*
 Comparator bruges til at definere
 hvordan objekter skal sorteres.
*/

public class CupComparator implements Comparator<Cup>{

    @Override
    public int compare(Cup c1, Cup c2){

        // sammenlign først type
        int result =
                c1.getDrink().getType()
                        .compareTo(c2.getDrink().getType());

        // hvis typerne er forskellige returneres resultatet
        if(result != 0){
            return result;
        }

        // ellers sammenlignes størrelse
        return c1.getDrink().getSize()
                .compareTo(c2.getDrink().getSize());
    }
}