package SecondHomework;

public class Zad6_Homework2 {
    public static void main(String[] arg) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};
        //count is added to check for sure are all elements is in the first if statement and to print for the end message
        int count = 0;

        //if length are different they are not equals
        if(firstArray.length != secondArray.length){
            System.out.println("The array length is different and they are not equals!");
        }
        else{
            for (int i = 0; i < firstArray.length; i ++){
                if(firstArray[i] == secondArray[i]){
                    count++;
                    continue;
                }
                else {
                    System.out.println("The arrays are not equals!");
                    break;
                }
            }

            if(count == firstArray.length){

                System.out.println("Yes, arrays are equals!");
            }
        }
    }
}
/*
Задача 6
Дадени са два масива със стойности {1, 2, 3} и  {1, 2, 3}
да се състави програма, която проверява дали масивите са еднакви
 */
