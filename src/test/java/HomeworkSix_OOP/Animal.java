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
