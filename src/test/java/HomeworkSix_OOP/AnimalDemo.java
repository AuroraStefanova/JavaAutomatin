package HomeworkSix_OOP;

public class AnimalDemo {
    public static void main(String[] arg){

        Dog balkan =  new Dog(1, "Balkan", "Balkan sheep dog");
        Cat murlio = new Cat(5, "main cun", "Murlio");
        Bird colibri = new Bird(1, "Parrot");

        //dog
        System.out.println("Differences for the dog");

        Dog.play(balkan);
        Dog.bringStick();
        Dog.makeSomeNoise(balkan);

        //cat
        System.out.println("Differences for the cat");

        Cat.play(murlio);
        Cat.climb(murlio);
        Cat.makeSomeNoise(murlio);

        //bird
        System.out.println("Differences for the bird");

        Bird.makeSomeNoise(colibri);
        Bird.sing();
        Bird.fly(colibri);
        Bird.play(colibri);

    }
}
/*
Да се създаде един демонстративен** клас AnimalDemo с main метод**,
 в който се създават по един обект от всеки вид животно и се демонстрират разликите в методите play() и makeSomeNoise()
 */
