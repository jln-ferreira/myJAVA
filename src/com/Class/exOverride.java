package com.Class;

public class exOverride {


    //EXERCICE OF OVERRIDE ----->
    static double area(double radius){ //circle
        return (radius < 0) ?  -1 :  Math.PI * Math.pow(radius,2);
    }

    static double area(double x, double y){ //retangle
        return (x < 0 || y < 0) ?  -1 : x * y;
    }
}
