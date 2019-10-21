package OOP_Class;

public class OOP2_Cat implements OOP2_INT_Animal, OOP2_INT_Pet {
    //when i link INTERFACE to a DOG, i must implement the methods in the ANIMAL

    private OOP2_Comp_Toy catsToy;


    //setters
    public void setCatsToy(OOP2_Comp_Toy catsToy) {
        this.catsToy = catsToy;
    }

    //getters
    public OOP2_Comp_Toy getCatsToy() {
        return catsToy;
    }

    //contructor
    //constructor default
    public OOP2_Cat() {
        this(new OOP2_Comp_Toy());
    }

    //contructor overload
    public OOP2_Cat(OOP2_Comp_Toy catsToy) {
        this.catsToy = catsToy;
    }

    //methods (interface ANIMAL)
    @Override
    public void makeSound() {
        System.out.println("Miaaaaaaaaaaaau");
    }

    @Override
    public void eat() {
        System.out.printf("Give me food human!");
    }

    @Override
    public void move() {
        System.out.println("I move slowly, but full of angry");

    }

    //methods (interface PET)
    @Override
    public void wash() {
        System.out.println("I can wash myself, don`t you dare to put me in a tub");
    }

    @Override
    public void feed() {
        System.out.println("Feed me!!!!!!!!");
    }

    @Override
    public void cuddle() {
        System.out.println("don`t cudd... ooooh thats good!");
    }
}