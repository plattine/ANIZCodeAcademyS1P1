package Lesson17.GuineaFarm.model;


public class PetGuineaPig extends GuineaPig {

    private boolean goodWithChildren;

    public PetGuineaPig(String name, int age, double weight,
                        Color color, Breed breed,
                        boolean goodWithChildren) {

        super(name, age, weight, breed, color);
        this.goodWithChildren = goodWithChildren;
    }

    public boolean isGoodWithChildren() {
        return goodWithChildren;
    }

    @Override
    public String getDescription() {

        return "Pet Guinea Pig: " + getName() +
                " | Age: " + getAge() +
                " | Weight: " + getWeight() +
                " | Breed: " + getBreed() +
                " | Good with children: " + goodWithChildren;
    }
}