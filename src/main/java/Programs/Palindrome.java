/**
 * Given a string n representing an integer, return the closest integer (not including itself),
 * which is a palindrome.
 * If there is a tie, return the average of both number and at what distance the number is if
 * there is no tie
 *
 * @author Hardik Maru
 */
package Programs;

public class Palindrome {
    public static void main(String[] args) {

        int number=10;


        int closetLeftPalindrom = closetPalindrom(number,"left");
        int closetRightPalindrom = closetPalindrom(number,"right");

        int closetLeftPalindromDistance = number-closetLeftPalindrom;
        int closetRightPalindromDistance = closetRightPalindrom-number;



        if(closetLeftPalindromDistance == closetRightPalindromDistance)
        {
            System.out.println("Output : "+closetLeftPalindrom+" and "+closetRightPalindrom);
            System.out.println("Average of both numbers : "+((closetLeftPalindrom+closetRightPalindrom)/2));
        }
        else if(closetLeftPalindromDistance < closetRightPalindromDistance){

            System.out.println("Output : "+closetLeftPalindrom);
            System.out.println("Distance : "+closetLeftPalindromDistance);

        }
        else
        {
            System.out.println("Output : "+closetRightPalindrom);
            System.out.println("Distance : "+closetRightPalindromDistance);
        }


    }

    /**
     * Find the closest palindrome number to the given number
     * @param number the given number
     * @param side "left" or "right" indicating whether to check the closest number on the left or right side of the given number
     * @return the closest palindrome number
     */
    public static int closetPalindrom(int number,String side){

        number = (side.equals("left"))? number-1 : number+1;

        if(checkPalindrom(number)){
            return number;
        }
        return closetPalindrom(number,side) ;

    }

    /**
     * Check if the given number is a palindrome
     * @param input the given number
     * @return true if the number is a palindrome, false otherwise
     */
    public static boolean checkPalindrom(int input){
        String number = String.valueOf(input);
        int n=number.length();

        for(int i=0;i<n/2;i++){
            if(number.charAt(i) != number.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }

}
