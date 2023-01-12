package OopConcepts.Abstraction.UsingInterface;

public class Main {


    public static void main(String[] args) {


      Circle circle=new Circle(2.5);
      Rectangle rectangle=new Rectangle(10,20);



      System.out.println(String.format("Area of circle is : %.4f ", circle.area()));
      System.out.println("Area of rectangle is : "+rectangle.area());

    }

}
