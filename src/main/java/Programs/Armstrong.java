package Programs;

public class Armstrong {

    public static void main(String args[])
    {
        System.out.println(isArmstrong(1634));
    }

    public static boolean isArmstrong(int input){

        String number=String.valueOf(input);
        int armstrongNumber=0;


        for(int i=0;i<number.length();i++){
            armstrongNumber += Math.pow(Character.getNumericValue(number.charAt(i)),number.length());
        }

        return armstrongNumber==input;
    }
}
