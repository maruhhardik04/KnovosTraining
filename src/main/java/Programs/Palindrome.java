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

    public static int closetPalindrom(int number,String side){

        number = (side=="left")? number-1 : number+1;

        if(checkPalindrom(String.valueOf(number))){
            return number;
        }
        return closetPalindrom(number,side) ;

    }


    public static boolean checkPalindrom(String number){
        int n=number.length();


        for(int i=0;i<n/2;i++){
            if(number.charAt(i) != number.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }
}
