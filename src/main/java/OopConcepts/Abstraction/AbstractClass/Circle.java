package OopConcepts.Abstraction.AbstractClass;

public class Circle  extends Shape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius,2);
    }
}
