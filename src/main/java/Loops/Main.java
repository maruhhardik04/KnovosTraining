package Loops;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,5,9,10};


        System.out.println("For Loop");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" "+numbers[i]);
        }

        System.out.println("\n\nFor Each Loop");
        for(int num:numbers)
        {
            System.out.print(" "+num);
        }


        int i=0;
        System.out.println("\n\nWhile Loop");
        while(i < numbers.length)
        {
            System.out.print(" "+numbers[i]);
            i++;
        }

        System.out.println("\n\nDo While Loop");
         i=0;

         do {

            System.out.print(" "+numbers[i]);
            i++;
        }while (i<numbers.length);


        System.out.println("\n\n Loop inside loop");
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
