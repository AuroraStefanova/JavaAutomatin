package HomeworkSix_OOP;

public class Dog extends Animal implements IAnimal{
    String name;
    public Dog(int age, String name, String breedType){
        super(age, breedType);
        this.name = name;
    }
    public static void makeSomeNoise(Dog dog){
        System.out.println("The dog make noise Bay Bau and Grrrrrrrrrrrrr");
    }
    public static void play(Dog dog){
        System.out.println("Dog can bring bow but not only");
        bringStick();
    }
    public static void bringStick(){
        System.out.println("Dog run and bring back the stick");
    }
}
