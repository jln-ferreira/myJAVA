package com.Class;

import OOP_Class.*;

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

        /*
        //--------OOP_HOUSE--------
        OOP_House myHouse = new OOP_House("Orange", 2, 3, 4, 10, false,true, "Los Angeles", 7301.99,5500302.99);
        System.out.println(myHouse.toString());
        OOP_House my2House = new OOP_House();
        System.out.println(my2House.toString());
        OOP_House my3House = new OOP_House();
        System.out.println(my3House.toString());
        */

         /*
        //OOP SHAPE
        OOP1_Retangle myRetangle = new OOP1_Retangle();
        myRetangle.setName("This is my triangle");
        myRetangle.setHeight(100.55d);
        myRetangle.setWidth(54.22d);
        System.out.println(myRetangle.area()); //5451.821
        System.out.println(myRetangle.perimeter()); //309.5399

        OOP1_Retangle myRetangle2 = new OOP1_Retangle(5,2,"marianas retangle");
        System.out.println("My Retangle is: "+ myRetangle2.getName() + "\nheight: " + myRetangle2.getHeight() + "\nwidth: " + myRetangle2.getWidth());
        System.out.println("Area: " + myRetangle2.area() + "\nPerimeter: " + myRetangle2.perimeter());

        OOP1_Box myBox = new OOP1_Box();
        myBox.setLeight(102);
        System.out.println(myBox.area());
        System.out.println(myBox.perimeter());
        */

         /*
        //POLYMORPHISM WITH OOP SHAPES

        //basicaly i create a poiters with the same structure to insert in a array
        OOP1_ABS_Shape obj1 = new OOP1_Circle(5);
        OOP1_ABS_Shape obj2 = new OOP1_Square(2);
        OOP1_ABS_Shape obj3 = new OOP1_Retangle(6,3);

        //to access the radius of my circle, i have to cast, because Shape doesnt have "radius"
        ((OOP1_Circle)obj1).setRadius(1);

        //i can put all my same shapes inside a array, because they are all shapes
        OOP1_ABS_Shape[] ShapeArr = new OOP1_ABS_Shape[]{
                new OOP1_Circle(2),
                new OOP1_Square(4),
                new OOP1_Retangle(2,6)
        };

        //now i need to get inside the array and cast inside
        ((OOP1_Square)ShapeArr[2]).setLeight(10);
        */





    }
}
