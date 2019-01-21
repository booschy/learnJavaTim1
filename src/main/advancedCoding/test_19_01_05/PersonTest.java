package main.advancedCoding.test_19_01_05;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PersonTest {


    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Doug", 21),
                new Person("Diana", 37),
                new Person("Mark", 29),
                new Person("Don", 30),
                new Person("Carmen", 18)
        );

        System.out.println(persons);

        //a.
        final Function<Person, String> personToName = person -> person.getName();
        List<String> allNames = persons.stream()
                .map(personToName)
                .collect(Collectors.toList());

        System.out.println("All names: " + allNames);

        //b.
        final Predicate<Person> nameStartsWithD = person -> person.getName().startsWith("D");
        Long counter = persons.stream()
                .filter(nameStartsWithD)
                .collect(Collectors.counting());
        System.out.println("nameStartsWithD counter: " + counter);

        //c.
        final Predicate<Person> ageBiggerThan20 = person -> person.getAge() > 20;
        final Predicate<Person> ageSmallerThan30 = person -> person.getAge() < 30;
        List<String> namesFor20To30Years = persons.stream()
                .filter(ageBiggerThan20.and(ageSmallerThan30))
                .map(personToName)
                .collect(Collectors.toList());

        System.out.println("namesFor20To30Years: " + namesFor20To30Years);

        //d.
        Supplier<Person> personSupplier = () -> new Person("Avaline", 30);
        System.out.println("Supplier test: " + personSupplier.get());

        //e.
        final Consumer<Person> personConsumer = person -> System.out.println(person);
        System.out.println("Consumer test:");
        persons.stream().forEach(personConsumer);


    }

}