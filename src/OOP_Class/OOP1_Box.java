package OOP_Class;

public class OOP1_Box extends OOP1_Square{

    private String material;

    //setters
    public void setMaterial(String material) {
        this.material = material;
    }

    //getters
    public String getMaterial() {
        return material;
    }

    //----contructor----
    //default constructor
    public OOP1_Box(){
        material = "Metal";
    }
    //overload constructor
    public OOP1_Box(String material) {
        this.material = material;
    }

    //method
    @Override
    public double area() {
        return super.area()*6; //*super is you access the parents information
    }
}
