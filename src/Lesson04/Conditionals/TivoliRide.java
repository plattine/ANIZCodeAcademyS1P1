package Lesson04.Conditionals;


// TivoliRide.java
public class TivoliRide {
    int minHeight;

    public TivoliRide(int minHeight) {
        this.minHeight = minHeight;
    }

    public void checkHeight(int height) {
        System.out.println("Velkommen til LoopMaster 3000!");
        if (height >= minHeight) {
            System.out.println("Du er høj nok! Hop ombord 🎢");
        } else {
            System.out.println("Beklager, du skal være mindst " + minHeight + " cm høj 😢");
        }
    }
}
