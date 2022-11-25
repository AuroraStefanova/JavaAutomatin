package SecondHomework;

import java.util.Scanner;

public class Zad3_Homework2 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);

        double[] firstArrayFromTheConsole = new double[5];

        System.out.println("Please enter five double numbers from the console!");

        //adding elements from type double from the console
        for (int i = 0; i < firstArrayFromTheConsole.length; i++){
            firstArrayFromTheConsole[i] = scr.nextDouble();
        }

        // Printing array
        for (int i = 0; i < firstArrayFromTheConsole.length; i++){
            System.out.println( firstArrayFromTheConsole[i]);
        }
    }
}
/*
Задача 3
Да се прочете масив от екрана с 5 числа по избор от тип double и да се отпечатат всички резултати
 */
