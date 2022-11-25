package SecondHomework;

import java.util.Scanner;

public class Zad2_Homework2 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);

        System.out.println("Please enter from console two double numbers");

        double firstNum = scr.nextDouble();
        double secondNum = scr.nextDouble();

        //calling method
        System.out.println(" The average arithmetically from two numbers is: " + arithmeticallyAverage(firstNum, secondNum));
    }
    //method average arithmetically from two numbers
    public static double arithmeticallyAverage(double firstNum, double secondNum){

        double sum = ((firstNum + secondNum)/ 2);

        return sum;
    }
}
/*
Задача 2
Да се състави метод, който приема като аргументи две числа и връща тяхното средноаритметично.
 */
