package main.advancedCoding.summary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pactice {


    public static void main(String[] args) {
        //1
        int[] intArray = new int[]{1, 2, 3};

        //2
        Integer[] integerArray = new Integer[]{1, 2, 3};

        //3
        List<Integer> integerList = List.of(1, 2, 3);

        //4
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(integerArray));
        System.out.println(integerList);

        //5
        List<Integer> integerList2 = Arrays.asList(integerArray);
        System.out.println(integerList2);

        //6
        List<Integer> integerList1 = Arrays.stream(intArray)
                //.boxed()
                .mapToObj(i -> i)
                .collect(Collectors.toList());

        System.out.println(integerList1);

        //7
        int[] primitiveArray = integerList.stream()
                .mapToInt(i -> i)
                .toArray();
        System.out.println(Arrays.toString(primitiveArray));

        //8
        Integer[] integersArray8 = integerList.stream()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(integersArray8));
    }
}
