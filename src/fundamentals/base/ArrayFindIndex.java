package fundamentals.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class ArrayFindIndex {


    private int[] numbers;


    public int findIndex(int[] numbers, int number){

        int foundIndex = -1;

        for (int i = 0;
             i < Optional.ofNullable(numbers).orElse(new int[0]).length;
             i++){

            if (numbers[i] == number){
                foundIndex = i;
                break;
            }
        }

        return foundIndex;
    }


    @BeforeEach
    public void beforeEach(){
        numbers = new int[]{25, 77, 1, 11, 44, 100, 77};
    }


    @Test
    public void find_index_null_test(){

        System.out.println(findIndex(null, 111));

        Assertions.assertEquals(
                -1,
                findIndex(null, 111));
    }


    @Test
    public void found_index_test(){

        System.out.println(findIndex(numbers, 11));

        Assertions.assertEquals(
                3,
                findIndex(numbers, 11));
    }


    @Test
    public void not_found_index_test(){

        System.out.println(findIndex(numbers, 111));

        Assertions.assertEquals(
                -1,
                findIndex(numbers, 111));
    }
}
