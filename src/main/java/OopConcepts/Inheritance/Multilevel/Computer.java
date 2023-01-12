package OopConcepts.Inheritance.Multilevel;

public class Computer extends Machine{

    public void runApp()
    {
        super.start();
        System.out.println("App Running...");
    }

}
