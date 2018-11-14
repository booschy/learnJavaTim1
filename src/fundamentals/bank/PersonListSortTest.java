package fundamentals.bank;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static fundamentals.bank.Persons.*;


public class PersonListSortTest {

    private static List<Person> personList;

    @BeforeAll
    public static void beforeAll() throws IOException {

        personList = fileToPersonList(
                ResourceDirectories.Resource.name(),
                ResourceDirectories.Fundamentals.name(),
                ResourceDirectories.Bank.name(),
                "employees.csv");
    }


    @Test
    public void sort_by_location() {

        Collections.sort(

                personList,

                // CompareByLocation
                new Comparator<Person>() {

                    @Override
                    public int compare(Person p1, Person p2) {

                        return p1.getLocation().compareTo(p2.getLocation());
                    }
                }); // (p1, p2) -> p1.getLocation().compareTo(p2.getLocation());

        print(personList);
    }


    @Test
    public void sort_by_employer() {

        Collections.sort(personList, new CompareByEmployer());
        print(personList);
    }


    @Test
    public void sort_by_name() {

        Collections.sort(personList, new CompareByName());
        print(personList);
    }


    @Test
    public void sort_by_name_reversed() {

        Collections.sort(personList, new CompareByName().reversed());
        print(personList);
    }


    @Test
    public void simple_comparator_test() {

        Persons.CompareStrings comparator = new Persons.CompareStrings();
        String s1 = "Adela";
        String s2 = "Tania";

        System.out.println(comparator.compare(s1, s1));  // 0
        System.out.println(comparator.compare(s1, s2));  // negative
        System.out.println(comparator.compare(s2, s1));  // positive


        List<String> namesList = Arrays.asList(s1, s2, "Maria", "Dorina");

        Collections.sort(namesList);  // String implements Comparable<String>
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
        System.out.print(namesList);
    }


    @Test
    public void compare_by_employer_location_name(){

        Collections.sort(
                personList,
                new CompareByEmployer()

                    .thenComparing(new CompareByLocation())

                    .thenComparing(new CompareByName()));

        print(personList);
    }
}
