package com.Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lists {

    public static void main(String[] args) {
        //work with a few LISTS

        int[] array = {1,2,3,4,5};

        //those above are the sabe. The only diference is in the RAM.
        //Linkedlist will link all values together with arrows, not ar arrays
        List<Integer> arrayList = new ArrayList<>(); //flexible size
        List<Integer> linkedList = new ArrayList<>(); //flexible size

        //insert information in a arraylist
        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(103);
        arrayList.add(104);

        //to loop inside:
        System.out.println("LOOP:");
        for(Integer num : arrayList){
            System.out.println(num + " ");
        }

        //print an index inside arrayList
        System.out.println("\nGET a value inside using index:");
        System.out.println(arrayList.get(2)); //103

        //search the value inside the arrayList (boolean)
        System.out.println("\nCONTAINS search if i have the value:");
        System.out.println(arrayList.contains(104)); //true
        System.out.println(arrayList.contains(105)); //false

        //change values inside the array:
        System.out.println("\nCHANGE VALUES inside the arrayList:");
        arrayList.set(3,105);
        System.out.println(arrayList.get(3)); //true

        List<Integer>list = new Vector<>();
        Vector<Integer> vec = new Vector<>();
    }

}
