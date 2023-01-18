package CollectionsExample;

import java.util.*;

public class StackExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9,8,6,100,3,2,1,1,3,124,9,6,7);

        System.out.println("\nStack\n");
        Stack<Integer> stack = new Stack<>();

        stack.addAll(numbers);

        System.out.println("Stack Elements : "+stack);
        System.out.println("Top of the stack: "+stack.peek());
        System.out.println("Searching 100 inside the stack : "+stack.search(100));

         while (!stack.isEmpty())
                System.out.println("Pop "+stack.pop()+" from stack");





    }

}
