package Lesson04.Conditionals;


// TivoliRideTest.java
public class TivoliRideTest {
    public static void main(String[] args) {

        TivoliRide ride = new TivoliRide(140); // minimumshøjde 140 cm
        check(ride);
    }

    public static void check(TivoliRide ride) {
        ride.checkHeight(145); // Test: høj nok
        ride.checkHeight(130); // Test: ikke høj nok
    }
}

