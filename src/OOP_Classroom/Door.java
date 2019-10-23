package OOP_Classroom;

import java.util.PropertyResourceBundle;

public class Door implements I_interact{

    private double heght;
    private double width;
    private String color;
    private boolean isLocked;
    private String material;

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

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public boolean isLocked() {
        return isLocked;
    }

    public String getMaterial() {
        return material;
    }

    //CONSTRUCTORS
    //DEFAULT
    public Door() {
        this(0,0,"Brown", false,"Wood");
    }

    //CONSTRUCTORS
    //OVERLOAD
    public Door(double heght, double width, String color, boolean isLocked, String material) {
        this.heght = heght;
        this.width = width;
        this.color = color;
        this.isLocked = isLocked;
        this.material = material;
    }

    //methods
    @Override
    public boolean Clean() {
        System.out.println(" .--\"\"--.___.._\n" +
                "(  <__>  )     `-.\n" +
                "|`--..--'|      <|\n" +
                "|       :|       /\n" +
                "|       :|--\"\"-./\n" +
                "`.__  __;' o!O\n" +
                "    \"\"");

        System.out.printf("Your door is clean now");
        return true;
    }

    @Override
    public void Paint(String color) {
        setColor(color);
        System.out.printf("Now the color of the Door is " + color);
    }
}
