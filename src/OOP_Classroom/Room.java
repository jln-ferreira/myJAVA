package OOP_Classroom;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private List<Window> windows;
    private List<Wall> walls;
    private List<Door> doors;
    private Floor floor;
    private Roof roof;
    private double temperature;
    private boolean inLightOn;

    //SETTERS
    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setInLightOn(boolean inLightOn) {
        this.inLightOn = inLightOn;
    }

    //GETTERS
    public List<Window> getWindows() {
        return windows;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public Floor getFloor() {
        return floor;
    }

    public Roof getRoof() {
        return roof;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isInLightOn() {
        return inLightOn;
    }

    //CONSTRUCTORS
    //DEFAULT
    public Room() {
        this.windows = new ArrayList<Window>();
        this.walls = new ArrayList<Wall>();
        this.doors = new ArrayList<Door>();
        this.floor = new Floor();
        this.roof = new Roof();
        this.temperature = 25.0d;
        this.inLightOn = false;
    }

    //CONSTRUCTOR
    //OVERLOAD
    public Room(List<Window> windows, List<Wall> walls, List<Door> doors, Floor floor, Roof roof, double temperature, boolean inLightOn) {
        this.windows = windows;
        this.walls = walls;
        this.doors = doors;
        this.floor = floor;
        this.roof = roof;
        this.temperature = temperature;
        this.inLightOn = inLightOn;
    }
}
