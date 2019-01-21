package main.utils;


import main.fundamentalsCoding.bank.Employer;
import main.fundamentalsCoding.bank.Person;

import java.util.Arrays;
import java.util.List;

public interface ArrayUtils {


    static <T> void printArray(T[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    static <T> void printList(List<T> list){

        list.forEach(System.out::println);
    }


    static void main(String[] args) {

        Integer[] numbers = new Integer[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

       // printArray(numbers);

        String[] strings = new String[5];
        strings[0] = "aaa";
        strings[1] = "abc";
        strings[2] = "xyz";
        strings[3] = "word";
        strings[4] = "a";

        //printArray(strings);

        Person[] persons =  new Person[3];
        persons[0] = new Person("John", Employer.AZETS, "Timisoara");
        persons[1] = new Person("George", Employer.IBM, "Timisoara");
        persons[2] = new Person("Maria", Employer.VISMA, "Timisoara");

        //printArray(persons, Arrays.toString(strings));


        printList(Arrays.asList(strings));
    }
}

