package bank;

import utils.FileUtils;

import static bank.ResourcesDirectories.BankResources;
import static utils.FileUtils.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Test {

    public static void main(String[] args) throws IOException {


        System.out.println(System.getProperty("test"));
        System.out.println(System.getProperty("name"));


/*        List<String> employeesLines = fileLinesToList(
                BankResources.name(),
                "employees.csv");

        List<String> nonEmptyEmployeesLines = extractNonEmptyLines(employeesLines);


        for(String line : nonEmptyEmployeesLines){
            System.out.println(line);
        }*/
        //nonEmptyEmployeesLines.forEach(System.out::println);


    }


}
