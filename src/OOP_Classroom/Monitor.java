package OOP_Classroom;

public class Monitor implements I_eletronic {
    private String resolution;
    private boolean isOn;

    //SETTERS
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setInOn(boolean inOn) {
        this.isOn = inOn;
    }

    //GETTERS
    public String getResolution() {
        return resolution;
    }

    public boolean isInOn() {
        return isOn;
    }

    //CONSTRUCTORS
    //DEFAULT
    public Monitor() {
        this("low", false);
    }


    //CONSTRUCTORS
    //OVERLOAD
    public Monitor(String resolution, boolean isOn) {
        this.resolution = resolution;
        this.isOn = isOn;
    }

    //METHODS (CAME FROM I_ELETRONIC)
    @Override
    public void powerOn() {
        if(isOn)System.out.println("The Monitor is already ON!");
        else{
            System.out.println("The Monitor is now ON!");
            isOn = true;
        }
    }

    @Override
    public void powerOff() {
        if(!isOn)System.out.println("The Monitor is already OFF!");
        else{
            System.out.println("The Monitor is now OFF!");
            isOn = false;
        }
    }
}
