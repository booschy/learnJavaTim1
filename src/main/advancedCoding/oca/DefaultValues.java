package main.advancedCoding.oca;

import org.junit.jupiter.api.Test;

public class DefaultValues {

    // Primitives
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean b;

    // Objects
    Integer integerNumber;
    Long longNumber;
    Float floatNumber;
    Double doubleNumber;
    Character character;
    Boolean booleanField;

    String s;


    @Test
    public void primitives_fields_test(){

        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
//        System.out.println("char: " + Integer.toHexString((int)c));
        System.out.println("char: \"" + c + "\"");
        System.out.println("boolean: " + b);
    }


    @Test
    public void objects_fields_test(){

        System.out.println("Integer: " + integerNumber);
        System.out.println("Long: " + longNumber);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Character: " + character);
        System.out.println("String: " + s);
        System.out.println("Boolean: " + booleanField);
    }


    @Test
    public void local_varial_test(){
        // local vars MUST have be initialized
        int i;
        String s;

/*      // uncomment to make line 59 and 60 compile
        i = 1;
        s = "";*/

        // the code will fail to compile on line 59 and 60
      /*  System.out.println(s);
        System.out.println(i);*/
    }
}
