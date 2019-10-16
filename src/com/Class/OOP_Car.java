//to create all of this: CODE > GENERATE

package com.Class;

public class OOP_Car {

    private String make;
    private String model;
    private String color;
    private boolean automatic;
    private double fuel;

    //getters
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public boolean getAutomatic(){
        return automatic;
    }
    public double getFuel(){
        return fuel;
    }

    //setters
    public void setMake(String make){
        this.make = make.toUpperCase();
    }
    public void setModel(String model){
        this.model = model.toUpperCase();
    }
    public void setColor(String color){
        this.color = color.toUpperCase();
    }
    public void setAutomatic(boolean automatic){
        this.automatic = automatic;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }

    //default contructors
    OOP_Car(){
        this("UNKNOWN","UNKNOWN","UNKNOWN",false,10.0d);
    }

    //override Contructor
    OOP_Car(String make, String model, String color, boolean automatic, double fuel){
        this.make = make.toUpperCase();
        this.model = model.toUpperCase();
        this.color = color.toUpperCase();
        this.automatic = automatic;
        this.fuel = fuel;
    }

    //methods
    public String printInfo(){
        StringBuilder sb = new StringBuilder("Information of myCar: \n");
        sb.append("Make: ");
        sb.append(this.getMake());
        sb.append("| Model: ");
        sb.append(this.getModel());
        sb.append("| Color: ");
        sb.append(this.getColor());
        sb.append("| Automatic: ");
        sb.append(this.getAutomatic());
        sb.append("| Fuel: ");
        sb.append(this.getFuel());

        return sb.toString();
    }

}
