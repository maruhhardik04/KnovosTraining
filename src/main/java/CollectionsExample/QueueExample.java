package CollectionsExample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9,8,6,100,3,2,1,1,3,124,9,6,7);
        System.out.println(numbers);

        System.out.println("\nQueue\n");

        Queue<Integer> queue = new LinkedList<>(numbers);

        System.out.println(queue);
        System.out.println("Front of queue:"+queue.element());

        while (!queue.isEmpty())
        {
            System.out.println("Remove element "+queue.poll()+" from queue");
        }

        System.out.println("Queue is Empty:"+queue.isEmpty());

    }
}
