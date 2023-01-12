package CallByValueAndReference;

public class Main {

    public static void main(String[] args) {


        Example example=new Example();

        System.out.println("Call by value");
        System.out.println(" before change :"+example.getData());
        example.callByValue(60);
        System.out.println(" after change :"+example.getData());



        System.out.println("\n\nCall by reference");
        System.out.println(" before change :"+example.getData());
        example.callByReference(60);
        System.out.println(" after change :"+example.getData());


        System.out.println("\n\nCall by reference using Object");
        System.out.println(" before change :"+example.getData());
        example.callByReferenceUsingObject(example);
        System.out.println(" after change :"+example.getData());

    }


}
