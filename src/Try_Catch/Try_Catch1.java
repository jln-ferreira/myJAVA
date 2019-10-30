package Try_Catch;

import java.util.Scanner;

public class Try_Catch1 {
    public static void main(String[] args) {


        System.out.println("------ First example -> Divide by zero -----:");
        System.out.println("The calculation of 3/0 is: " );

        try {
            System.out.println(3/0);
        }catch (Exception e){
            System.out.println("There is an error : " + e.getMessage());
            System.out.println("-1");
        }finally {
            System.out.println("End example 1");
        }

        System.out.println("------ Second example -> name Null -----:");
        System.out.println("The leigh of my name is: " );
        String name = null;

        try {
            System.out.println(name.length());
        }catch (Exception e){
            System.out.println("There is an error : " + e.getMessage());
            System.out.println("-1");
        }finally {
            System.out.println("End example 2");
        }

        System.out.println("------ Third example -> Array -----:");
        System.out.println("What is the 5th element of my array: " );
        int arr[] = {1,2,3,4,5};
        try {
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("There is an error : " + e.getMessage());
            System.out.println("-1");
        }finally {
            System.out.println("End example 3");
        }

        //using throw
        System.out.println("------ forth example -> throw -----:");
        try {
            System.out.println("Devide number: " + divide(2,0));
        }catch (Exception e){
            System.out.println("There is an error : " + e.getMessage());
            System.out.println("-1");
        }finally {
            System.out.println("End example 4");
        }

        //using scanner -> loop to show if its a double value or not
        while (true){
            Scanner sn = new Scanner(System.in);
            System.out.println("Input a number:");

            double userInput;

            if(sn.hasNextDouble()){ //see if the input is double or not
                userInput = sn.nextDouble();
                System.out.println("The value " + userInput + " is Double;");
            }else System.out.println("The value is not DOUBLE, try again");
        }
    }

    //some methods
    static double divide(double a, double b){
        if (b==0) throw new ArithmeticException("Impossible to devide by 0.");
        return a/b;
    }
}



