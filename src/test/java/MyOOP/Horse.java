package MyOOP;

public class Horse {

    String name;
    int price;
    boolean groomed;

    // groomed method
    void horseGrooming(){

        if(this.groomed == false){
            this.price = this.price + 10;

        /*
            this.price = this.price + 10;
            this.groomed = true;*/
        }
    }

    public Horse(String name, int price, boolean groomed){
        this.name = name;
        this.price = price;
        this.groomed = groomed;
    }
}
/*
Person pesho = new Person(...) - check
pesho.earnMoney(kolichestvo) - check
pesho.byHorse(horse) <- v tova e logikata koqto smqta Pesho ima li pari
pehso.groomsHorse(horse.name)
pesho.sellsGroomedHorse()
 */