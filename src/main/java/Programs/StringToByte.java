/**
 *  Converting string value to byte value
 *
 * @author Hardik Maru
 * */
package Programs;

public class StringToByte {

    public static void main(String[] args) {
        System.out.println(stringToByte("abc ds"));
    }

    /**
     * @param input given string
     * @return string input to its corresponding byte representation
     */
    public static String stringToByte(String input){

        if(input.isEmpty()){
            return input;
        }
        String output="";
        for(int i=0;i<input.length();i++){
            output+=(byte)input.charAt(i);
        }

        return output;
    }
}
