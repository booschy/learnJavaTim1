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
        //TODO move to separate files
/*        testFileUtils();

        throwablesTest();*/

/*        List<String> employeesLines = fileLinesToList(
                BankResources.name(),
                "employees.csv");

        List<String> nonEmptyEmployeesLines = extractNonEmptyLines(employeesLines);


        for(String line : nonEmptyEmployeesLines){
            System.out.println(line);
        }*/
        //nonEmptyEmployeesLines.forEach(System.out::println);


    }

    private static void throwablesTest() {
        // Throwable <- Exception <- ...
        //           <- Error <- ...

        try {
            // checked exception
            // 2 WAYS OF HANDLING
            // a) add exception to method signature
            // b) surround with try and catch
            throw new Exception("Test exception!");

            // unchecked eception
            // DOES NOT NEED HANDLING IN CODE FOR COMPILATION
            // throw new Error("Test exception!");

        }
        catch(Throwable e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }

        // not reachable without try/catch
        System.out.println("END");
    }


    private static void testFileUtils() {

        final String USER_DIR = System.getProperty("user.dir");
        System.out.println("User directory: " + USER_DIR);

        Path fullFilePath = getLocalPath(
                ResourcesDirectories.BankResources.name(),
                "employees.csv");

        System.out.println(fullFilePath);

        // prints user.dir
        // System.out.println(getLocalPath());

        System.out.println(Paths.get(
                "C:\\Users\\dan.rusu.IN"));
    }

}
