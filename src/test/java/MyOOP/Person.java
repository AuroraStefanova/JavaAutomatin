package MyOOP;

import java.util.ArrayList;

public class Person {

    String name;
    int money;
    // list ot kone
    ArrayList<Horse> horseList = new ArrayList<Horse>();

    void byHorse(Horse horse){
        this.money = this.money - horse.price;
        addHorseToList(horse);

    }
    void groomingHorse(){

        horseList.get(0).groomed = true;
        this.horseList.get(0).price += 10;
    }

    void sellHorse(){
        //premahni ot lista
        for (int i = 0; i <= horseList.size(); i++){
            //ако коня е грумиран
            System.out.println("Lets sell horse ");

            if(this.horseList.get(i).groomed == true){
                horseList.remove(i);
                this.money += 25;
            }

        }
    }

    void earnMoney(int amount){
        this.money = this.money + amount;
    }
    //method how person name, money and Horses
    void showOf(){
        System.out.println("The person name is: " + this.name + " His earned money ara that sum: " + this.money + " The list of horses are: " );

        for (int i = 0; i < this.horseList.size(); i++){
           // toString();
            System.out.println(this.horseList.get(i).toString());
        }
    }
    void addHorseToList(Horse horse){
        //this.horseList( horse)
         this.horseList.add(horse);
    }
    public Person(String name, int money){

        this.name = name;
        this.money = money;
        //this.horseList = listOfHorses;

    }
//    @Override
//    public String toString(){
//
//        for (int i = 0; i< horseList.size(); i++){
//
//            String list = horseList.get(i).toString();
//            System.out.println("String: " + list);
//            return list;
//        }
//    }

}
/*
Person pesho = new Person(...)
pesho.earnMoney(kolichestvo)
pesho.byHorse(horse) <- v tova e logikata koqto smqta Pesho ima li pari
pehso.groomsHorse(horse.name)
pesho.sellsGroomedHorse()
 */