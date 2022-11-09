package SecondHomework;

public class Zad5_Homework2 {
    public static void main(String[] arg){
        int[] createdArray = {10, 12, 1, 8, 4};

        //creating new array with the same number elements
        int[] secondArray = new int[createdArray.length];
        //Check length for second array
        System.out.println("Second array length is: " + secondArray.length);

        //first way to copy elements
        secondArray = createdArray;

        System.out.println("Printing Second array elements!");
        for (int i = 0; i <secondArray.length; i++){
            System.out.println(secondArray[i]);
        }

        //second way to copy elements from the first array
        System.out.println("Printing Second array elements, with adding in different way!");
        for (int j = 0; j < createdArray.length; j++){
            secondArray[j] = createdArray[j];
            System.out.println("Element is: " + secondArray[j]);

        }
    }
}

