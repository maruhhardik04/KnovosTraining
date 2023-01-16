package CollectionsExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class MapExampe {

    public static void main(String[] args) {

        String s="I went to the store to buy some milk, but when I got there, I discovered that the store was out of milk and I had to go to another store to find some milk";
        int frequencyOfCharacters=0;



        HashMap<Character,Integer> map = new LinkedHashMap<>();

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

        System.out.println(frequencyOfCharacters);
        map.forEach((k,v)-> System.out.println(k +":"+ v));

        String[] wordsArray=s.split("[^\\w']+");
        Hashtable<String,Integer> hashtable = new Hashtable<>();


        for (String value : wordsArray) {


            if (hashtable.containsKey(value)) {
                hashtable.replace(value, hashtable.get(value), hashtable.get(value) + 1);
            } else {
                hashtable.put(value, 1);
            }

        }

        hashtable.forEach((k,v)-> System.out.println(k +":"+ v));



    }

}
