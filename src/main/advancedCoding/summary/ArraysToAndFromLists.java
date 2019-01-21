package main.advancedCoding.summary;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToAndFromLists {

    @Test
    public void array_test(){
        Integer[] iArray = new Integer[7]; // length=7; index 0..6
        iArray[0] = Integer.valueOf("1");
        iArray[1] = 2;
        iArray[2] = 3;
        iArray[3] = 4;

        System.out.println(iArray);
        System.out.println(Arrays.toString(iArray));
    }

    @Test
    public void array_primitive_test(){
        int[] iArray = new int[7]; // fixed length=7; index 0..6
        iArray[0] = 1;
        iArray[1] = 2;
        iArray[2] = 3;
        iArray[3] = 4;

        System.out.println(iArray);
        System.out.println("Length: " + iArray.length);
        System.out.println(Arrays.toString(iArray));
    }


    @Test
    public void array_to_list_test(){

        Integer[] integersArray = new Integer[]{
                1, 2, 3, 4, 3, 2, 1
        };

        System.out.println("Length: " + integersArray.length);
        List<Integer> integers = Arrays.asList(integersArray);
        System.out.println(integers);
    }


    @Test
    public void primitive_array_to_list_wrong_test(){
        int[] intArray = new int[]{
                1, 2, 3, 4, 3, 2, 1
        };
        List integers = Arrays.asList(intArray);
        System.out.println(integers);

        System.out.println("First element: " + integers.get(0));
        System.out.println("First element: "
                + Arrays.toString((int[])integers.get(0)));
    }


    @Test
    public void primitive_array_to_wrapper_array_test(){

        int[] ints = new int[]{1,2,3};
        Integer[] integers = new Integer[ints.length];

        for (int i = 0; i < ints.length; i++) {
            integers[i] = ints[i];  // copy elements; only the type changes
            // under the hood: boxing
            // integers[i] = Integer.valueOf(ints[i]);
        }

        System.out.println("ints: " + ints);
        System.out.println("ints: " + Arrays.toString(ints));
        System.out.println("ints as list: " + Arrays.asList(ints));

        System.out.println("integers: " + integers);
        System.out.println("integers: " + Arrays.toString(integers));
        System.out.println("integers as list: " + Arrays.asList(integers));
    }


    @Test
    public void primitive_array_to_list_test(){
        int[] intArray = new int[]{
                1, 2, 3, 4, 3, 2, 1
        };
        final IntStream intStream = Arrays.stream(intArray);
        Stream<Integer> integerStream = intStream.boxed();

        //Stream<Integer> integers = intStream.mapToObj(i -> i);

        // mapToObj(i->i):  IntStream --> Stream<Integer>
        // boxed():  IntStream --> Stream<Integer>
        // mapToInt(i->i):  Stream<Integer> --> IntStream

        //.boxed()
        List<Integer> integers = integerStream.collect(Collectors.toList());

        // one line
        /*List<Integer> integers = Arrays.stream(intArray)
                .boxed()
                .collect(Collectors.toList());*/

        System.out.println(integers.getClass().getName());
        System.out.println(integers);
    }


    @Test
    public void list_to_array_test(){
        final List<Integer> integers = List.of(1, 2, 3, 4, 3, 2, 1);
        // integers.add(10); // will throw at runtime: java.lang.UnsupportedOperationException

/*
        final Integer[] newEmptyArray = new Integer[integers.size()];
        Integer[] integerArray = integers.toArray(newEmptyArray);
*/

        /*Integer[] integerArray = integers.toArray(new Integer[0]);*/
        Integer[] integerArray = getIntegerArrayFromList(integers);

        System.out.println(Arrays.toString(integerArray));
    }


    public static Integer[] getIntegerArrayFromList(List<Integer> integers) {
        return integers.toArray(new Integer[integers.size()]);
    }


    @Test
    public void list_stream_to_array_test(){
        List<Integer> integers = List.of(1, 2, 3, 4, 3, 2, 1);

        Integer[] integerArray = integers.stream()
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(integerArray));
    }


    @Test
    public void list_to_primitive_array_test(){
        List<Integer> integers = List.of(1, 2, 3, 4, 3, 2, 1);

        /*Stream<Integer> integersStream = integers.stream();
        IntStream intStream = integersStream.mapToInt(i -> i);
        int[] intArray = intStream.toArray();*/

        int[] intArray = getIntArrayFromList(integers);

        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));
    }


    public static int[] getIntArrayFromList(List<Integer> integers) {
        return integers.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
