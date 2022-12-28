package HomeworkFive_OOP;

public class Student extends Person{
    double score;

    public Student(String name, int age, boolean isMan, double score){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
        this.score = score;
    }
    public void showStudentInfo(){
        System.out.println("The name of the Student is: " + this.name + " His age is: " + this.age + " And the gender is: " + this.isMan + " The student scope is: " + this.score);

    }
    @Override
    public String toString(){
        return this.name + " " + this.age + ' ' + this.isMan + ' ' + this.score;
    }

}
/*
Класът Student наследяващ Person, репрезентиращ ученик да има
Полета:
– score - показва оценката на ученика (число между 2 и 6, не е
задължително да е цяло)
Единствен конструктор:
– Student(String name, int age, boolean isMan, double score)
задаващ стойности и на наследените полета

Метод showStudentInfo() който показва информация за човека и
информация за оценката му (чрез надписи на екрана)
 */

