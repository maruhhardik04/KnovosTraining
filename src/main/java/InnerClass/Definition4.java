package InnerClass;

public class Definition4 {
    public static void main(String[] args) {

        Outer outer=new Outer();
        Outer.InnerClass innerClass=outer.new InnerClass();


    }
}


class Outer{

    public void doSomething(){
        System.out.println("Called from inner Class ");
    }

    class InnerClass{

        public InnerClass() {
            doSomething();
        }
    }

}