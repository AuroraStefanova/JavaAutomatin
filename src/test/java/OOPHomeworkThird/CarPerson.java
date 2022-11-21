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
