package OOP_Classroom;

public class Floor implements I_interact{

    private double lenght;
    private double width;
    private String material;
    private String color;

    //SETTERS
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //GETTERS
    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    //CONSTRUCTORS
    //DEFAULT
    public Floor() {
        this(0,0,"Wood", "Brown");
    }

    //CONSTRUCTORS
    //OVERLOAD
    public Floor(double lenght, double width, String material, String color) {
        this.lenght = lenght;
        this.width = width;
        this.material = material;
        this.color = color;
    }

    //methods
    @Override
    public boolean Clean() {
        System.out.println("  ||\n" +
                "  ||\n" +
                "  ||\n" +
                "  ||\n" +
                "  ||\n" +
                "  ||\n" +
                "  ||     Here you go, sweep\n" +
                "  ||     that up..............\n" +
                " /||\\\n" +
                "/||||\\\n" +
                "======         __|__\n" +
                "||||||        / ~@~ \\\n" +
                "||||||       |-------|\n" +
                "||||||       |_______|");

        System.out.println("Your Floor is clean now!");
        return true;
    }

    @Override
    public void Paint(String color) {
        setColor(color);
        System.out.printf("Now the color of the Floor is " + color);
    }
}
