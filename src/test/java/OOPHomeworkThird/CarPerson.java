package OOPHomeworkThird;

import java.util.Scanner;

public class CarPerson {
    public static void main(String[] arg){

        //adding number from the console to use in method useFuel
        Scanner src = new Scanner(System.in);

        System.out.println("Please enter a double number !");
        double fuelChange = src.nextDouble();
        System.out.println("Please enter a different type of Engine Fuel Operation System!");
        String changeSystemOperation = src.next();

        Car firstCar = new Car();

        //declaring fields for first object Car
        firstCar.year = 1770;
        firstCar.price = 121554.25;
        firstCar.isSportCar = true;
        firstCar.fuelTankCapacity = 21;
        firstCar.freeFuel = 1.2;
        firstCar.engineFuelOperationSystem = "Gasoline";

        Car secondCar = new Car();

        //declaring fields for second object Car
        secondCar.year = 2021;
        secondCar.price = 80000.99;
        secondCar.isSportCar = false;
        secondCar.fuelTankCapacity = 41;
        secondCar.freeFuel = 41;
        secondCar.engineFuelOperationSystem = "Electricity";

        //changing operation system for first car
        firstCar.changeEngineFuelOperationSystem(changeSystemOperation);

        //Change used fuel for second car
        secondCar.useFuel(fuelChange);

        //Printing information for the firs car !
        System.out.println('\n' + "Printing information for the firs car");
        firstCar.printingCar();


        //Printing information for the second car !
        System.out.println( '\n' + "Printing information for the second car");
        secondCar.printingCar();
    }
}
/*
Homework 3:

Задача 1:
Създайте клас Car, който представя кола.
Класът да има следните полета:

year – числова стойност показваща година на производство на
колата
price – числова стойност (не е задължително да е цяло число) показваща
цената на колата
isSportCar – булева стойност – дали колата е спортна или не
fuelTankCapacity – числова стойност за размера на резервоара
freeFuel – числова стойност показваща наличното свободно гориво
engineFuelOperationSystem – текстово поле за вида гориво,което използва автомобила

Класът да дефинира следните методи:
-метод void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem), който сменя
стойността на полето engineFuelOperationSystem със стойността подадена като параметър.
-метод void useFuel(double fuel), който намалява свободното гориво
(freeFuel) със стойността подадена като аргумент.
Ако стойността на аргумента е по-голяма от наличното гориво, извеждa
съобщение "Not enough free fuel!"

Да се създаде клас CarPerson, с main метод.
В рамките на main метода да се създадат 2 обекта от тип Car.

Да се зададат стойности на всеки от колите за year, price,
fuelTankCapacity, freeFuel, engineFuelOperationSystem.Нека едината кола да е спортна. На едната от колата да е заделено 35 литра гориво (чрез
метода useFuel), а на другия, да се смени горивната система (чрез
метода changeЕngineFuelOperationSystem), след което да се изведат на екрана всичките полета на дете коли
 */
