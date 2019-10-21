package OOP_Class;

import java.util.ArrayList;
import java.util.List;

public class OOP2_Dog implements OOP2_INT_Animal, OOP2_INT_Pet {
    //when i link INTERFACE to a DOG, i must implement the methods in the ANIMAL

    //gonna create a list of toys using a composition OOP2_Comp_Toy
    private List<OOP2_Comp_Toy> toys;

    //setters
    public void setToys(List<OOP2_Comp_Toy> toys) {
        this.toys = toys;
    }

    //getters
    public List<OOP2_Comp_Toy> getToys() {
        return toys;
    }

    //constructor
    //default contructor
    public OOP2_Dog() {
        toys = new ArrayList<>();
        toys.add(new OOP2_Comp_Toy("ball", "blue"));
    }


    //overload contructor
    public OOP2_Dog(List<OOP2_Comp_Toy> toys) {
        this.toys = toys;
    }

    //methods (interface ANIMAL)
    @Override
    public void makeSound() {
        System.out.println("Wooooof Woooof");
    }

    @Override
    public void eat() {
        System.out.printf("Give me food human! At least this beautiful pudim!");
    }

    @Override
    public void move() {
        System.out.println("I move to stay close to my human an i run to grab the mailman.");

    }

    //methods (interface PET)
    @Override
    public void wash() {
        System.out.println("I need to be washed. I stink sometimes.");
    }

    @Override
    public void feed() {
        System.out.println("Feed me, i don`t know how to hunt.");
    }

    @Override
    public void cuddle() {
        System.out.println("GIVE ME LOVE HUMAM!");
    }
}
