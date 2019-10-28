package UsingTest_Account;

//to use test, click "alt" + enter
//create test
//Junit 5
//chose the method

import java.util.Scanner;


public class Account {

    private double Cheking;
    private double Saving;
    private String name;

    public enum typeAcc{Cheking, Saving}

    //setters
    public void setCheking(double Cheking) {
        this.Cheking = Cheking;
    }

    public void setSaving(double Saving) {
        this.Saving = Saving;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getters
    public double getCheking() {
        return Cheking;
    }

    public double getSaving() {
        return Saving;
    }

    public String getName() {
        return name;
    }

    //constructor
    //default
    public Account() {
        this(100,100, "Jose");
    }

    //constructor
    //overload
    public Account(double Cheking,double Saving, String name) {
        this.Cheking = Cheking;
        this.Saving = Saving;
        this.name = name;
    }

    //methods
    public double deposit(double amout, typeAcc account){

        //using enum need to do that
        typeAcc Cheking = typeAcc.Cheking;
        typeAcc Saving = typeAcc.Saving;

        if(account == Cheking) {
            if (amout < 0) {
                System.out.println("You cannot Deposit negative values: " + amout);
                return this.Cheking;
            }
            this.Cheking += amout;
            return this.Cheking;
        }
        //saving
        if (amout < 0) {
            System.out.println("You cannot Deposit negative values: " + amout);
            return this.Saving;
        }
        this.Saving += amout + (amout*0.01);
        return this.Saving;
    }


    public double Withdowl(double amout, typeAcc account){

        //using enum need to do that
        typeAcc Cheking = typeAcc.Cheking;
        typeAcc Saving = typeAcc.Saving;

        if(account == Cheking) {
            if (this.Cheking - amout < 0) {
                System.out.println("Insufficient amout. Your cannot withdraw this amout: " + amout);
                return this.Cheking;
            }
            this.Cheking -= amout;
            return this.Cheking;
        }
        //saving
        if (this.Saving - amout < 0) {
            System.out.println("Insufficient amout. Your cannot withdraw this amout: " + amout);
            return this.Saving;
        }
        this.Saving -= amout;
        return this.Saving;
    }


    public double Transfer(typeAcc from, typeAcc to, double amout) {

        //using enum need to do that
        typeAcc Cheking = typeAcc.Cheking;
        typeAcc Saving = typeAcc.Saving;

        if (from == Cheking && to == Saving) { //cheking => Saving
            if (amout < 0) {
                System.out.println("You cannot Transfer negative values: " + amout);
                return this.Cheking;
            } else if (this.Cheking - amout < 0) {
                System.out.println("Insufficient amout. Your cannot Tranfer this amout: " + amout);
                return this.Cheking;
            } else {
                this.Cheking -= amout;
                this.Saving += amout + (amout * 0.01);
                System.out.println("Your New amount is: Checking: " + this.getCheking() + "\n" +
                        "Saving: " + this.getSaving());
                return this.Saving;
            }
        }

        if (from == Saving && to == Cheking) { //S7aving => Cheking
            if (amout < 0) {
                System.out.println("You cannot Transfer negative values: " + amout);
                return this.Saving;
            } else if (this.Saving - amout < 0) {
                System.out.println("Insufficient amout. Your cannot Tranfer this amout: " + amout);
                return this.Saving;
            } else {
                this.Saving -= amout;
                this.Cheking += amout;
                System.out.println("Your New amount is:\nChecking: " + this.getCheking() + "\n" +
                        "Saving: " + this.getSaving());
                return this.Cheking;
            }
        }
        System.out.println("You inputed wrong account, please, check the numbers.");
        return -1;
    }
}
