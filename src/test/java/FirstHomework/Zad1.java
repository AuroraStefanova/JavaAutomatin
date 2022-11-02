package FirstHomework;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] arg){
        System.out.println("Please enter two integer numbers: ");

        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter a integer");
        int firsNumber = scr.nextInt();
        System.out.println("First entered number is: " + firsNumber);

        System.out.println("Please enter a integer");
        int secondNumber = scr.nextInt();
        System.out.println("Second entered number is: " + secondNumber);

        System.out.println("Please enter third integer number : ");
        int thirdNumber = scr.nextInt();

        if (thirdNumber > firsNumber && thirdNumber < secondNumber || thirdNumber < firsNumber && thirdNumber > secondNumber){
            System.out.println("The third number is between " + firsNumber +" and " + secondNumber + " Third entered number is: " + thirdNumber );
        }
        else {
            System.out.println("Third number is not between " + firsNumber +" and " + secondNumber + " Third entered number is: " + thirdNumber );
        }



    }
}
