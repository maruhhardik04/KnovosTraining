package Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] stringArray = {"apple", "banana", "orange"};

        int[] number = new int[5];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;

//        Access the elements of an array

        System.out.println("Access the elements of an array:"+stringArray[0]);

//        Change the value of a specific element
        System.out.println("Before changing array element :"+Arrays.toString(number));
        number[0]=0;
        System.out.println("After changing array element :"+Arrays.toString(number));

//        Find out how many elements an array has

        System.out.println("Elements of an array using length property:"+stringArray.length);

        int size=0;
        for (int i:number)
        {
            size++;
        }

        System.out.println("Array Size:"+size);


    }

}
