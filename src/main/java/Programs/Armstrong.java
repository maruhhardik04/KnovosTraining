/**
 * The Armstrong class checks if a given number is an Armstrong number.
 * An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
 *
 * @author Hardik Maru
 */

package Programs;

public class Armstrong {

    public static void main(String args[])
    {
        System.out.println(isArmstrong(1634));
    }

    /**
     * The isArmstrong method checks if a given number is an Armstrong number.
     *
     * @param input the number to check
     * @return true if the input is an Armstrong number, false otherwise
     */
    public static boolean isArmstrong(int input){

        String number=String.valueOf(input);
        int armstrongNumber=0;


        for(int i=0;i<number.length();i++){
            armstrongNumber += Math.pow(Character.getNumericValue(number.charAt(i)),number.length());
        }

        return armstrongNumber==input;
    }
}
