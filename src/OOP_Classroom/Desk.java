package OOP_Classroom;

public class Desk implements I_interact {

    private double heght;
    private double width;
    private String material;
    private String color;

    //SETTERS
    public void setHeght(double heght) {
        this.heght = heght;
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
    public double getHeght() {
        return heght;
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
    public Desk() {
        this(0, 0 ,"Plastic" ,"black");
    }

    //CONSTRUCTORS
    //OVERLOAD
    public Desk(double heght, double width, String material, String color) {
        this.heght = heght;
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

        return true;
    }

    @Override
    public void Paint(String color) {
        setColor(color);
        System.out.printf("Now the color of the Desk is " + color);
    }
}
