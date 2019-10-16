package com.Class;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //THIS MAIN WILL BRING ALL THE CLASS:

        //Variable_class1.Variable_Class1(); //variables, if, switch
        //Loops.Loop_class2(); //LOOPS - FOR
        //Scan_Way.howScan(); //how to scan. add a value inside a variable
        //Scan_Way.Salary(); //function salary (ask name, salary and work hours)
        //Recursion.loopFactorial(); //loop factorial 1 to 9
        //Recursion.loopFibo(); //loop fibonacci 1 to 9

        //exercice of override
        //System.out.println(exOverride.area(5.0)); //78.539.. Exrcice of override
        //System.out.println(exOverride.area(5.0,10)); //50.. Exrcice of override

        //PlayArrays.exempleArr1(); //examples of arrays (arrays, sort, find, loops)
        //PlayArrays.exempleArr2d(); //some examples how works, print
        //PlayArrays.ArrReference();
        //challange with arrays: -> create a array and a function that reverse the information

        /*int[]test = new int[] {1,2,3,4,5,6,7,8,9};
        int[]testRev = PlayArrays.reverseArr(test);

        for(Object x : testRev){
            System.out.print(x + " ");
        }*/

        //RegularExpressions.StringReplace();

        //--------OOP_CAR--------
        /*
        //using default contructor
        OOP_Car myCar = new OOP_Car();

        System.out.println(myCar.printInfo());

        System.out.println("------------------");
        //using default contructor
        OOP_Car my2Car = new OOP_Car();
        my2Car.setAutomatic(false);
        my2Car.setColor("Grey");
        my2Car.setFuel(60.4);
        my2Car.setMake("Nissan");
        my2Car.setModel("Versa");

        System.out.println(my2Car.printInfo());

        System.out.println("------------------");

        //using override contructor
        //OOP_Car(String make, String model, String color, boolean automatic, double fuel){
        OOP_Car my3Car = new OOP_Car("Porche", "Sport", "Dark Blue", true,39.22);

        System.out.println(my3Car.printInfo());
       */

        //--------OOP_HOUSE--------
        OOP_House myHouse = new OOP_House("Orange", 2, 3, 4, 10, false,true, "Los Angeles", 7301.99,5500302.99);
        System.out.println(myHouse.toString());
        OOP_House my2House = new OOP_House();
        System.out.println(my2House.toString());
        OOP_House my3House = new OOP_House();
        System.out.println(my3House.toString());


    }
}
