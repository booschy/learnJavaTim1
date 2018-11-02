package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/* REQUIREMENTS:

Do the same tasks from ArrayPractice using a list.

Reuse code from ArrayPractice where it is appropriate.

Try different looping:
i.e.
a) for (int i=0; i < list.size(); i++){ ... }
b) for (Integer i : list) { ... }
c) list.forEach(Consumer)
*/


public class ListPracticeTask {


    public static void main(String[] args) {

        // 0
        List<Integer> integerList =  new ArrayList<>();
        // { 2, 3, 4, 7, 99, 4, 120, 111, -5, -99, 55, 13, 29, 1, 0 };

        System.out.println("List: " + integerList);

        // 1
        System.out.println("\nEven numbers: " + getEvenNumbers(integerList));

        // 2
        System.out.println("\nOdd numbers: " + getOddNumbers(integerList));

        // 3
        System.out.println("\nArray elements sum: " + sum(integerList));

        // 4
        System.out.println("\nNumbers at odd indexes: " + getNumbersAtOddIndexes(integerList));

        // 5
        System.out.println("\nNegative numbers: " + getNegativeNumbers(integerList));

        // 6
        System.out.println("\nNumbers bigger than 10: " + getNumbersBiggerThan10(integerList));

        // 7
        System.out.println(String.format(
                "\nList elements average: %.2f",
                average(integerList)));

        // 8
        System.out.println(String.format(
                "\nList positive elements average: %.2f",
                positiveElementsAverage(integerList)));
    }



    public static List<Integer> getEvenNumbers(List<Integer> integerList) {
        // 1
        return Collections.emptyList();
    }


    public static List<Integer> getOddNumbers(List<Integer> integerList) {
        // 2
        return Collections.emptyList();
    }


    private static int sum(List<Integer> integerList) {
        // 3
        return 0;
    }


    public static List<Integer> getNumbersAtOddIndexes(List<Integer> integerList) {
        // 4
        return Collections.emptyList();
    }


    public static List<Integer> getNegativeNumbers(List<Integer> integerList) {
        // 5
        return Collections.emptyList();
    }


    public static List<Integer> getNumbersBiggerThan10(List<Integer> integerList) {
        // 6
        return Collections.emptyList();
    }


    public static float average(List<Integer> integerList) {
        // 7
        return 0;
    }


    public static float positiveElementsAverage(List<Integer> integerList) {
        // 8
        return 0;
    }

}

