package HorseAndCows;

public class TreadAnimal {
    public static void main(String[] arg) {

        PersonAnimalTrader peshoPetrov = new PersonAnimalTrader("Pesho", 0);

        peshoPetrov.earnMoney(60);

        //Horses vihren = new Horses("Vihren", 15, false);
      Cow milka = new Cow();
      milka.setName("Milka");
      milka.setPrice(20);
      milka.setMilkContent(80);

      peshoPetrov.byCow(milka);
      System.out.println("LALALAALAL");
      peshoPetrov.showOf();

      peshoPetrov.milkCow();
      peshoPetrov.milkCow();

      peshoPetrov.feedAnimal(milka);
      peshoPetrov.sellMilk();

      System.out.println("LALALAALAL 2");
      peshoPetrov.showOf();

      peshoPetrov.sellCow();
      System.out.println("LALALAALAL 3");
      peshoPetrov.showOf();

        //horsA
        Horses vihren = new Horses();
        vihren.setName("Vihren");
        vihren.setPrice(20);
        vihren.setEnergy(100);

        peshoPetrov.byHorse(vihren);
        System.out.println("BLABLA");
        peshoPetrov.showOf();

        peshoPetrov.rideHorse();
        System.out.println("Lets see the energy: " + vihren.getEnergy());
        System.out.println("BLABLA");
        peshoPetrov.showOf();

        peshoPetrov.feedAnimal(vihren);
        System.out.println("BLABLA 2");
        peshoPetrov.showOf();
        System.out.println("Lets see the energy: " + vihren.getEnergy());

        peshoPetrov.sellHorse();
        System.out.println("BLABLA 3");
        peshoPetrov.showOf();

        // TODO
      //  fix methods to work like the following:
      //  peshoPetrov.buyAnimal(horse);
      //  peshoPetrov.buyAnimal(cow);

      //  peshoPetrov.sellAnimal(animalName) // example peshoPetrov.sellAnimal("Milka")
      //  peshoPetrov.feedAnimal(animalName);
      //  peshoPetrov.milkCow(cowName);




        // System.out.println(milka.getName());
       // milka.setPrice(10);
//
       // System.out.println(milka.getPrice());
       // milka.setMilkContent(10);
//
       // milka.milked();
       // System.out.println(milka.milkContent);
//
       // milka.eat();
       // System.out.println(milka.milkContent);
       // //create horse, set and get his name,
       // Horses tosko =  new Horses();
       // tosko.setName("Toshko");
       // System.out.println(tosko.getName());
//
       // tosko.setEnergy(30);
       // System.out.println(tosko.getEnergy());
//
       // tosko.run();
       // System.out.println(tosko.getEnergy());
//
       // tosko.eat();
       // System.out.println(tosko.getEnergy());






     /*   peshoPetrov.byHorse(tosko);

        peshoPetrov.addHorseToList(tosko);

        peshoPetrov.groomingHorse();

        peshoPetrov.showOf();

        peshoPetrov.sellHorse();

        System.out.println("After seling horse");

        peshoPetrov.showOf();

*/

    }
}
/*
/* Create a class Person with two fields – name and age.
     * Age can be left unspecified (may contain null value. Override ToString()
     * to display the information of a person and if age is not specified – to say so.
     * Write a program to test this functionality.

        Create class Horse, which has attributes: name - string, price - integer, groomed - boolean. When horse gets groomed, price of the horse is increased by amount of 10.
        Create class Person, that has:
        - Attributes: name - string, money - integer, array of horses- well array of horses.
        - Functionalities: Buy horse, Sell horse, Groom Horse, Earn Money, Show off > this should show person name, money and Horses
        Based on the above, create person that:
        Earns 20 ->  buys one ungroomed horse for 15 -> grooms the horse -> sells that horse for 25.
        Shows off > Here the person should have: name: Whatever you've added, money: 25
        Horses: {name: whatever you've added, for price 15, false for groomed}
        Tip: For showing off person and horse details, you can check this:
        https://www.delftstack.com/howto/java/print-object-in-java/?fbclid=IwAR2ZpIHw3Znn9Ro6s3xmOijNC2vo6AYuX2oWj6WkUvL44M0RYL_QxF_qn-4#how-to-print-objects


        Since Pesho has made some money from selling and grooming horses, Pesho decided to become an animal trader.
He wants to also work with cows and milk them.
Your job is to change the previous implementation a bit, by following this:
- Create base class Animal, this class should have common fields and functionalities for horse and cow(you should figure out what they are).
- To class horse add:
    -> field energy (min 0, max 100) - Use getter/setter for validation
    -> functionality eat - one call of this function, removes 20 energy
    -> functionality run - one call of this function, restores 20 energy
- To class Person add:
    -> arraylist cows
    -> functionality - milkCow
    -> sell milk -> person earns 5 money when selling milk
    -> feed animal
    -> buy cow (if feeling brave, make this buy animal(to work for both, horse and cow), but not required)
    -> sell cow (if feeling brave, make this sell animal(to work for both, horse and cow), but not required)
    -> ride horse
- Create class cow, that has:
    -> fields - name, price, milkContent(min 0, max 100),
    -> functionality eat - one call of this function, removes 20 milk
    -> functionality milked - one call of this function, restores 20 milk

    Pesho, buys a cow for 20, milks the cow twice, feeds the cow then sells the cow.
    Pesho buys a horse, rides the horse, feeds it, then sells it
 */




