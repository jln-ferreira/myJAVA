package com.Class;
import java.util.Scanner;
import java.lang.Math;

public class Scan_Way {


    //functions to use in the menu ______________________
    static double sum(double a, double b){ //sum ----------------- +
        return a+b;
    }
    static double sub(double a, double b){ //sub ----------------- -
        return a-b;
    }
    static double dev(double a, double b){ //dev ----------------- /
        return a/b;
    }
    static double mult(double a, double b){ //mult ----------------- *
        return a*b;
    }

    //unimited parameters (override)
    static double sum(double ...nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }
    //______________________________________________________


    static void howScan() {

        Scanner sn = new Scanner(System.in); //way to create class (use one time)

        boolean firstPart = true;
        if(firstPart) {
            System.out.println("-------------1 -  Store-----------");

            //ask name (String)
            System.out.println("Whats your name?");
            String name = sn.next();

            //ask age (int)
            System.out.println("how old are you?");
            int age = sn.nextInt();

            System.out.println("Your name is " + name + "\nYou are " + age + " years old;");


            System.out.println("-------------2 -  Store-----------");

            System.out.println("Whats your Email Address?");
            String email = sn.next();

            for (int i = email.length(); i > 0; i--) {
                System.out.print(email.charAt(i - 1));
            }
        } //fist and simple scanner


        boolean secondPart = false;
        if(secondPart){ //fucking menu

           boolean existMenu = false;

           do {
               System.out.println("======Give me two numbers======");
               System.out.print("[1] = ");
               double num1 = sn.nextDouble();
               System.out.print("[2] = ");
               double num2 = sn.nextDouble();

               System.out.println("What do you want to do with your numbers?");
               System.out.println("1. Sum both numbers?");
               System.out.println("2. Substract both numbers?");
               System.out.println("3. Devide both numbers?");
               System.out.println("4. Multiply both number");
               System.out.println("0. Exit");

               int ChoiseMenu = sn.nextInt();

               switch (ChoiseMenu){
                   case 1:
                       System.out.print("The SUM is: " + num1 + " + " + num2 + " = ");
                       System.out.println(sum(num1,num2));
                       break;
                   case 2:
                       System.out.print("The SUB is: " + num1 + " - " + num2 + " = ");
                       System.out.println(sub(num1,num2));
                       break;
                   case 3:
                       System.out.print("The DIV is: " + num1 + " / " + num2 + " = ");
                       System.out.println(dev(num1,num2));
                       break;
                   case 4:
                       System.out.print("The MULT is: " + num1 + " * " + num2 + " = ");
                       System.out.println(mult(num1,num2));
                       break;
                   case 0:
                       existMenu = true;
                       break;
               }
           }
            while(!existMenu);
        }
    }

    //_______________function of salary___________
    static void Salary(){

        Scanner sn = new Scanner(System.in); //way to create class (use one time)

        //asking a name
        System.out.print("What`s your name: ");
        String name = sn.next();

        System.out.println("Hello " + name);

        //asking salary and hour
        System.out.print("Give-me the salary per hour: ");
        double salary = sn.nextDouble();
        System.out.print("How many hours did you work: ");
        double workHour = sn.nextDouble();

        System.out.println(Math.round(salary * workHour) + "CAD/hs");
    }




}