package main.advancedCoding.algoritms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Triplets {

    List<Integer> ints = List.of(
            1, 2, 3, 8, 4, 5, 9, 3, 1, 1, 1, 2, 7, 4, 1, 1, 6
    );

    List<Integer> list2 = List.of(
            1, 2, 3, 0, 3, 4, 7, 8, 1, 9, 2, 5, 8, 7, 1, 8, 0, 7, 7
    );

    // [ [1, 2, 3], [2, 3, 8], ... , [1, 1, 6] ]
    private List<List<Integer>> getTriplets(List<Integer> integerList) {

        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < integerList.size() - 2; i++) {
            triplets.add(integerList.subList(i, i + 3));
        }

        return triplets;
    }

    private int getListSum(List<Integer> integers) {

        Stream<Integer> streamOfInts = integers.stream();

        IntStream intStream = streamOfInts.mapToInt(i -> i);

        return intStream.sum();
    }


    private long getCountOfTripletsWithSumLessThan(int sumLimit) {

        List<List<Integer>> triplets = getTriplets(ints);

        return triplets.stream()
                .filter(isTripletSumLessThan(sumLimit))
                .peek(System.out::println)
                .count();
    }

    private Predicate<List<Integer>> isTripletSumLessThan(int sumLimit) {

        return triplet -> getListSum(triplet) < sumLimit;
    }


    public List<List<Integer>> getTripletsWhereThirdIsTheSumOfFirstTwo(List<Integer> list){

        List<List<Integer>> filteredTriplets = getTriplets(list).stream()
                .filter(isSumOfFirstTwoEqualsWithTheThird)
                .collect(Collectors.toList());

        return filteredTriplets;
    }

    public Predicate<List<Integer>> isSumOfFirstTwoEqualsWithTheThird =
        triplet -> triplet.get(0) + triplet.get(1) == triplet.get(2);



    @Test
    public void triplets_with_sum_less_than_test() {

        System.out.println("Initial list size: " + ints.size());

        System.out.println(getCountOfTripletsWithSumLessThan(7));
    }

    @Test
    public void getTripletsWhereThirdIsTheSumOfFirstTwo_test() {
        System.out.println(
                getTripletsWhereThirdIsTheSumOfFirstTwo(list2));
    }
}
