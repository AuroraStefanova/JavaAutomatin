package SecondHomework;

import java.util.Scanner;

public class Zad4_Homework2 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);

        int[] createArrayWithTenElements = new int[10];
        int index = 0;

        System.out.println("Please enter ten int numbers from the console!");

        // Reading and adding elements from the console
        for (int i = 0; i < createArrayWithTenElements.length; i ++){
            createArrayWithTenElements[i] = scr.nextInt();
        }

        //Printing elements using For Loop
        System.out.println("Printing elements using For Loop!");
        for (int i = 0; i < createArrayWithTenElements.length; i++){
            System.out.println(createArrayWithTenElements[i]);
        }

        //Printing elements using While loop
        System.out.println("Printing elements using While loop!");
        while (index < createArrayWithTenElements.length){
            System.out.println(createArrayWithTenElements[index]);
            index++;
        }
    }
}
/*
Задача 4
Напишете програма, която създава масив с 10 елемента от тип int и обходете масива:
1. с помоща на for loop
2. с помоща на while loop
Да се изведат елементите на екрана.
 */
