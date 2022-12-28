package HomeworkSix_OOP;

public class Cat extends Animal implements IAnimal {

    String name;

public Cat(int age, String breadType, String name){
    super(age, breadType);
    this.name = name;
}
    public static void makeSomeNoise(Cat cat) {
    System.out.println(" Cat make Meau Meau and mhrrrrrrrr");
    }
    public static void climb(Cat cat){
    System.out.println("Cat is climb to the sofa");
    }
    public static void play(Cat cat){
    System.out.println(" Cat play with carpet");
    }
}
/*
Cat - climp()
 */