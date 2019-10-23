package OOP_Classroom;

public class Chair  {

    private double heght;
    private double width;
    private String color;
    private String material;
    private boolean isOcupied;

    //SETTERS
    public void setHeght(double heght) {
        this.heght = heght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setOcupied(boolean ocupied) {
        isOcupied = ocupied;
    }

    //GETTERS
    public double getHeght() {
        return heght;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isOcupied() {
        return isOcupied;
    }

    //CONSTRUCTORS
    //DEFAULT
    public Chair() {
        this(0,0,"Black","Plastic",false);
    }


    //CONSTRUCTORS
    //OVERLOAD
    public Chair(double heght, double width, String color, String material, boolean isOcupied) {
        this.heght = heght;
        this.width = width;
        this.color = color;
        this.material = material;
        this.isOcupied = isOcupied;
    }
}
