package FirstHomework;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter a integer");
        int numberWorkingHours = scr.nextInt();
        System.out.println("Please enter a double number");
        double amountMoney = scr.nextDouble();
        System.out.println("Please enter a bull True or False ");
        Boolean isWorkDay = scr.nextBoolean();

        //ako e po4iwen den ????????????
        if (isWorkDay == true){
            System.out.println("I work");
        }
        else {
            if(amountMoney < 10.0 && amountMoney > 0){
                System.out.println("I go to ice cream");
            }
            else if (amountMoney == 0){
                System.out.println(" I don't have money. I stay at home and watch TV");
            }
            else if(amountMoney > 10.0){
                System.out.println("I go to the cinema");
            }
        }
    }
}
/*
Задача 4:
Въведете 3 променливи от клавиатурата – брой работни часове (целочислен тип), сума пари (число
с плаваща запетая), дали е почивен ден – булев тип. Съставете програма, която взема решения на базата на тези данни по следния начин:

ако не е почивен ден ще работя
ако имам пари и е почивен ден ще отида на кино
ако нямам – ще стоя вкъщи и ще гледам телевизия
ако е почивен ден
ако имам по-малко от 10 лв ще отида за сладолед
*/
