package main.advancedCoding.recursion;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Fibonacci sequence: 0 1 1 2 3 5 8 13 21 34 55 89 ...
Rules:
- natural numbers
- sequence starts whit 0 1
- for all next numbers, the third number is the sum of the two numbers preceding it
*/
public class Fibonacci {

    int getNumberAtIndex(int index){

        System.out.println(index);

        if(index <= 1){
            return index;
        }

        //final int firstPrevious = getNumberAtIndex(index - 1);
        //final int secondPrevious = getNumberAtIndex(index - 2);

        //return firstPrevious + secondPrevious;
        return getNumberAtIndex(index - 1) + getNumberAtIndex(index - 2);
    }


    @Test
    public void index0_test(){
        Assertions.assertEquals(0, getNumberAtIndex(0));
    }


    @Test
    public void index1_test(){
        Assertions.assertEquals(1, getNumberAtIndex(1));
    }


    @Test
    public void index10_test(){
        Assertions.assertEquals(55, getNumberAtIndex(10));
    }
}

