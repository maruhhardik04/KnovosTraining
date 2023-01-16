package LambdaExpression;




public class WithOrWithoutLambda {


    public static void main(String[] args) {

        Drawable drawable=new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing without lambda");
            }
        };

        drawable.draw();


        Drawable drawable1=() -> System.out.println("Drawing with lambda");

        drawable1.draw();


    }




}
