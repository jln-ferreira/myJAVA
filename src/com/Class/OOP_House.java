package com.Class;

public class OOP_House {

    //proprieties/ fields
    private String color;
    private int windows;
    private int doors;
    private int no_badroom;
    private int no_bathroom;
    private boolean isTownhouse;
    private boolean isGarage;
    private String location;
    private double rentPrice;
    private double sellPrice;

    //----------------setters----------------
    public void setColor(String color) {
        this.color = color;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setNo_badroom(int no_badroom) {
        this.no_badroom = no_badroom;
    }

    public void setNo_bathroom(int no_bathroom) {
        this.no_bathroom = no_bathroom;
    }

    public void setTownhouse(boolean townhouse) {
        isTownhouse = townhouse;
    }

    public void setGarage(boolean garage) {
        isGarage = garage;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    //----------------getters-------------------
    public String getColor() {
        return color;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getNo_badroom() {
        return no_badroom;
    }

    public int getNo_bathroom() {
        return no_bathroom;
    }

    public boolean isTownhouse() {
        return isTownhouse;
    }

    public boolean isGarage() {
        return isGarage;
    }

    public String getLocation() {
        return location;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    //----------------contructors----------------
    //default Contructor
    public OOP_House() {
        this("WHITE", 1, 1, 1, 1, true, false, "CALIFORNIA", 1200, 250000);
    }
    //Overload Contructor
    public OOP_House(String color, int windows, int doors, int no_badroom, int no_bathroom, boolean isTownhouse, boolean isGarage, String location, double rentPrice, double sellPrice) {
        this.color = color;
        this.windows = windows;
        this.doors = doors;
        this.no_badroom = no_badroom;
        this.no_bathroom = no_bathroom;
        this.isTownhouse = isTownhouse;
        this.isGarage = isGarage;
        this.location = location;
        this.rentPrice = rentPrice;
        this.sellPrice = sellPrice;
    }

    //Overload Contructor
    public OOP_House(int no_badroom, int no_bathroom, String location, double rentPrice) {
        this("WHITE", 1, 1, no_badroom, no_bathroom, true, false, location, rentPrice, 250000);
    }

    @Override
    public String toString() {
        return "OOP_House{" +
                "color='" + getColor() + '\'' +
                ", windows=" + getWindows() +
                ", doors=" + getDoors() +
                ", no_badroom=" + getNo_badroom() +
                ", no_bathroom=" + getNo_bathroom() +
                ", isTownhouse=" + isTownhouse() +
                ", isGarage=" + isGarage() +
                ", location='" + getLocation() + '\'' +
                ", rentPrice=" + getRentPrice() +
                ", sellPrice=" + getSellPrice() +
                '}';
    }
}
