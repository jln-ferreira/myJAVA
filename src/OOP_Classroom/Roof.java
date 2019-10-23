package OOP_Classroom;

public class Roof implements I_interact{

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
    public Roof() {
        this(0,0,"Wood", "Black");
    }


    //CONSTRUCTORS
    //OVERLOAD
    public Roof(double lenght, double width, String material, String color) {
        this.lenght = lenght;
        this.width = width;
        this.material = material;
        this.color = color;
    }

    //methods
    @Override
    public boolean Clean() {
        System.out.println("      .-.\n" +
                "      | |\n" +
                "      |=|\n" +
                "      |=|\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |\n" +
                "      |=|\n" +
                "jgs   |=|\n" +
                "      |_|\n" +
                "    .=/I\\=.\n" +
                "   ////V\\\\\\\\\n" +
                "   |#######|\n" +
                "   |||||||||\n" +
                "   |||||||||\n" +
                "   |||||||||\n" +
                "   |||||||||\n" +
                "   |||||||||");

        System.out.println("Your Roof is clean now with a BIIIG BROOM!");
        return true;
    }

    @Override
    public void Paint(String color) {
        setColor(color);
        System.out.printf("Now the color of the Floor is " + color);
    }
}
