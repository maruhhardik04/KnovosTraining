/**
 * The ContainDigit class determines whether a given string contains a digit or not.
 * If the string contains a digit, the method prints "Not possible" and returns.
 * If the string does not contain a digit, the method prints the last character of the string.
 *
 * @author Hardik Maru
 */

package Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainDigit {
    public static void main(String[] args) {
        iscontainDigit("adkfjkfjalsd");
    }


    /**
     * The iscontainDigit method checks if a given string contains a digit or not.
     *
     * @param input the string to check
     * @return "Not possible" if the input contains a digit, last character of the string otherwise
     */
    public static String iscontainDigit(String input){


        Pattern pattern=Pattern.compile("\\d");
        Matcher matcher=pattern.matcher(input);

        if(matcher.find()){

            return "Not possible";
        }

        return String.valueOf(input.charAt(input.length()-1));
    }
}
