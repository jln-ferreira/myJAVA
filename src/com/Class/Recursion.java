package com.Class;

import javax.swing.*;

public class Recursion {

    //------------FACTORIAL---------------
    static int Factorial(int number){
      if(number ==1){
          return 1;
      }
      return number * Factorial(number -1);
    }
    //LOOP TO SEE ALL FACTORIAL TILL 10
    static void loopFactorial(){
        for (int i = 1; i < 10; i++) {
            System.out.println("The factorial of " + i + ": " + Factorial(i));
        }
    }
    //------------FIBONACCI---------------
    static long Fibonacci (int num){
        if(num < 1) return -1;
        if(num == 1) return 0;
        if(num == 2) return 1;
        return Fibonacci(num-1) + Fibonacci(num-2);
    }
    //LOOP TO SEE ALL FIBONACCI TILL 10
    static void loopFibo(){
        for (int i = 1; i < 10; i++) {
            System.out.println("The Fibonacci of " + i + ": " + Fibonacci(i));
        }
    }
}
