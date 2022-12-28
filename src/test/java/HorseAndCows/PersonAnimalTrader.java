package HorseAndCows;

import java.util.ArrayList;

public class PersonAnimalTrader extends Animal {

    String name;
    int money;
    int milk = 0;


    ArrayList<Cow> cowList = new ArrayList<Cow>();
    ArrayList<Horses> horsesArrayList = new ArrayList<Horses>();
    ArrayList<Animal> animalList = new ArrayList<Animal>();

    public void milkCow(){

        this.milk += cowList.get(0).milked();
       // this.milk += cow.milked();
    }

    public void sellMilk(){
        this.milk -= 1;
        this.money += 5; // cow.milkContent;
    }

    public void feedAnimal(Animal animal){
        animal.eat();
    }

    public void rideHorse(){
        //horse.run();
        horsesArrayList.get(0).run();
    }
    void byAnimal(Animal animal){
        this.money = this.money - animal.price;
        addAnimalToList(animal);

    }
    void addAnimalToList(Animal animal){
        this.animalList.add(animal);
    }

    void byHorse(Horses horse){
        this.money = this.money - horse.price;
        addHorseToList(horse);
    }

    void byCow(Cow cow){
        this.money = this.money - cow.price;
        addCowToList(cow);
    }

    void addHorseToList(Horses horse){

        this.horsesArrayList.add(horse);
    }
    void addCowToList(Cow cow){
        this.cowList.add(cow);
    }
    void groomingHorse(){

        horsesArrayList.get(0).groomed = true;
        this.horsesArrayList.get(0).price += 10;
    }
    void sellHorse(){

        for (int i = 0; i < horsesArrayList.size(); i++){
            //ако коня е грумиран
            System.out.println("Lets sell horse ");

            if(this.horsesArrayList.get(i).groomed == true){
                horsesArrayList.remove(i);
                this.money += 25;

            }
            else {
                horsesArrayList.remove(i);
                this.money += 20;
            }
        }
    }
    void sellCow(){
        for(int i= 0; i < cowList.size(); i++){
            cowList.remove(i);
            this.money += 20;
        }
    }
    void earnMoney(int amount){
        this.money = this.money + amount;
    }
    void showOf(){
       System.out.println("The person name is: " + this.name + " His earned money ara that sum: " + this.money + " The list of horses are: " );
       for (int i = 0; i < this.horsesArrayList.size(); i++){
           // toString();
           System.out.println(this.horsesArrayList.get(i).toString());
       }
       // System.out.println("The person name is: " + this.name + " His earned money ara that sum: " + this.money + " The list of Cow are: " );
//
       // for (int i = 0; i < this.cowList.size(); i++ ){
       //     System.out.println(this.cowList.get(i).toString());
       // }
    }
    public PersonAnimalTrader(String name, int money){

        this.name = name;
        this.money = money;
        //this.horseList = listOfHorses;

    }
   //  void byCow(Cow price){
   //      this.money = this.money
   // }
//
}
/*
- To class Person add:
    -> arraylist cows
    -> functionality - milkCow
    -> sell milk -> person earns 5 money when selling milk
    -> feed animal
    -> buy cow (if feeling brave, make this buy animal(to work for both, horse and cow), but not required)
    -> sell cow (if feeling brave, make this sell animal(to work for both, horse and cow), but not required)
    -> ride horse
 */
