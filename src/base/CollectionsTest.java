package base;

import java.util.*;



public class CollectionsTest {


    public static void main(String[] args){

        listTest();

        mapTest();
    }

    
    
    private static void mapTest() {
    
        // create tree map (ordered keys)
        TreeMap<Integer, String> mapOfString = new TreeMap<>();

        // add entries
        mapOfString.put(2, "second");
        mapOfString.put(3, "third");
        mapOfString.put(1, "first");

        // modify entry by key
        mapOfString.put(1, "newfirst");

        // keys, values
        Set<Integer> mapKeys = mapOfString.keySet();
        System.out.println("Map keys: " + mapKeys);
        
        Set<Integer> mapValues = mapOfString.values();
        System.out.println("Map values" + mapValues);


        // print all map "key : value"
        for (int key : keys){

            System.out.println(key + " : " + mapOfString.get(key));
       }

        
        keys.forEach(System.out::println);
    }


    private static void listTest() {
        
        // create list
        ArrayList<String> listOfStrings = new ArrayList<>();

        // add items
        listOfStrings.add("first");
        listOfStrings.add("second");
        listOfStrings.add("third");
        listOfStrings.add("third");

        // print items
        for (int i=0; i < listOfStrings.size(); i++){
            System.out.println(listOfStrings.get(i));
        }
    }

}

