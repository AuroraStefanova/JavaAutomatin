package OOPHomeworkThird;

public class Car {
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

//     Car (){}
    //Method who change fuel operation system
    public void changeEngineFuelOperationSystem (String fuelOperationSystem){
        this.engineFuelOperationSystem = fuelOperationSystem;
        System.out.println("Operation system is changing to : " + this.engineFuelOperationSystem);

    }
    //Method who decreases free  fuel with given sum from the console
    public void useFuel(double fuel){
        //  discount the quantity of the fuel whit the given parameter
        if( this.freeFuel < fuel){
            this.freeFuel = 0;
            System.out.println("Not enough free fuel!");

        }
        else {
            this.freeFuel = freeFuel - fuel;
            System.out.println("Free fuel is changed to: " + this.freeFuel);

        }
    }
    public void printingCar(){

        System.out.println("The car is created in: " + this.year + " His price is: " + this.price + " Is it sport car? " + this.isSportCar +
                " Engine operation system is: " + this.engineFuelOperationSystem + " The fuel capacity for the car is: " + this.fuelTankCapacity + " Free fuel for the car is: " + this.freeFuel);
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
