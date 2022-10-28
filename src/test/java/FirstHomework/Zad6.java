package FirstHomework;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] arg){
        //swich case
        Scanner scr = new Scanner(System.in);
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
