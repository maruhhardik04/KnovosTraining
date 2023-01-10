package Inheritance.Multiple;


public class Bat implements Mammal,Bird{


    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
