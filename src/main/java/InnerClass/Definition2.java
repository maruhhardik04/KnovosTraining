package InnerClass;

public class Definition2 {

    public static void main(String[] args) {
        OuterClazz outerClazz=new OuterClazz();
//        OuterClazz.InnerClass = outerClazz.new InnerClass();
    }
}
class OuterClazz{
    public OuterClazz() {
        System.out.println("Outer Class");

    }

    private class InnerClass
    {
        public InnerClass() {
            System.out.println("Inner Class");
        }
    }
}