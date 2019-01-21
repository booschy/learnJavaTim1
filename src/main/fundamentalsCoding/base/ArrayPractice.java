package main.fundamentalsCoding.base;

import main.fundamentalsCoding.enumsPractice.NumbersEnum;

import java.util.Arrays;

import static main.fundamentalsCoding.enumsPractice.NumbersEnum.FIRST;


 class ArrayPractice {


     static boolean isEven(int number) {

        return number % 2 == 0;
    }


     static boolean isOdd(int number) {

        return number % 2 != 0;
        // return ( ! isEven(number))
    }


     static void printEvenNumbers(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {

            if (isEven(intArray[i])) {

                System.out.println(intArray[i]);
            }
        }
    }


     static void printOddNumbers(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {

            if (isOdd(intArray[i])) {

                System.out.println(intArray[i]);
            }
        }
    }


     static int sum(int[] intArray) {

        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        return sum;
    }


     static void main(String[] args) {

        int[] intArray = {2, 3, 4, 7, 99, 4, 120, 111, -5, -99, 55, 13, 29, 1, 0};

        // The size of an array can't be modified.
        // This will throw because the intArray has a fixed length of 15.
        // Uncomment to test it.
        // intArray[15] = 9;

        System.out.println("Array: " + Arrays.toString(intArray));

        System.out.println("\nEven numbers:");
        printEvenNumbers(intArray);

        System.out.println("\nOdd numbers:");
        printOddNumbers(intArray);

        System.out.println("\nArray elements sum: " + sum(intArray));


        // 1
        System.out.println("\nNumbers at odd indexes:");
        printNumbersAtOddIndexes(intArray);

        // 2
        System.out.println("\nNegative numbers: "
                + Arrays.toString(getNegativeNumbers(intArray)));

        // 3
        System.out.println("\nNumbers bigger than 10:");
        printNumbersBiggerThan10(intArray);

        // 4
        System.out.println(String.format(
                "\nArray elements average: %.2f",
                average(intArray)));

        // 5
        System.out.println(String.format(
                "\nArray positive elements average: %.2f %s",
                positiveElementsAverage(intArray),
                "averageValue"));

        // 6
        // Enum test
        System.out.println("\nNumbersEnum.first name: " + FIRST.name());
        System.out.println("\nNumbersEnum.first value: " + FIRST.getValue());

        String enumMember = "second";
        System.out.println("\nNumbersEnum.first value from string \"second\": "

                + NumbersEnum.valueOf(enumMember).getValue());
    }


    // HOMEWORK: implement following methods
     static void printNumbersAtOddIndexes(int[] intArray) {

        // 1 HOMEWORK implementation
        for (int i = 0; i < intArray.length; i++) {
            if(isOdd(i)) {
                System.out.println(intArray[i]);
            }
        }
    }


     static int[] getNegativeNumbers(int[] intArray) {

        // 2 HOMEWORK implementation
        int[] finalArray = new int[intArray.length];
        int finalArrayIndex = 0;

        for (int number : intArray) {

            if(number < 0){
                finalArray[finalArrayIndex++] = number;
            }
        }

        return Arrays.copyOfRange(finalArray, 0, finalArrayIndex);
    }


     static void printNumbersBiggerThan10(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] > 10){
                System.out.println(intArray[i]);
            }
        }
    }


     static float average(int[] intArray) {

        if(intArray.length == 0){
            return 0;
        }

        return (float) sum(intArray) / intArray.length;
    }


     static float positiveElementsAverage(int[] intArray) {

        int sum = 0;
        int positiveCount = 0;

        for (int i = 0; i < intArray.length; i++) {

            if(intArray[i] > 0){
                sum += intArray[i];
                positiveCount++;
            }
        }

        if(positiveCount == 0){
            return 0;
        }

        return (float) sum / positiveCount;
    }

}

