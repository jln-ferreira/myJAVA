package OOP_Class;

//abstract is to enhance to other class

public abstract class OOP1_ABS_Shape {

    private String name;

    //setters
    public void setName(String name) {
        this.name = name;
    }

    //getters
    public String getName() {
        return name;
    }

    //----contructor----
    //default constructor
    public OOP1_ABS_Shape() { }

    //overload constructor
    public OOP1_ABS_Shape(String name) {
        this.name = name;
    }

    //methods
    public abstract double area();
    public abstract double perimeter();


}
