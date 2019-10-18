package OOP_Class;

public class OOP1_Square extends OOP1_ABS_Shape {

    private double leight;

   //setters
    public void setLeight(double leight) {
        this.leight = leight;
    }

    //getters
    public double getLeight() {
        return leight;
    }

    //----contructor----
    //default constructor
    public OOP1_Square() {
        this.leight = 2;
    }
    //overload constructor
    public OOP1_Square(double leight) {
        this.leight = leight;
    }

    //methods
    @Override
    public double area() {
        return Math.pow(leight,2);
    }

    @Override
    public double perimeter() {
        return Math.pow(leight,4);
    }
}
