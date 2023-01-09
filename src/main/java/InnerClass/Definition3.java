package InnerClass;

public class Definition3 {
    public static void main(String[] args) {

        OuterClassWithInnerStaticClass.InnerClass innerClass=new OuterClassWithInnerStaticClass.InnerClass();

    }
}

class OuterClassWithInnerStaticClass
{
    public OuterClassWithInnerStaticClass() {
        System.out.println("Outer Class");

    }

    static class InnerClass
    {
        public InnerClass() {
            System.out.println("static Inner Class");
        }
    }
}
