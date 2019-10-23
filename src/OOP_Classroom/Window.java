package OOP_Classroom;

public class Window implements I_interact{

    private double lenght;
    private double width;
    private boolean isOpac;

    //SETTERS
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setOpac(boolean opac) {
        isOpac = opac;
    }

    //GETTERS
    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public boolean getisOpac() {
        return isOpac;
    }

    //CONSTRUCTORS
    //DEFAULT
    public Window() {
        this(0,0,false);
    }


    //CONSTRUCTORS
    //OVERLOAD
    public Window(double lenght, double width, boolean isOpac) {
        this.lenght = lenght;
        this.width = width;
        this.isOpac = isOpac;
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

        System.out.printf("Your Wall is clean now");
        setOpac(false);
        return true;
    }

    @Override
    public void Paint(String color) {
        setOpac(true);
        System.out.printf("Now the color of the Wall is " + color);
    }
}
