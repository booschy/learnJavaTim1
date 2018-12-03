package fundamentals.base;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class ArrayFindIndex {


    public int findIndex(int[] numbers, int number){

        int foundIndex = -1;

        for (int i = 0;
             i < Optional.ofNullable(numbers).orElse(new int[]{}).length;
             i++){

            if (numbers[i] == number){
                foundIndex = i;
                break;
            }
        }
        
        return foundIndex;
    }


    @Test
    public void find_index_test(){

        int[] numbers = {25, 77, 1, 11, 44, 100, 77};

        System.out.println(findIndex(null, 111));
        System.out.println(findIndex(numbers, 111));
        System.out.println(findIndex(numbers, 11));
    }
}
