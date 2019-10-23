package OOP_Classroom;

import java.util.ArrayList;
import java.util.List;

public class Classroom extends Room{
    //design this classroom

    private List<Chair> chairs;
    private List<Desk> desks;
    private List<Computer> computers;
    private Projector projector;
//    private List<Window> windows;
//    private List<Wall> walls;
//    private List<Door> doors;
//    private Floor floor;
//    private Roof roof;
//    private double temperature;
//    private boolean inLightOn;


    //----------SETTERS----------
    public void setChairs(List<Chair> chairs) {
        this.chairs = chairs;
    }

    public void setDesks(List<Desk> desks) {
        this.desks = desks;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public void setProjector(Projector projector) {
        this.projector = projector;
    }

//    public void setWindows(List<Window> windows) { this.windows = windows; }
//    public void setWalls(List<Wall> walls) { this.walls = walls; }
//    public void setDoors(List<Door> doors) { this.doors = doors; }
//    public void setFloor(Floor floor) { this.floor = floor;}
//    public void setRoof(Roof roof) {this.roof = roof;}
//    public void setTemperature(double temperature) {this.temperature = temperature;}
//    public void setInLightOn(boolean inLightOn) {this.inLightOn = inLightOn;}

    //GETTERS
    public List<Chair> getChairs() {
        return chairs;
    }

    public List<Desk> getDesks() {
        return desks;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public Projector getProjector() {return projector;}

//    public List<Window> getWindows() {return windows;}
//    public List<Wall> getWalls() {return walls;}
//    public List<Door> getDoors() {return doors;}
//    public Floor getFloor() {return floor;}
//    public Roof getRoof() {return roof;}
//    public double getTemperature() {return temperature;}
//    public boolean isInLightOn() {return inLightOn;}

    //CONTRUCTORS
    //DEFAULT
    public Classroom() {
        super(new ArrayList<Window>(), new ArrayList<Wall>(), new ArrayList<Door>(), new Floor(), new Roof(), 20, false);
        chairs = new ArrayList<>();
        chairs.add(new Chair());
        chairs.add(new Chair());
        chairs.add(new Chair());
        chairs.add(new Chair());
        chairs.add(new Chair());

        desks = new ArrayList<>();
        desks.add(new Desk());
        desks.add(new Desk());
        desks.add(new Desk());
        desks.add(new Desk());
        desks.add(new Desk());

        computers = new ArrayList<>();
        computers.add(new Computer());
        computers.add(new Computer());
        computers.add(new Computer());
        computers.add(new Computer());
        computers.add(new Computer());

        projector = new Projector();

//        windows = new ArrayList<>();
//        windows.add(new Window());
//        windows.add(new Window());
//        windows.add(new Window())
//
//        walls = new ArrayList<>();
//        walls.add(new Wall());
//        walls.add(new Wall());
//        walls.add(new Wall());
//        walls.add(new Wall());
//
//        doors = new ArrayList<>();
//        doors.add(new Door());
//
//        floor = new Floor();
//
//        roof = new Roof();
//
//        this.temperature = 20;
//
//        this.inLightOn = false;

    }

    //CONTRUCTORS
    //OVERLOAD CONTRUCTOR
    public Classroom(List<Chair> chairs, List<Desk> desks, List<Computer> computers, Projector projector, List<Window> windows, List<Wall> walls,List<Door> doors ,Floor floor, Roof roof, double temperature, boolean inLightOn) {
        super(windows, walls, doors, floor, roof, temperature, inLightOn);
        this.chairs = chairs;
        this.desks = desks;
        this.computers = computers;
        this.projector = projector;
//        this.windows = windows;
//        this.walls = walls;
//        this.doors = doors;
//        this.floor = floor;
//        this.roof = roof;
//        this.temperature = temperature;
//        this.inLightOn = inLightOn;
    }
}
