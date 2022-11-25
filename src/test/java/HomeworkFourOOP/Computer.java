package HomeworkFourOOP;

public class Computer {

    int years;
    double price;
    String operationSystem;

    public Computer(int years, double price, String operationSystem){
        this.years = years;
        this.price = price;
        this.operationSystem = operationSystem;

    }
    public Computer(int year, String operationSys){
        this.years = year;
        this.operationSystem = operationSys;

    }

    //compere computer prices
    public int comperePrice(Computer prices){

        if (this.price == prices.price){
            return 0;
        }
        else if(this.price > prices.price) {
            return -1;
        }
        else{
            return 1;
        }
    }
}
