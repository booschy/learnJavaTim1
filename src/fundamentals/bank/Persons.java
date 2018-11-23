package fundamentals.bank;

import utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public interface Persons {


    public static final String separatoRegex = "\\s*(,|\\.|;|:)\\s*";

    //  https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
    public static class CompareStrings implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {

            return s1.compareTo(s2);
        }
    }


    public static class CompareByEmployer implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {

            Employer e1 = p1.getEmployer();
            Employer e2 = p2.getEmployer();

            String e1Name = e1.name();
            String e2Name = e2.name();

            return e1Name.compareTo(e2Name);
            // return p1.getEmployer().name()
            //        .compareTo(p2.getEmployer().name());

        }
    }


    public static class CompareByLocation implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {

             return p1.getLocation().compareTo(p2.getLocation());

        }
    }


    public static class CompareByName implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {

            return p1.getName().compareTo(p2.getName());
        }
    }


    public static void print(List<Person> personList) {

        for (Person p : personList) {
            System.out.println(p);
        }
    }


    public static Person stringToPerson(String text) {

        // text = "Anda, Bucuresti,   Visma"
        String[] textTokens = text.split(separatoRegex);
        //System.out.println(Arrays.toString(textTokens));

        String name = textTokens[0];
        String location = textTokens[1];

        // Employer.Visma.name() ---> returns "Visma"
        // Employer.valueOf("Visma") ---> returns Employer.Visma
        Employer employer = Employer.valueOf(textTokens[2]);

        return new Person(name, employer, location);
    }


    /**
     *
     * @param more
     * @return
     * @throws IOException
     */
    public static List<Person> fileToPersonList(String... more) throws IOException {

        List<String> fileLines = FileUtils.fileLinesToList(more);

        List<String> nonEmptyLines = FileUtils.extractNonEmptyLines(fileLines);

        List<Person> personList = new ArrayList<>();

        for (String line : nonEmptyLines) {

            Person currentPerson = stringToPerson(line);
            personList.add(currentPerson);
        }

        return personList;
    }


    // Semnatura metodei
    // Modificator de acces - public
    // Tip - static
    // Returned value: List<Person>
    // Input - parameters - List<Person> personList, String location
    public static List<Person> getEmployees(List<Person> personList, String location) {

        List<Person> employees = new ArrayList<>();

        for (Person person : personList) {

            if (person.getLocation().equals(location)) {
                employees.add(person);
            }
        }

        return employees;
    }


    public static List<Person> getEmployees(List<Person> personList, Employer employer) {

        List<Person> employees = new ArrayList<>();

        for (Person person : personList) {

            if (person.getEmployer().equals(employer)) {
                employees.add(person);
            }
        }

        return employees;
    }


    public static List<Person> getEmployees(
            List<Person> personList,
            Employer employer,
            String location) {

        List<Person> employees = new ArrayList<>();

        for (Person person : personList) {

            if (person.getEmployer().equals(employer)
                    && person.getLocation().equals(location)) {

                employees.add(person);
            }
        }

        return employees;
    }

}
