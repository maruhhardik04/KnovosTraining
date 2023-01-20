/**
 * The CountFrequency class counts the frequency of characters and words in a given string.
 * The class also prints out the top 9 most frequent characters and words, and the bottom 9 least frequent characters and words
 *
 * @author Hardik Maru
 */

package Programs;

import java.util.*;

public class CountFrequency {

    public static void main(String[] args) {

        String s="I went to the store to buy some milk, but when I got there, I discovered that the store was out of milk and I had to go to another store to find some milk";
        int frequencyOfCharacters=0;



        Map<Character,Integer> map = new HashMap<>();

        for (int  i = 0;  i < s.length();  i++) {

            if (Character.isAlphabetic(s.charAt(i)))
            {
                if(map.containsKey(s.charAt(i)))
                {
                    map.replace(s.charAt(i),map.get(s.charAt(i)), map.get(s.charAt(i))+1);
                }
                else
                {
                    map.put(s.charAt(i),1);
                }
                frequencyOfCharacters++;
            }
        }


        String[] wordsArray=s.split("[^\\w']+");
        Hashtable<String,Integer> hashtable = new Hashtable<>();

        for (String value : wordsArray) {


            if (hashtable.containsKey(value)) {
                hashtable.replace(value, hashtable.get(value), hashtable.get(value) + 1);
            } else {
                hashtable.put(value, 1);
            }

        }


        System.out.println("Frequency of characters:"+frequencyOfCharacters);
        System.out.println("Frequency of words:"+wordsArray.length);

        Map<Character,Integer> treeMap=new TreeMap<>(new ValueComparator(map));
        treeMap.putAll(map);

        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(treeMap.entrySet());


        System.out.println("\nHigher frequency characters:\n");
        for (int i = 0; i < 9; i++) {
            Map.Entry<Character,Integer> entry=entries.get(i);
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("\nLower frequency characters:\n");
        for (int i =entries.size()-1; i > entries.size()-10 ; i--) {
            Map.Entry<Character,Integer> entry=entries.get(i);
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


        Map<String,Integer> stringIntegerMap=new TreeMap<>((o1, o2) -> hashtable.get(o1) <= hashtable.get(o2) ? 1 : -1);
        stringIntegerMap.putAll(hashtable);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(stringIntegerMap.entrySet());

        System.out.println("\nHigher frequency words:\n");
        for (int i = 0; i < 9; i++) {
            Map.Entry<String,Integer> entry=list.get(i);
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("\nLower frequency words:\n");
        for (int i =list.size()-1; i > list.size()-10 ; i--) {
            Map.Entry<String,Integer> entry=list.get(i);
            System.out.println(entry.getKey()+":"+entry.getValue());
        }



    }

}
