package HomeworkFive_OOP;

public class Employee extends Person{
    double daySalary;

    public Employee(String name, int age, Boolean isMan, double daySalary) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
        this.daySalary = daySalary;
    }
    public double calculateOvertime(double hours){
        if(this.age < 18){
            //дължимата сума е 0
           return this.daySalary;
        }
        else {
            this.daySalary = (daySalary)* 1.5;
            return this.daySalary;
        }
    }

    public void showEmployeeInfo(){

        System.out.println("The name of the Employee is: " + this.name + " His age is: " + this.age + " And the gender is: " + this.isMan + " Daly salary is: " + this.daySalary);
    }
    @Override
    public String toString(){
        return this.name + ' ' + this.age + ' ' + this.isMan + ' ' + this.daySalary;
    }
}
/*
Класът Employee да наследява Person и да дефинира:
Полета:
– daySalary показва дневната заплата на работника
Конструктор които инициализира всичките му полета (собствени и
наследени)
Методи:
В случай че на работник се наложи да работи извън работно време,
на него му се дължи допълнителна сума пари (overtime) за часовете
които
е работил. Сумата се пресмята по следния начин: ако работника, няма
навършени 18 години, дължимата сума е 0. В противен случай, за всеки
отработен час, на работника се заплаща сумата която получава на час
(зависи от дневната заплата) умножена по 1,5.
– метод calculateOvertime(double hours) който пресмята и връща
стойността на сумата която му се дължи при работа извън работно
време
– метод showEmployeeInfo(), който показва информация за човека,
както и информация за дневната му заплата
 */
