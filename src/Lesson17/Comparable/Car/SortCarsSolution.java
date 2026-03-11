package Lesson17.Comparable.Car;

import java.util.*;

public class SortCarsSolution {
    public static void main(String[] args) {
        // 7. ArrayList<Car>
        List<Car> cars = new ArrayList<>();

        // 8. Tilføj biler
        cars.add(new Car("BC123"));
        cars.add(new Car("AA456"));
        cars.add(new Car("ZZ999"));
        cars.add(new Car("AB222"));
        cars.add(new Car("CC789"));

        // 9. Udskriv listen
        System.out.println("Original list:");
        for (Car c : cars) {
            System.out.println(c.getPlate());
        }

        // 10. Sortér
        Collections.sort(cars);

        // 11. Udskriv igen
        System.out.println("\nSorted list:");
        for (Car c : cars) {
            System.out.println(c.getPlate());
        }
    }
}


