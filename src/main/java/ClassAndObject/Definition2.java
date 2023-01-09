package ClassAndObject;

public class Definition2
{
    public static void main(String[] args) {
        ParameterizeConstructorClass parameterizeConstructorClass=new ParameterizeConstructorClass("Hardik");
        System.out.println(parameterizeConstructorClass.getName());
    }

}

class ParameterizeConstructorClass{

    private String name;

    public ParameterizeConstructorClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
