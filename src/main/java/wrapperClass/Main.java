package wrapperClass;

public class Main {

    public static void main(String[] args) {



        byte b=10;
        short s=10;
        int i = 10;
        long l=10l;
        float f=10.5f;
        double d=10.0d;
        char c='a';
        boolean b1=false;


        //Autoboxing Converting primitives into objects

        Byte aByte=b;
        Short aShort=s;
        Integer integer=i;
        Long aLong=l;
        Float aFloat=f;
        Double aDouble=d;
        Character character=c;
        Boolean aBoolean=b1;


        System.out.println("\n---Printing object values---\n");
        System.out.println("Byte object: "+aByte);
        System.out.println("Short object: "+aShort);
        System.out.println("Integer object: "+integer);
        System.out.println("Long object: "+aLong);
        System.out.println("Float object: "+aFloat);
        System.out.println("Double object: "+aDouble);
        System.out.println("Character object: "+character);
        System.out.println("Boolean object: "+aBoolean);



        //Unboxing Converting object into primitives

        byte byteValue=aByte;
        short shortValue=aShort;
        int intValue=integer;
        long longValue=aLong;
        float floatValue=aFloat;
        double doubleValue=aDouble;
        char charValue=character;
        boolean booleanValue=aBoolean;

        System.out.println("\n---Printing primitive values---\n");
        System.out.println("byte value: "+byteValue);
        System.out.println("short value: "+shortValue);
        System.out.println("int value: "+intValue);
        System.out.println("long value: "+longValue);
        System.out.println("float value: "+floatValue);
        System.out.println("double value: "+doubleValue);
        System.out.println("char value: "+charValue);
        System.out.println("boolean value: "+booleanValue);




    }

}
