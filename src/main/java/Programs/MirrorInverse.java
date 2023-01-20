/**
 * Checking whether the given array is Mirror Inverse or not if it's find the 3rd smallest and 3rd
 * largest element of Inverse array
 *
 * @author Hardik Maru
 */
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

    /**
     * Check if the given array is a mirror-inverse of itself.
     *
     * @param number array of integers
     * @return true if the array is a mirror-inverse, false otherwise
     */
    public static boolean isMirriorInverse(int[] number)
    {
        for (int i = 0; i < number.length; i++) {
            if (number[number[i]] != i) {
                return false;
            }
        }
        return true;
    }
}
