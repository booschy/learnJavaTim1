package fundamentals.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;



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

        // keys are stored in a Set because they are unique
        Set<Integer> mapKeys = mapOfString.keySet();
        System.out.println("Map keys: " + mapKeys);

        // values are stored in a Collection
        Collection<String> mapValues = mapOfString.values();
        System.out.println("Map values" + mapValues);


        // print all map "key : value"
        for (int key : mapKeys){
            System.out.println(key + " : " + mapOfString.get(key));
        }


        // just as an example of declarative
        mapKeys.forEach(System.out::println);
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

