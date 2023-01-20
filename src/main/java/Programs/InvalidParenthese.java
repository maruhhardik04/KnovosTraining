package Programs;
import java.util.*;


public class InvalidParenthese {

    public static void main(String[] args) {
        System.out.print(invalidParenthese(")123(abc))(456"));
    }

    public static String removeInvalidParenthese(String input){

        if(input.isBlank()){
            return input;
        }

        Map<Integer, Character> map=new HashMap<>();
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> array=new ArrayList<>();
        StringBuilder output= new StringBuilder();

        for(int i=0;i<input.length();i++){
            map.put(i,input.charAt(i));
        }

        map.forEach((k,v)-> {
            if(v=='('){
                queue.add(k);
            }

            if(v==')'){
                if(queue.size()==0){
                    array.add(k);
                }else{
                    queue.remove();
                }

            }

        });

        if(array.size() != 0){
            for(Integer i:array){
                map.remove(i);
            }
        }

        if(queue.size() != 0){
            for(Integer i:queue){
                map.remove(i);
            }
        }


        for(Character c:map.values()){
            output.append(c);
        }

        return output.toString();
    }



    public static String invalidParenthese(String input)
    {
        if (input.isBlank()) return input;

        StringBuilder output = new StringBuilder();
        int openParenCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(')
            {
                openParenCount++;
            } else if (c ==')') {
                    if (openParenCount > 0)
                    {
                        openParenCount--;
                    }
                    else{
                        continue;
                    }
            }
            output.append(c);
        }

        if (openParenCount > 0)
        {
            output.deleteCharAt(output.lastIndexOf("("));
            openParenCount--;
        }

        return  output.toString();
    }

}
