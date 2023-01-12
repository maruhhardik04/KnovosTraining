package OopConcepts.Abstraction.AbstractClass;

public class Rectangle extends Shape{

    private final double length;
    private final double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return (length * width);
    }
}
