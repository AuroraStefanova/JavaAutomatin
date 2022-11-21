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
