package HomeworkSix_OOP;

public class Bird extends Animal implements IAnimal {

    public Bird(int age, String breedType){
        super(age, breedType);
    }
    public static void makeSomeNoise(Bird bird) {
    System.out.println("Shhhhvi shviiii make a bird");
    }
    public static void play(Bird bird){
    System.out.println("Bird swinging on the swing");
    }
    public static void fly(Bird bird){
    System.out.println("Bird fly to the nearest tree");
    }
    public static void sing(){
    System.out.println("curulik churulik");
    }

}
/*
Bird - fly(), synk() - като метода synk може да се овърлоудва според броя птички,които имаме например при 2 птички звука е по-силе
 */