package Lesson07.Array.ReferenceDataTyper;


// Klasse til at repræsentere en svamp
class Mushroom {
    private String name;
    private String color;

    // Konstruktør
    public Mushroom(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    // Override toString() for pæn output
    @Override
    public String toString() {
        return name + " (" + color + ")";
    }

    // Override equals() for at sammenligne svampe baseret på name og color
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;              // tjek om det er samme objekt
        if (obj == null || getClass() != obj.getClass()) return false;
        Mushroom other = (Mushroom) obj;           // cast til Mushroom
        return name.equals(other.name) && color.equals(other.color);
    }
}