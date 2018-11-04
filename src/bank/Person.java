package bank;

import utils.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {

    public static final String separatoRegex = "\\s*,\\s*";

    public static class CompareByName implements Comparator<Person> {

        @Override
        public int compare(Person a, Person b) {

            return a.name.compareTo(b.name);
        }
    }


    private String name;

    private Employer employer;

    private String location;


    public Person(String name, Employer employer, String location) {

        this.name = name;
        this.employer = employer;
        this.location = location;
    }


    @Override
    public String toString(){

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


    public static Person stringToPerson(String text){

        // text = "Anda, Bucuresti,   Visma"
        String[] textTokens = text.split(separatoRegex);

        String name = textTokens[0];
        String location = textTokens[1];

        // Employer.Visma.name() ---> returns "Visma"
        // Employer.valueOf("Visma") ---> returns Employer.Visma
        Employer employer = Employer.valueOf(textTokens[2]);

        return new Person(name, employer,  location);
    }


    public static List<Person> fileToPersonList(String... more) throws IOException {

        List<String> fileLines = FileUtils.fileLinesToList(more);

        List<String> nonEmptyLines = FileUtils.extractNonEmptyLines(fileLines);

        List<Person> personList =  new ArrayList<>();

        for(String line : nonEmptyLines){

            Person currentPerson = stringToPerson(line);
            personList.add(currentPerson);
        }

        return personList;
    }


    private static List<Person> getEmployees(List<Person> personList, String location) {

        List<Person> timisoaraEmployees = new ArrayList<>();

        for(Person person : personList){

            if(person.location.equals(location)){
                timisoaraEmployees.add(person);
            }
        }

        return timisoaraEmployees;
    }


    private static List<Person> getEmployees(List<Person> personList, Employer employer) {

        List<Person> employees = new ArrayList<>();

        for(Person person : personList){

            if(person.employer.equals(employer)){
                employees.add(person);
            }
        }

        return employees;
    }


    private static List<Person> getEmployees(
            List<Person> personList,
            Employer employer,
            String location) {

        List<Person> employees = new ArrayList<>();

        for(Person person : personList){

            if(person.employer.equals(employer) && person.location.equals(location)){
                employees.add(person);
            }
        }

        return employees;
    }


    public static void main(String[] args) throws IOException {

        List<Person> personList = fileToPersonList(
                ResourcesDirectories.BankResources.name(),
                "employees.csv");

        List<Person> timisoaraEmployees = getEmployees(
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
        for(Person person : employesFromVismaTimisora){
            finalText += person.toString() + "\n";
        }

        System.out.println(finalText);

        Path outFilePath = FileUtils.getLocalPath(
                ResourcesDirectories.BankResources.name(),
                "employeesFromVismaTimisoara.txt");

        Files.write(outFilePath, finalText.getBytes());
    }

}
