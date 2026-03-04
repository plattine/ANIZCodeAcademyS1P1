package Lesson16.SortIntegers;

import java.util.ArrayList;
import java.util.Collections;

public class SortNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(99);
        numbers.add(3);

        System.out.println("Before sorting:");
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println("After sorting:");
        System.out.println(numbers);
    }
}