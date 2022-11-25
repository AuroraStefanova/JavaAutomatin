package FirstHomework;

public class Zad7 {
    public static void main(String[] arg){

        for (int i = 1; i <= 100; i++){
            if (i >= 54 && i <= 74 ){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
/*
Задача 7:
Да се изведат числата от 1 до 100 без числата от 54 до 74. След извършените операции да се отпечатат получените резултати.
 (hint - continue)
 */