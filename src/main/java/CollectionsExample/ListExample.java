package CollectionsExample;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        System.out.println(arrayList);

        List<Integer> linkedList=new LinkedList<>(arrayList);
        System.out.println(linkedList);






    }
}
