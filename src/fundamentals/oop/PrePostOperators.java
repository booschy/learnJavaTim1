package fundamentals.oop;

import org.junit.jupiter.api.Test;

public class PrePostOperators {


    @Test
    public void test(){

        int i = 2;
        int j = 3;

        int first = i++ - j--;
        int second = --i - ++j;

        System.out.println(first + ", " + second);
    }

}
