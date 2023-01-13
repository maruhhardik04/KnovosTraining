package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(6,5,5,2,8,1,1,9);
        List<Integer> odd = Arrays.asList(1,3,5,7,9);
        List<Integer> even = Arrays.asList(2,4,6,8,10);



        Stream<Integer> stream=nums.stream();

        System.out.println(nums);

        System.out.println(" \nStream filter");

        nums.stream()
                .filter(n -> n%2==0)
                .forEach(n -> System.out.println(n));

        System.out.println(" \nStream map");

        nums.stream()
                .map(n-> n*2)
                .forEach(n-> System.out.println(n));

        System.out.println(" \nStream flatmap");

        List<List<Integer>> numbers = new ArrayList<List<Integer>>();
        numbers.add(nums);
        numbers.add(odd);
        numbers.add(even);

        numbers.stream()
                .flatMap(n-> n.stream())
                .forEach(n-> System.out.print(" "+n));


        System.out.println("\n\nStream distinct.");

        nums.stream()
                .distinct()
                .forEach(n-> System.out.println(n));
    }

}
