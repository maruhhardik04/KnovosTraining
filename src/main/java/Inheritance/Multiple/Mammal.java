package Inheritance.Multiple;

public interface Mammal {
    default void walk() {
        System.out.println("Produce Milk");
    }
}
