package Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainDigit {
    public static void main(String[] args) {
        iscontainDigit("adkfjkfjalsd");
    }

    public static void iscontainDigit(String input){


        Pattern pattern=Pattern.compile("\\d");
        Matcher matcher=pattern.matcher(input);

        if(matcher.find()){
            System.out.println("Not possible");
            return;
        }

        System.out.println(input.charAt(input.length()-1));
    }
}
