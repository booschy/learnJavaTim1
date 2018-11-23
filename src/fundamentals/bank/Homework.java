package fundamentals.bank;

import utils.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static fundamentals.bank.Persons.fileToPersonList;


public class Homework {


    @Test
    public void test_homework() throws IOException {

        // step 1
        // user.dir/BankResources/Homework/timisoara_employees.txt
        List<Person> personList = fileToPersonList(
                ResourceDirectories.Resource.name(),
                ResourceDirectories.Fundamentals.name(),
                ResourceDirectories.Bank.name(),
                ResourceDirectories.Homework.name(),
                "timisoara_employees.txt");

        //personList.forEach(System.out::println);

        // step 2 + 3
        String statistics = "Timisoara IT companies employee statistics:\n"
                + getStatistics(personList);

        //System.out.println(statistics);

        Path outputFilePath = FileUtils.getLocalPath(
                ResourceDirectories.Resource.name(),
                ResourceDirectories.Fundamentals.name(),
                ResourceDirectories.Bank.name(),
                ResourceDirectories.Homework.name(),
                "timisoara_employees_statistics.txt");

        Files.write(outputFilePath, statistics.getBytes());
    }


    // step 2
    public static int countEmployees(List<Person> peronList, Employer employer){

        int count = 0;

        for( Person currentPerson : peronList){

            if(currentPerson.getEmployer().equals(employer)){
                count++;
            }
        }

        return count;
    }


    // step 3
    public static String getStatistics(List<Person> personList){

        String statistics = "";
        List<Employer> employers = Arrays.asList(Employer.values());

        for(Employer currentEmployer : employers){

            int employerCount = countEmployees(personList, currentEmployer);
            statistics += "\n" + currentEmployer.name() + ": " + employerCount + "\n";
        }


        return statistics;
    }
}
