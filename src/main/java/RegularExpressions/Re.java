package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re {

    private static Pattern pattern;
    private static Matcher matcher;


    public static void regex(String regularExpression,String string)
    {
         pattern=Pattern.compile(regularExpression);
         matcher=pattern.matcher(string);
    }

    public static void find()
    {

        while (matcher.find())
        {
            System.out.println(matcher.group());
        }

        if (!matcher.find(0))
        {
            System.out.println("Not found");
        }
    }


    public static void matches()
    {
            if (matcher.matches()){
                System.out.println(matcher.group());
            }
            else {
                System.out.println("Not match");
            }
    }



}
