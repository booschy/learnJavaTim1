package main.advancedCoding.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
10^5 = 10^4 * 10
10^4 = 10^3 * 10
10^3 = 10^2 * 10
10^2 = 10^1 * 10
10^1 = 10^0 * 10
10^0 = 1
...
10^n = 10^(n-1) * 10
*/
public class Power10 {

    long powerOfTen(int n){
        System.out.println(n);
        if (n == 0){
            return 1;
        }

        return powerOfTen(n-1) * 10;
    }


    @Test
    public void power0_test(){
        Assertions.assertEquals(1, powerOfTen(0));
    }


    @Test
    public void power5_test(){
        Assertions.assertEquals(100000, powerOfTen(5));
    }


    @Test
    public void power_neg_test(){
        // the next recursion will never stop in this case
        //powerOfTen(-3);

        Assertions.assertThrows(
                StackOverflowError.class,
                () -> powerOfTen(-3));
    }
}
