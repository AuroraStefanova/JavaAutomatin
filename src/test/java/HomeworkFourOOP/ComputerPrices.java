package HomeworkFourOOP;

public class ComputerPrices {
    public static void main(String[] arg){

        //declaring first computer with year and op. System
        Computer  firstComputer = new Computer(2022, "Linux");
        firstComputer.price = 2155.99;


        //declaring second computer with year, price and op. system
        Computer  secondComputer = new Computer(2021, 2156.99, "Windows");

        //calling method compere price
        //firstComputer.comperePrice(secondComputer);
        System.out.println(secondComputer.comperePrice(firstComputer));

    }
}
/*
Homework 4:
Задача
Създайте клас Computer със следните полета от тип:
int year,
double price,
String operationSystem

Класът Computer да има следния конструктор:
констуктор с параметри Computer(int year, double price, String operationSystem), който да инициализира всички полета със стойноститеподадени му като аргументи.
С помоща на ключовата дума THIS

В същия клас създайте метод int comparePrice(Computer compare), който сравнява цените на 2 компютъра и връща стойност (използвайте return).
 Ако цената на първия компютър (този, за който се вика метода) е по-висока от тази на компютъра подаден като аргумент, метода връща -1.
 Ако цената на компютъра подаден като аргумент (втория компютър) е по-високата, се връща 1, а ако са равни, метода връща стойност 0

Стойностите/цените на двата компътъра да бъдат изнесени в отделен клас ComputerPrices с main метод.
Цената на първия компютър да бъде декларирана с помоща на обект от клас Computer,
 а цената на втория компютър да бъде извлечена с подаване на стойности в конструктора на клас Computer - Computer(int year, double price, String operationSystem)
 */
