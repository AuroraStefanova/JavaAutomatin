package MyOOP;

public class CallingAll {

        public static void main(String[] arg){

            Person peshoPetrov = new Person("Pesho", 0);

            peshoPetrov.earnMoney(20);

            Horse vihren = new Horse("Vihren", 15, false);
//            Horse toshkoAfrikanski = new Horse("Toshko Afrikanski", 15, false);

            peshoPetrov.byHorse(vihren);

            peshoPetrov.addHorseToList(vihren);
            peshoPetrov.groomingHorse();

            peshoPetrov.showOf();

            peshoPetrov.sellHorse();

            System.out.println("After seling horse");

            peshoPetrov.showOf();


        }
    }
/*
Person pesho = new Person(...)
pesho.earnMoney(kolichestvo)
pesho.byHorse(horse) <- v tova e logikata koqto smqta Pesho ima li pari
pehso.groomsHorse(horse.name)
pesho.sellsGroomedHorse()
 */
