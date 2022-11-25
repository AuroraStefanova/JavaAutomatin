package FirstHomework;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter a integer to day of week");
        int dayNumber = scr.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println("The entered day " + dayNumber + " is Monday");
                break;
            case 2:
                System.out.println("The entered day " + dayNumber + " is Tuesday");
                break;
            case 3:
                System.out.println("The entered day " + dayNumber + " is Wednesday");
                break;
            case 4:
                System.out.println("The entered day " + dayNumber + " is Thursday");
                break;
            case 5:
                System.out.println("The entered day " + dayNumber + " is Friday");
                break;
            case 6:
                System.out.println("The entered day " + dayNumber + " is Saturday");
                break;
            case 7:
                System.out.println("The entered day " + dayNumber + " is Sunday");
                break;
            default:
                System.out.println("The entered day is not real day of the week");
        }
    }
}
/*
Задача 6:
Да се въведе число от клавиатурата от 1 до 7 и да се изведе съобщение кой ден от седмицата отговаря на съответно число с подходящо съобщение
 */
