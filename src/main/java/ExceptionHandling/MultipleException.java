package ExceptionHandling;

public class MultipleException {

    public static void main(String[] args) {

        int[] numbers = {4,8,16,32,64,128,129};
        int[] denom = {2,0,4,4,0,8};




            for (int i = 0; i < numbers.length; i++) {

                try {

                        System.out.println(String.format("%d / %d is %d",numbers[i],denom[i],(numbers[i]/denom[i])));

                }
                catch(ArithmeticException | ArrayIndexOutOfBoundsException exception)
                {
                        System.out.println(exception.getMessage());
                }

            }



    }


}
