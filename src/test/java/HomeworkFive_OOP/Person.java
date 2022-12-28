package HomeworkFive_OOP;

public class  Person {
    String name;
    int age;
    Boolean isMan;

    public Person(String name, int age, Boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public Person() {
    }

    public void showPersonInfo(){

            System.out.println("The name of the person is: " + this.name + " His age is: " + this.age + " And the gender is: " + this.isMan);
    }
    public String toString(){
        return this.name + " " + this.age + ' ' + this.isMan;
    }
}
/*
Да се направи иерархия от класовете Person, Student и Employee
Класът Person репрезентиращ човек да има следните
Полета:
– name - име
– age - години
– isMan - поле, показващо пола

Коструктори:
– Единствен конструктор, с параметри за всичките полета на класа
Метод:

– Метод showPersonInfo, който показва информация за човека
(изписва на конзолата стойността на всичките му полета по
подходящ начин)
 */
