package com.Class;

public class Loops {

    static void Loop_class2() {

        System.out.println("Loop Class 2:");
        System.out.println("-----------FOR LOOP-----------");

        int count = 0;
        for (int i = 0; i<10;i++){
            System.out.println("["+ count +"] Mariana e uma belezinha");
            count ++;
        }

        System.out.println("-----------CHALLANGE FOR LOOP-----------");

        char num = 'A';
        for (int i = 10; i>0;i--){
            System.out.println(num + "--> 2 ^ " + i + " = " + (int)Math.pow(2,i));
            count ++;
            num+=1;
        }

        System.out.println("-----------WHILE LOOP-----------");

        int monsterHP = 33;
        while(monsterHP > 0){
            System.out.println("The monster has " + monsterHP + " of HP;");
            System.out.println("Your hero attacked the monster with 8 of ATK;");

            monsterHP -= 8;

            if (monsterHP <= 0) System.out.println("The monster died");
        }

        System.out.println("-----------DO WHILE LOOP-----------");

        int doWhileCount = 0;
        do {
            System.out.print(doWhileCount + " ");
            doWhileCount +=1;
        }
        while(doWhileCount != 11);







    }
}
