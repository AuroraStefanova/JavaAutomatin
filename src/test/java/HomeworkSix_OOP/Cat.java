package HomeworkSix_OOP;

public class Cat extends Animal implements IAnimal{

    String name;

    public Cat(int age, String breadType, String name){
        super(age, breadType);
        this.name = name;
    }
    @Override
    public void makeSomeNoise() {
    System.out.println(" Cat make Meau Meau and mhrrrrrrrr");
    }
    public void climb(){
    System.out.println("Cat is climb to the sofa");
    }
    @Override
    public void play(){
    System.out.println(" Cat play with carpet");
    }
}
/*
Cat - climp()
 */