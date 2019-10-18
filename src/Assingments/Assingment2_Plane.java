package Assingments;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Assingment2_Plane {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean quitLoopPlaine = true;

        //arrays of seats
        //1. Airbus 300A
        //First Class
        boolean airbusFC[][] = new boolean[5][4];
        //Business Class
        boolean airbusBC[][] = new boolean[6][6];
        // Economy Class
        boolean airbusEC[][] = new boolean[24][10];
        //2. Boeing 747
        //First Class
        boolean BoeingFC1[][] = new boolean[5][4];
        boolean BoeingFC2[][] = new boolean[5][4];
        //Business Class
        boolean BoeingBC[][] = new boolean[6][6];
        // Economy Class
        boolean BoeingEC[][] = new boolean[34][10];

        //welcome-----
        System.out.println("-------============= Airline reservation system in console =============-------");

        //choose the plane------------
        do {
            System.out.println("Please, choose the Plane that you want to reservation or cancellation:");
            System.out.println("1. Airbus 300A;");
            System.out.println("2. Boeing 747.");
            int Plane = sc.nextInt();  // Read user input

            switch (Plane) {
                case 1: //1. Airbus 300A
                    System.out.println("1. First Class, 2. Business Class or 3. Economy Class?");
                    int ClassChoose = sc.nextInt();  // Read user input

                    switch (ClassChoose) {
                        case 1:
                            System.out.println("1. reservation or 2. cancellation?");
                            int ReservXCancel = sc.nextInt();  // Read user input

                            if (ReservXCancel == 1) { //reservation
                                System.out.println("You choosed 1. reservation");
                                System.out.println("Choose your seat:");

                                //print all seats
                                print2DEmptySeats(airbusFC);
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                    }

                    break;
                case 2:
                    break;
                default:
                    System.out.printf(Plane + " is not a option, please, try again.");
            }
        }while (quitLoopPlaine) ;
    }


    //FUNCTIONS
    //----print arrays 2d-----
    public static void print2DEmptySeats(boolean [][] Arr)
    {
        // Loop through all rows
        for (int i = 0; i < Arr.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < Arr[i].length; j++) {
                if (Arr[i][j] == false) System.out.print("[" + i + "]" + "E" + "[" + j + "] | ");
                else System.out.print("[" + i + "]" + "F" + "[" + j + "] | ");
            }
            System.out.println("");
        }

    }

}






