package main.advancedCoding.test_19_01_12;

public class Test2 {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3};
        int firstIndex = 1;
        int secondIndex = 2;

        /*final int finalFirstIndex = firstIndex++;
        final int finalSecondIndex = ++secondIndex;

        final int number1 = numbers[finalFirstIndex];
        final int number2 = numbers[finalSecondIndex];

        System.out.println(number1 + number2);

        */

        System.out.println(numbers[firstIndex++]+ numbers[++secondIndex]);
    }
}
