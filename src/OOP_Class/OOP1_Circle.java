package OOP_Class;

public class OOP1_Circle extends OOP1_ABS_Shape {

    private double radius;


    //setters
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //getters
    public double getRadius() {
        return radius;
    }

    //----contructor----
    //default constructor
    public OOP1_Circle() {
        this.radius = 5;
    }

    //overload constructor
    public OOP1_Circle(double radius) {
        this.radius = radius;
    }

    //methods
    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
