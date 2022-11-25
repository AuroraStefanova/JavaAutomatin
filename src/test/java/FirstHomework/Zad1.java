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
/*
Задача 1:
Да се изпишат подканващи съобщения към user, с които да въведе две числа от клавиатурата (тип int или double).
След всяко въвеждане числата да бъдат отпечатени с подходящ текст.
 Да се въведе и 3-то число като се провери дали то е между първото и второто, като се изведе подходящо съобщение.
 */
