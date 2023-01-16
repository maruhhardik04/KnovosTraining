package LambdaExpression;


import java.util.*;


public class Main {

    public static void main(String[] args) {


        System.out.println("Lambda with Multiple Statements");
        List<String> names=Arrays.asList("Hardik","Yash","Harshit","Sumit");

        Drawable drawable=()->{
            System.out.println("Lambda with foreach Loop");
            List<Integer> numbers=Arrays.asList(3, 1, 5, 9, 10, 14, 6, 8);
            numbers.forEach(n-> System.out.print(n+" "));
        };
        drawable.draw();

        System.out.println("Using lambda expression to run thread");
        Runnable runnable=()-> System.out.println("Thread running....");
        Thread thread=new Thread(runnable);
        thread.start();


        System.out.println("Lambda with Comparator");

        Comparator<String> comparator = (o1, o2) -> o1.length() > o2.length() ? 1 : -1;
        Collections.sort(names,comparator);
        System.out.println(names);



    }

}
