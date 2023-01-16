package LambdaExpression;


interface Cal{
    int addition(int num,int num1);
}

public class WithOrWithoutReturn {

    static Cal cal=new Cal() {
        @Override
        public int addition(int num, int num1) {
            return num + num1;
        }
    };

    static Cal cal1 = (num,num1) -> num+num1;

    public static void main(String[] args) {

        System.out.println(cal.addition(10,20));
        System.out.println(cal1.addition(20,20));

    }




}
