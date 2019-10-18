package OOP_Class;

public class OOP1_Retangle extends OOP1_ABS_Shape {

    private double height;
    private double width;


    //setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    //----contructor----
    //default constructor
    public OOP1_Retangle() {
        this(3,5);
    }
    //overload constructor
    public OOP1_Retangle(double height, double width) {
        super("my Retangle");
        this.height = height;
        this.width = width;
    }

    //overload constructor with name inside
    public OOP1_Retangle(double height, double width, String name) {
        super(name);
        this.height = height;
        this.width = width;
    }

    //methods
    @Override
    public double area() {
        return height*width;
    }

    @Override
    public double perimeter() {
        return 2*(height + width);
    }
}
