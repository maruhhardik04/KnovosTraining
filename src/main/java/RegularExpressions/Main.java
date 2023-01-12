package RegularExpressions;



public class Main {


    public static void main(String[] args) {

        String str = "man sun mop run";


        Re.regex("m\\w\\w",str);
        Re.find();

        Re.regex("m\\w+ s\\w+ m\\w+ r\\w+",str);
        Re.matches();

        Re.regex("[0-9]{10}","1234567890");
        Re.matches();

        Re.regex("\\w+@{1}\\w+","maruhardik04@gmail.com");
        Re.find();



    }

}
