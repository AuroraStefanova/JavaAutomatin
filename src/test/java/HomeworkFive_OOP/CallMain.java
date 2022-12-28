package HomeworkFive_OOP;

public class CallMain {
    public static void main(String[] arg){

        Person[] arrayOfPersons = new Person[10];

        //two objects from type person
        Person mimi = new Person("Maria", 25, false);
        Person galin = new Person("Galin", 14, true);

        //two objects from type person
        Student pesho = new Student("Petar Petrov", 22, true, 4.65);
        Student anna = new Student("Anna Ivanova", 19, false, 5.00);

        //two objects from type Employee
        Employee georgi = new Employee("Georgi Georgiev", 32, true, 25.87);
        Employee pavel = new Employee("Pavel Pavlov",47, true, 98.00);

        arrayOfPersons[0] = mimi;
        arrayOfPersons[1] = galin;
        arrayOfPersons[2] = pesho;
        arrayOfPersons[3] = anna;
        arrayOfPersons[4] = georgi;
        arrayOfPersons[5] = pavel;

        for(int i = 0; i < arrayOfPersons.length; i++){
            if (arrayOfPersons[i] == null){
                continue;
            }
            else{
                //System.out.println(arrayOfPersons[i].toString());

                 if (arrayOfPersons[i] instanceof Employee) {
                    //DOSTAFF
                     ((Employee) arrayOfPersons[i]).showEmployeeInfo();
                }
                else if (arrayOfPersons[i] instanceof Student) {
                    //DOSTAFF
                     ((Student) arrayOfPersons[i]).showStudentInfo();
                }
                else {
                     arrayOfPersons[i].showPersonInfo();
                 }
            }
        }
        for (int i = 0; i < arrayOfPersons.length; i++){
            if (arrayOfPersons[i] == null){
                continue;
            }
            else{
                if(arrayOfPersons[i] instanceof Employee){
                    //((Employee) arrayOfPersons[i]).calculateOvertime(2);
                    System.out.println("Overtime of the Employee is: " + ((Employee) arrayOfPersons[i]).calculateOvertime(2));
                }
            }
        }

    }
}
/*
Да се напише и демонстративен клас с main метод в който:
Да се състави масив от 10 елемента от тип Person.
Да се създадът по два обекта от тип Person, Student и Employee и да се вкарат в масива от хора.
Да се обходим масива и в зависимост от това дали обекта е оттип Person, Student или Employee да се извика съответно метода showPersonInfo, showStudentInfo или showEmployeeInfo.
Да се обходи още веднъж масива с хора и за всеки човек, койтое работник, да се изведе на екрана сумата, която му се дължи при2 часа работа извън работно време.
 */
