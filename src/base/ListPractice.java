package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static base.ArrayPractice.*;


/* REQUIREMENTS:

Do the same tasks from ArrayPractice using a list.

Reuse code from ArrayPractice where it is appropriate.

Try different looping:
i.e.
a) for (int i=0; i < list.size(); i++){ ... }
b) for (Integer i : list) { ... }
c) list.forEach(Consumer)
*/


public class ListPractice{


    public static void main(String[] args) {

        // 0
        /*Integer[] intArray =  { 2, 3, 4, 7, 99, 4, 120, 111, -5, -99, 55, 13, 29, 1, 0 };
        List<Integer> integerList = Arrays.asList(intArray);*/

        List<Integer> integerList = Arrays.asList(
                2, 3, 4, 7, 99, 4, 120, 111,
                -5, -99, 55, 13, 29, 1, 0);


        System.out.println("List: " + integerList);

        // 1
        System.out.println("\nEven numbers:");
        printEvenNumbers(integerList);

        // 2
        System.out.println("\nOdd numbers:");
        printOddNumbers(integerList);

        // 3
        System.out.println("\nList elements sum: " + sum(integerList));

        // 4
        System.out.println("\nNumbers at odd indexes:");
        printNumbersAtOddIndexes(integerList);

        // 5
        System.out.println("\nNegative numbers:");
        printNegativeNumbers(integerList);

        // 6
        System.out.println("\nNumbers bigger than 10:");
        printNumbersBiggerThan10(integerList);

        // 7
        System.out.println(String.format(
                "\nList elements average: %.2f",
                average(integerList)));

        // 8
        System.out.println(String.format(
                "\nList positive elements average: %.2f",
                positiveElementsAverage(integerList)));
    }



    public static void printEvenNumbers(List<Integer> integerList) {
        // 1
        for (int i = 0; i < integerList.size(); i++) {

            int currentElement = integerList.get(i);

            if(isEven(currentElement)){
                 System.out.println(currentElement);
             }

        }
    }


    public static void printOddNumbers(List<Integer> integerList) {
        // 2
        for (int i = 0; i < integerList.size(); i++) {

            int currentElement = integerList.get(i);

            if(isOdd(currentElement)){
                System.out.println(currentElement);
            }
        }
    }


    public static int sum(List<Integer> integerList) {
        // 3
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {

            sum += integerList.get(i);

        }
        return sum;
    }


    public static void printNumbersAtOddIndexes(List<Integer> integerList) {
        // 4
        for (int i = 0; i < integerList.size(); i++) {
            if(! isEven(i)){
                System.out.println(integerList.get(i));
            }
        }
    }


    public static void printNegativeNumbers(List<Integer> integerList) {
        // 5
        for(int element : integerList){
            if(element < 0){
                System.out.println(element);
            }
        }
    }


    public static void printNumbersBiggerThan10(List<Integer> integerList) {
        // 6
    }


    public static float average(List<Integer> integerList) {
        // 7
        if(integerList.size() == 0){
            return 0;
        }
        return (float) sum(integerList) / integerList.size();
    }


    public static float positiveElementsAverage(List<Integer> integerList) {
        // 8
        return 0;
    }

}

