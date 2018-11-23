package fundamentals.base;

import org.junit.jupiter.api.Test;

import static utils.ArrayUtils.printArray;


public class Varargs {

    @Test
    public void test_array_vs_varargs() {

        Integer[] numbers = new Integer[4];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;

        System.out.println("\n1. Array argument:");
        printNumbers(numbers);
        // printNumbers();  //- this does not work

        System.out.println("\n\n1.Varargs - array param:");
        printNumbersVarargs(numbers);

        System.out.println("\n\n2.Varargs - no params:");
        printNumbersVarargs();

        System.out.println("\n3.Varargs - multiple params:");
        printNumbersVarargs(0, 1, 2, 3);

    }


    public void printNumbers(Integer[] numbers){

        printArray(numbers);
    }


    public void printNumbersVarargs(Integer... numbers){

        printArray(numbers);
    }

}
