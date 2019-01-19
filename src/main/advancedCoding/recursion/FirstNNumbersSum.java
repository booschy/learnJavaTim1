package main.advancedCoding.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstNNumbersSum {

    final int N = 10;

    @Test
    public void sum_classic_iteration_test(){

        Assertions.assertEquals(55, getSumIterative(N));
    }


    @Test
    public void sum_recursive_test(){

        Assertions.assertEquals(55, getSumRecursiveHead(N));
    }


    @Test
    public void sum_tail_recursive_test(){

        Assertions.assertEquals(55, getSumRecursiveTail(0, N));
    }


    private long getSumIterative(int number){

        int sum = 0;

        for (int nr= 0; nr <= number; nr++) {
            sum += nr;
        }

        //int sum1 = IntStream.rangeClosed(0, 10).sum();

        return sum;
    }


    private long getSumRecursiveHead(int number) {

        if (number >= 1) {
            return number + getSumRecursiveHead(number - 1);
        }

        return number;
    }


    private long getSumRecursiveTail(int currentSum, int number) {

        if (number <= 1){
            return currentSum + number;
        }

        return getSumRecursiveTail(currentSum + number, number-1);
    }
}
