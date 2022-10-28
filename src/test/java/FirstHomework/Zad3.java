package FirstHomework;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);
        int firstNumber = scr.nextInt();
        int secondNumber = scr.nextInt();
        int thirdNum = scr.nextInt();

        //1 == 2; 2 == 3 3 == 1
        int firstRetainNumber = firstNumber;

        firstNumber = secondNumber;
        System.out.println("First num is: " + firstNumber);

        secondNumber = thirdNum;
        System.out.println("Second num is: " + secondNumber);

        thirdNum = firstRetainNumber;
        System.out.println("Third num is: " + thirdNum);

        int sum = (firstNumber + secondNumber);
        System.out.println("The sum from first and second number is: " + sum);

        int differenceBetweenNumbers = (sum - thirdNum);
        System.out.println("Difference between sum of first two numbers and third number is: " + differenceBetweenNumbers);


    }
}
