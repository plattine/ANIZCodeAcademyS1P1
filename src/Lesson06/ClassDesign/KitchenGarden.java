package Lesson06.ClassDesign;

// KitchenGarden.java
public class KitchenGarden {
    public static void main(String[] args) {
        // Create objects of vegetables
        Carrot carrot1 = new Carrot();
        Carrot carrot2 = new Carrot("Purple", 12.5, 60.0);

        Cabbage cabbage1 = new Cabbage();
        Cabbage cabbage2 = new Cabbage("Red", 18.0, 900.0);

        Beans beans1 = new Beans();
        Beans beans2 = new Beans("French Bean", 15, 10.0);

        Salad salad1 = new Salad();
        Salad salad2 = new Salad("Spinach", 30, 150.0);

        // Print all vegetables
        System.out.println(carrot1);
        System.out.println(carrot2);
        System.out.println(cabbage1);
        System.out.println(cabbage2);
        System.out.println(beans1);
        System.out.println(beans2);
        System.out.println(salad1);
        System.out.println(salad2);
    }
}
