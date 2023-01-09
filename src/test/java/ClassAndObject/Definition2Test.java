package ClassAndObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Definition2Test {

    @Test
    public void parameterizeConstructorTest(){

        ParameterizeConstructorClass parameterizeConstructorClass=new ParameterizeConstructorClass("Hardik");

        assertEquals("Hardik",parameterizeConstructorClass.getName());


    }

}