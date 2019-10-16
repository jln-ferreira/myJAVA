package com.Class;

public class Variable_class1 {

    //i can create a function inside my class and call it from another class (if its in the same folder)
    static void Variable_Class1(){
        //_____________prints_______________
        System.out.println("Hello World"); //sout -> shortcut

        System.out.println(""); //jump line
        System.out.print("all_"); //without ln-> same line
        System.out.print("together");


        //__________VARIABLES_____________
        int age = 29; //integer
        String name = "Mariana"; //string
        boolean alive = true; //boolean

        System.out.println("My name is " + name + ". I Have " + age + " years old. " + "Till now, am i Alive? " + alive);

        //__________IF STATEMMANT_________
        System.out.println("_____IF STATEMMANT_____");
        int light = 1;
        boolean go = true;

        go = (light == 1) ? true : false;
        System.out.println(go);


        //______SWITCH STATEMMENT_________
        System.out.println("_____SWITCH STATEMMANT_____");
        int weekDay = 5;

        switch (weekDay){
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THRUESDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
        }
    }
    //other folder you call -> Variable_class1.Variable_Class1();
}
