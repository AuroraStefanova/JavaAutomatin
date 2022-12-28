package HomeworkSix_OOP;

public class AnimalDemo {
    public static void main(String[] arg){

        Dog balkan =  new Dog(1, "Balkan", "Balkan sheep dog");
        Cat murlio = new Cat(5, "main cun", "Murlio");
        Bird colibri = new Bird(1, "Parrot");

        //dog
        System.out.println("Differences for the dog");

        balkan.play();
        balkan.bringStick();
        balkan.makeSomeNoise();

        //cat
        System.out.println("Differences for the cat");

        murlio.play();
        murlio.climb();
        murlio.makeSomeNoise();

        //bird
        System.out.println("Differences for the bird");

        colibri.makeSomeNoise();
        colibri.sing();
        colibri.fly();
        colibri.play();

    }
}
/*
Да се създаде един демонстративен** клас AnimalDemo с main метод**,
 в който се създават по един обект от всеки вид животно и се демонстрират разликите в методите play() и makeSomeNoise()
 */
