package main.advancedCoding.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Factorial:

0! = 1
1! = 0! * 1
2! = 1! * 2
3! = 2! * 3
4! = 3! * 4
5! = 4! * 5
...
n! = (n-1)! * n

5! = 4! * 5 = 3! * 4 * 5 = 2! * 3 * 4 * 5 = 1! * 2 * 3 * 4 * 5 = 1 * 2 * 3 * 4 * 5 = 120
 */
public class Factorial {

    String indent = "";


    public long factorial(int n){

        indent += " ";
        System.out.println(indent + n + " factorial");

        if(n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }


    @Test
    public void factorial_1_test(){
        Assertions.assertEquals(1, factorial(1));
    }


    @Test
    public void factorial_5_test(){
        long factorial5 = factorial(5);
        System.out.println(factorial5);
        Assertions.assertEquals(120, factorial5);
    }
}
