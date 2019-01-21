package main.advancedCoding.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/*
10 to binary

// step 1
10 % 2 = 0      0
10 / 2 = 5

// step 2
5 % 2 = 1       10
5 / 2 = 2

// step 3
2 % 2 = 0       010
2 / 2 = 1      1010

//
  */

public class DecimaToBinary {


    public String toBinaryString(int number) {

        System.out.println("CurrentNumber: " + number);

        if (number < 2) {
            return String.valueOf(number);
        }

        String currentBinaryValue = "" + number % 2;

        System.out.println("CurrentBinaryValue: " + currentBinaryValue + "\n");


        return toBinaryString(number / 2) + currentBinaryValue;
    }


    @Test
    public void test(){

        final String binary = toBinaryString(10);
        System.out.println("Binary for 10: " + binary);

        Assertions.assertEquals(
                "1010",
                binary);
    }
}
