package CollectionsExample;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9,8,6,100,3,2,1,1,3,124,9,6,7);
        System.out.println(numbers);

        System.out.println("\nPriority Queue\n");
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(numbers);

        System.out.println(priorityQueue);


    }
}
