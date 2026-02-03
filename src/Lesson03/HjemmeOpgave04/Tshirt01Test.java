package Lesson03.HjemmeOpgave04;

public class Tshirt01Test {

    public static void main(String[] args) {

        String size = "L";
        String color = "blue";
        String print = "Copenhell, Jarl Style";
        double price = 9.99;
        String currency = "EUR";

        OpretNyPromotion(size, color, print, price, currency);

        String size2 = "M";
        String color2 = "red";
        String print2 = "Roskilde Festival 'Stangbacardi'";
        double price2 = 109.90;
        String currency2 = "DKK";

        OpretNyPromotion(size2, color2, print2, price2, currency2);

    }

    public static void OpretNyPromotion(String size, String color, String print, double price, String currency)
    {
        Tshirt01 t = new Tshirt01();

        t.size = size;
        t.color = color;
        t.print = print;
        t.price = price;
        t.currency = currency;

        t.promoMessage();
    }

}
