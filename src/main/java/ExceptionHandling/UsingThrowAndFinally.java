package ExceptionHandling;

import static java.lang.String.*;

public class UsingThrowAndFinally {

    public static void main(String[] args) {


        int[] numbers = {4, 8, 16, 32, 64, 128, 129};
        int[] denom = {2, 0, 4, 4, 0, 8};


        for (int i = 0; i < numbers.length; i++) {

            try {
                if (denom[i] == 0) {
                    throw new ArithmeticException("/ by zero");
                }

                System.out.printf("%d / %d is %d%n", numbers[i], denom[i], (numbers[i] / denom[i]));

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
                System.out.println(exception.getMessage());
            } finally {
                System.out.println("End of program.");
            }


        }

    }
}
