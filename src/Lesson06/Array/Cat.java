package Lesson06.Array;

// Cat.java
public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating 🐟");
    }

    public void chaseMouse() {
        System.out.println(name + " is chasing a mouse 🐭");
    }

    public void sleep() {
        System.out.println(name + " is sleeping 💤");
    }
}

