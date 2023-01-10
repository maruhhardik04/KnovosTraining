package TernaryOperator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number:");
        int number=scanner.nextInt();

        String msg=(number%2==0)?"Even":"Odd";

        System.out.println(number +" is "+msg);


    }
}
