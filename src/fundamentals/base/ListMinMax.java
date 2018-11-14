package fundamentals.base;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMinMax {

    private static List<Integer> numbers = new ArrayList<>();

    @BeforeAll
    public static void beforeAll(){

        System.out.println("before all");

        numbers = Arrays.asList(
                -3, -6, -7, 4, 88, 33, 22, -4, -9, 77,
                2, 6, 9, 11, 1, 4, -33, 4, 2, 8, 16, 11
        );
    }

    @Test
    public void get_min(){

        System.out.println("get_min");

        int min = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE: " + min);

        for(int number : numbers){
            if(number < min){
              min = number;
            }
        }

        System.out.println("MIN: " + min);
    }


    @Test
    public void get_max(){

        System.out.println("get_max");

        int max = Integer.MIN_VALUE;
        System.out.println("Integer.MIN_VALUE: " + max);

        for(int number : numbers){
            if(number > max){
              max = number;
            }
        }
        System.out.println("MAX: " + max);
    }

}
