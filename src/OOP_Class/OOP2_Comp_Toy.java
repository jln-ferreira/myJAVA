package OOP_Class;

public class OOP2_Comp_Toy {
    //this is the class for composition of a OOP2_Cat
    //and a list for DOG as a composition thought

    private String name;
    private String color;


    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    //contructor
    //default
    public OOP2_Comp_Toy() {
        this("ball", "blue");
    }

    //overload contructor
    public OOP2_Comp_Toy(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
