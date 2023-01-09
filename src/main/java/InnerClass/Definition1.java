package InnerClass;

public class Definition1 {

    public static void main(String[] args) {

        OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass innerClass=outerClass.new InnerClass();
    }

}

class OuterClass{
    public OuterClass() {
        System.out.println("Outer Class");

    }

     class InnerClass
    {
        public InnerClass() {
            System.out.println("Inner Class");
        }
    }
}