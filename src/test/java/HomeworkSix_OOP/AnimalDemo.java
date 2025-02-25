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
Задача 1

Да се създаде интерфейс IAnimal в който има метод makeSomeNoise()
Да се създаде абстрактен клас Animal с общи черти за всички животни помислете внимателно. Hint: нека да има общ метод play() затова как играят различните животни
Да се създадат 3 събкласа Bird,Cat и Dog които наследяват клас Animal, съответно имат специфични методи и овъррайдват общите за parent класа
Допълнителни методи в клас:
Bird - fly(), synk() - като метода synk може да се овърлоудва според броя птички,които имаме например при 2 птички звука е по-силен
Cat - climp()
Dog - bringStick()
Да се създаде един демонстративен** клас AnimalDemo с main метод**, в който се създават по един обект от всеки вид животно и се демонстрират разликите в методите play() и makeSomeNoise()
 */
