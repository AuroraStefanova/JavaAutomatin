package HomeworkSix_OOP;

public class Bird extends Animal implements IAnimal {

    public Bird(int age, String breedType){
        super(age, breedType);
    }
    @Override
    public void makeSomeNoise() {
    System.out.println("Shhhhvi shviiii make a bird");
    }
    @Override
    public void play(){
    System.out.println("Bird swinging on the swing");
    }
    public void fly(){
    System.out.println("Bird fly to the nearest tree");
    }
    public void sing(){
    System.out.println("curulik churulik");
    }

}
/*
Bird - fly(), synk() - като метода synk може да се овърлоудва според броя птички,които имаме например при 2 птички звука е по-силе
 */