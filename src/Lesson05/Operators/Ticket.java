package Lesson05.Operators;


public class Ticket {
    private int age;
    private boolean hasTicket;

    // Constructor
    public Ticket(int age, boolean hasTicket) {
        this.age = age;
        this.hasTicket = hasTicket;
    }

    // Method to check entry rules
    public String canEnter() {
        if (age >= 18 && hasTicket) {
            return "Velkommen ind!";
        } else if (age < 18 && hasTicket) {
            return "Du har billet, men du er for ung.";
        } else {
            return "Du kan ikke komme ind.";
        }
    }

    // Optional getters
    public int getAge() {
        return age;
    }

    public boolean getHasTicket() {
        return hasTicket;
    }
}

