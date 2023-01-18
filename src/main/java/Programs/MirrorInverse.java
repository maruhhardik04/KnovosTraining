package Programs;
import java.util.Arrays;
public class MirrorInverse {
    public static void main(String[] args) {

        int[] array={3,4,2,0,1,5,6};
        System.out.println(Arrays.toString(array));
        if (isMirriorInverse(array))
        {
            System.out.println("yes");
            Arrays.sort(array);
            System.out.println("3rd smallest element:"+array[2]);
            System.out.println("3rd largest element:"+array[array.length-3]);
        }

    }

    public static boolean isMirriorInverse(int[] number)
    {
        for (int i = 0; i < number.length; i++) {
            if (number[number[i]]!=i) {
                return false;
            }
        }
        return true;
    }
}
