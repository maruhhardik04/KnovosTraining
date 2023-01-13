package StringExample;

public class Main {

    public static void main(String[] args) {

        String s="This is a string    ";
        String s1="     ";

        System.out.println("charAt(position)  Returns the character at the specified index (position) : "+s.charAt(5));
        System.out.println("indexOf() Returns the position of the first found occurrence of specified characters in a string : "+s.indexOf('i'));
        System.out.println();

        System.out.println("length() Returns the length of this string s : "+s.length());
        System.out.println("length() Returns the length of this string s1 : "+s1.length());


        System.out.println();
        System.out.println("s1 : "+ s1);
        System.out.println("isEmpty() Checks whether a string is empty or not : " + s1.isEmpty());
        System.out.println("isBlank() Returns true if the string is empty or contains only white space codepoints, otherwise false : " + s1.isBlank());

        System.out.println("trim() Removes whitespace from both ends of a string : "+ s.trim());

        System.out.println();
        System.out.println("toUpperCase() Converts a string to upper case letters : "+s.toUpperCase());
        System.out.println("toUpperCase() Converts a string to lower case letters : "+s.toLowerCase());

        System.out.println("contains() Returns true if and only if this string contains the specified sequence of char values :" + s.contains("is"));


    }
}
