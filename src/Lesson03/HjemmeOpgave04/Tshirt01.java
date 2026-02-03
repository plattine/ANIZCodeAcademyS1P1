package Lesson03.HjemmeOpgave04;

public class Tshirt01 {
    //Attributter
    String color;
    String size;
    String print;
    double price;
    String currency;


    public void promoMessage()
    {
        System.out.println("Available only today at this price:");
        System.out.println("T-shirt in size " + size + ", " + color +
                " color, and with our most original print: " +
                print + "!");
        System.out.println("Only " + price + " " + currency);

    }
}
