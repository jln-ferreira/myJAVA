package OOP_Classroom;

public class Projector implements I_eletronic {

    private boolean isOn;
    private String resolution;
    private String make;
    private String model;

    //SETTERS
    public void setOn(boolean on) {
        isOn = on;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //GETTERS
    public boolean isOn() {
        return isOn;
    }

    public String getResolution() {
        return resolution;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    //CONSTRUCTORS
    //DEFAULT
    public Projector() {
        this(false, "low", "Sony", "px10");
    }

    //CONSTRUCTORS
    //OVERLOAD
    public Projector(boolean isOn, String resolution, String make, String model) {
        this.isOn = isOn;
        this.resolution = resolution;
        this.make = make;
        this.model = model;
    }

    //METHODS (CAME FROM I_ELETRONIC)
    @Override
    public void powerOn() {
        if(isOn)System.out.println("The Projector is already ON!");
        else{
            System.out.println("The Projector is now ON!");
            isOn = true;
        }
    }

    @Override
    public void powerOff() {
        if(!isOn)System.out.println("The Projector is already OFF!");
        else{
            System.out.println("The Projector is now OFF!");
            isOn = false;
        }
    }
}
