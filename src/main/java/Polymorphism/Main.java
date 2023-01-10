package Polymorphism;

public class Main {

    public static void main(String[] args) {


         int Result =  MethodOverloading.multiply(10,20);
         double result = MethodOverloading.multiply(10.5,20.5);

         System.out.println("Multiplication of whole numbers : "+ Result);
         System.out.println("Multiplication of two decimal point numbers : "+result);


         System.out.println("Method Overriding");

         Animal animal=new Animal();
         animal.displayInfo();

         Cat cat=new Cat();
         cat.displayInfo();

         Dog dog=new Dog();
         dog.displayInfo();



    }

}
