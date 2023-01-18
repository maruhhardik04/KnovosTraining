package CollectionsExample;

import java.util.*;

public class DqueueExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9,8,6,100,3,2,1,1,3,124,9,6,7);
        System.out.println(numbers);

        System.out.println("\nDequeue\n");
        Deque<Integer> deque=new LinkedList<>(numbers);

        System.out.println(deque);
        System.out.println("Front of the deque:"+deque.getFirst());
        System.out.println("Rear of the deque:"+deque.getLast());

        while (!deque.isEmpty())
        {
//            try {
                System.out.println("Remove elements from front:"+deque.pollFirst());
                System.out.println("Remove elements from rear:"+deque.pollLast());
                System.out.println();
//            }catch (NoSuchElementException e)
//            {
//                System.out.println("Deque is Empty Nothing to remove");
//            }

        }

    }
}
