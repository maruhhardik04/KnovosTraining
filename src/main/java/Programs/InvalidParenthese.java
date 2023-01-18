package Programs;
import java.util.*;


public class InvalidParenthese {

    public static void main(String[] args) {
        System.out.print(removeInvalidParenthese(")123(abc))456"));
    }

    public static String removeInvalidParenthese(String input){

        if(input.isBlank()){
            return input;
        }

        Map<Integer, Character> map=new HashMap<Integer, Character>();
        Queue<Integer> queue=new LinkedList<Integer>();
        ArrayList<Integer> array=new ArrayList<Integer>();
        String output="";

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
            output+=c;
        }

        return output;
    }

}
