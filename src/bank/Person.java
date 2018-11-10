package bank;

import static bank.Persons.*;

import utils.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Person {




    private String name;

    private Employer employer;

    private String location;


    public Person(String name, Employer employer, String location) {

        this.name = name;
        this.employer = employer;
        this.location = location;
    }


    @Override
    public String toString() {

        return String.format(
                "\nName: %s\nEmployer: %s\nLocation: %s",
                name,
                employer.name(),
                location);
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public Employer getEmployer() {
        return employer;
    }


    public String getLocation() {
        return location;
    }




    public static void main1(String[] args) throws IOException {

        List<Person> personList = fileToPersonList(
                ResourceDirectories.BankResources.name(),
                "employees.csv");

        List<Person> bucurestiEmployees = getEmployees(
                personList,
                "Bucuresti");

        List<Person> employesFromVisma = getEmployees(
                personList,
                Employer.Visma);

        List<Person> employesFromVismaTimisora = getEmployees(
                personList,
                Employer.Visma,
                "Timisoara");


        /*for(Person person : timisoaraEmployees){
            System.out.println(person);
        }*/

        String finalText = "";
        for (Person person : employesFromVismaTimisora) {
            finalText += person.toString() + "\n";
        }

        System.out.println(finalText);

        Path outFilePath = FileUtils.getLocalPath(
                ResourceDirectories.BankResources.name(),
                "employeesFromVismaTimisoara.txt");

        Files.write(outFilePath, finalText.getBytes());


        // SORT

        System.out.println("\n*** Sorted ***");

        List<Person> personListSorted = new ArrayList<>();
        personListSorted.addAll(personList);

        Collections.sort(

                personListSorted,

                new Comparator<Person>() {

                    @Override
                    public int compare(Person p1, Person p2) {
                        return p1.getName().compareTo(p2.getName());
                    }
                });


        personListSorted.forEach(System.out::println);
    }


    public static void main(String[] args) throws IOException {

    }




}
