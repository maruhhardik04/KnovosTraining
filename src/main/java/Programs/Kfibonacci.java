/**
 *
 * First, initialize the first ‘K’ elements to ‘1’.
 * Create a variable named ‘sum’ which will be initialized with ‘K’.
 * Set the value of (K+1) th element to sum.
 * Set the next values as Array[i] = sum – Array[i-k-1] + Array[i-1] then update sum = Array[i].
 * In the end, display the Nth term of the array
 *
 * @author Harik Maru
 * */
package Programs;

public class Kfibonacci {

    public static void main(String[] args) {
        int K = 2;
        int N = 6;
        int[] array = new int[N];



        for (int i = 0; i < K; i++) {
            array[i] = 1;
        }

        int sum = K;
        array[K] = sum;

        for (int i = K + 1; i < N; i++) {
            array[i] = sum - array[i - K - 1] + array[i - 1];
            sum = array[i];
        }
        System.out.println("The Nth term of the array is: " + array[N - 1]);
    }
}
