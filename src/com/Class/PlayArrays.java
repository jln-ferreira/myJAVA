package com.Class;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PlayArrays {

    static void exempleArr1() {

        //there are 2 ways to create a array:
        //first is:
        String[] students = new String[6];
        students[0] = "Jose";
        students[1] = "Mariana";
        students[2] = "Saygin";
        students[3] = "Eduardo";
        students[4] = "Hamid";
        students[5] = "Rodolfo";

        //to print, is just call by index
        System.out.println("The students with index [2] is: " + students[2]);


        //second way is:
        int[] numb = {20, 60, 10, 30, 80, 90, 40, 70, 50, 100}; //[10]

        //to print, is just call by index
        System.out.println("The number with index [5] is: " + numb[5]);

        //we can use a loop to print all number:
        //FOR LOOP
        System.out.println("---------For LOOP---------");
        for (int i = 0; i < numb.length; i++) {
            System.out.println("The number with index [" + i + "] is: " + numb[i]);
        }

        //FOREACH LOOP
        System.out.println("---------ForEACH LOOP---------");
        for (int number : numb) {
            System.out.print("|" + number);
        }

        //if i want to sort my array:
        Arrays.sort(numb);
        System.out.println("\n---------ForEACH LOOP SORTED---------");
        for (Object number : numb) { //Object is AUTO in C++
            System.out.print("|" + number);
        }

        //other thing. I can look for a number inside my array, it will return index of the number
        //if dont find it, will bring a negative number
        System.out.println("\n---------FIND A NUMBER IN A ARRAY---------");
        System.out.println("My number (80) is on index [" + Arrays.binarySearch(numb, 80) + "];");
        System.out.println("My number (81) is on index [" + Arrays.binarySearch(numb, 81) + "];"); //will not find

    }

    //2D arrays!
    static void exempleArr2d() {

        //to create a 2d array:
        //[row] [column]
        System.out.println("---- FIRST EXAMPLE 2D ---");
        int[][] num = new int [2][7];

        //for loop to run intire arrays 2d:
        for (int i = 0; i < 2; i++) { //start with row
            for (int j = 0; j < 7; j++) { //go column
                //increase 1+1:
                num[i][j] = (j+1) + (i*7);
                System.out.println("ROW[" + i + "] COLUMN[" + j + "] = " + num[i][j]);
            }
        }

        System.out.println("---- SECOND EXAMPLE 2D ---");
        //create 2d Array without 'new'
        double [][] Arr2D = {
                {1.0, 2.0, 3.0, 4.0, 5.0},
                {1.1, 2.2, 3.3, 4.4, 5.5},
                {10.1, 20.2, 30.3, 40.4, 50.5}
        }; //[3][5] --> 3 rows and 5 columns

        //i want to print 4.4
        System.out.println("ROW[1] COLUMN[3] = " + Arr2D[1][3]);

    }

    //arrays Copy (reference)
    static void ArrReference() {

        int[] primeNum = new int[]{2,3,5,7,11,13,17,19,13};
        int[] reference = primeNum;

        System.out.println("primeNum before:");
        for (Object numPr:primeNum) {
            System.out.print(numPr + " ");
        }
        //primeNum is on the stack, pointing to a array in the heap.
        //i`m saying that the reference is pointing to the same place

        //i`ll change the [2] of the reference, and the primeNum will change as well
        reference[2] = 100;
        System.out.println("\nprimeNum after:");
        for (Object numPr:primeNum) {
            System.out.print(numPr + " ");
        }

        //to do a real copy and be out of the others arrays --> 2 ways
        //int[]copy = primeNum.clone(); //gonna clone exatly the same array
        int[]copy = Arrays.copyOf(primeNum,9); //will copy till the size. if i put 4 -> [2,3,5,7]
        copy[2] = 5; //comeback to the value (but now, is only in a copy array)

        System.out.println("\nCopy:");
        for (Object c:copy) {
            System.out.print(c + " ");
        }
    }

    //challange of arrays
    static int[] reverseArr(int[] arr) {

        //need to create a new array
        int[]revArr = new int[arr.length];
        int countArr = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            revArr[countArr] = arr[i];
            countArr +=1;
        }
        return revArr;
    }
}
