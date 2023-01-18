package CollectionsExample;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(9,8,6,100,3,2,1,1,3,124,9,6,7);
        System.out.println("Numbers:"+numbers);

        System.out.println("\nHashSet\n");
        Set<Integer> hashSet=new HashSet<>(numbers);
        System.out.println(hashSet);

        System.out.println("\nTreeSet\n");
        Set<Integer> treeSet=new TreeSet<>(numbers);
        System.out.println(treeSet);


        System.out.println("\nLinkHashSet\n");
        Set<Integer>  linkedHashSet=new LinkedHashSet<>(numbers);
        System.out.println(linkedHashSet);


    }
}
