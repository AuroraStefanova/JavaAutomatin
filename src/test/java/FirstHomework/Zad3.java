package FirstHomework;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter a integer");
        int firstNumber = scr.nextInt();
        System.out.println("Please enter a integer");
        int secondNumber = scr.nextInt();
        System.out.println("Please enter a integer");
        int thirdNum = scr.nextInt();

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
/*
Задача 3:
Въведете 3 числа от клавиатурата ч1, ч2 и ч3.
Разменете стойностите им така, че ч1 да има стойността на ч2, ч2 да има стойността на ч3, а ч3 да има старатастойност на ч1.
Съберете ч1 и ч2 и след това намерете разликата между получения сбор и ч3. Разпечатете стойностите на числата на етапи
 */
