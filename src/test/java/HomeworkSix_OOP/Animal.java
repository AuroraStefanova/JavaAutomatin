package HomeworkSix_OOP;

public abstract class Animal {
     int age;
     String breadType;

     public Animal (int age, String breadType){
         this.age = age;
         this.breadType = breadType;

     }
    public void play(){
         System.out.println("All animal play different");
    }
}
/*
Да се създаде абстрактен клас Animal с общи черти за всички животни
помислете внимателно. Hint: нека да има общ метод play() затова как играят различните животни
 */
