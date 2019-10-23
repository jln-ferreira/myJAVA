package OOP_Classroom;

import org.w3c.dom.ls.LSOutput;

public class Computer implements I_eletronic {

    private Monitor monitor;
    private String CPU;
    private double RAM;
    private boolean mouse;
    private boolean keyBoard;
    private boolean isOn;

    //SETTERS

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public void setMouse(boolean mouse) {
        this.mouse = mouse;
    }

    public void setKeyBoard(boolean keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
    //GETTERS

    public Monitor getMonitor() {
        return monitor;
    }

    public String getCPU() {
        return CPU;
    }

    public double getRAM() {
        return RAM;
    }

    public boolean isMouse() {
        return mouse;
    }

    public boolean isKeyBoard() {
        return keyBoard;
    }

    public boolean isOn() {
        return isOn;
    }

    //CONTRUCTORS
    //DEFAULT
    public Computer() {
        this(new Monitor(), "Small", 8, true, true, true);
    }

    //CONSTRUCTOS
    //OVERLOAD
    public Computer(Monitor monitor, String CPU, double RAM, boolean mouse, boolean keyBoard, boolean isOn) {
        this.monitor = monitor;
        this.CPU = CPU;
        this.RAM = RAM;
        this.mouse = mouse;
        this.keyBoard = keyBoard;
        this.isOn = isOn;
    }

    //METHODS (CAME FROM I_ELETRONIC)
    @Override
    public void powerOn() {
        if(isOn)System.out.println("The computer is already ON!");
        else{
            System.out.println("The computer is now ON!");
            isOn = true;
        }
    }

    @Override
    public void powerOff() {
        if(!isOn)System.out.println("The computer is already OFF!");
        else{
            System.out.println("The computer is now OFF!");
            isOn = false;
        }
    }
}
