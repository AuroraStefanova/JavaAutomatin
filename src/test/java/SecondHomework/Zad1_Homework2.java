package SecondHomework;

import java.util.Scanner;

public class Zad1_Homework2 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);

        System.out.println("Please enter a two integer numbers!");

        int firstNum = scr.nextInt();
        int secondNum = scr.nextInt();

        System.out.println("The sum from two numbers is: " + calculateTwoNumbers(firstNum, secondNum));

    }
    //Method calculate two numbers
    static int calculateTwoNumbers(int first, int second){

        int sum = first + second;
        return sum;
    }
}
/*
Задача 1:
Да се състави метод, който приема като аргументи две числа и отпечатва на екрана техния сбор.
 */
