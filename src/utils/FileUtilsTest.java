package utils;

import fundamentals.bank.ResourceDirectories;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtilsTest {


    @Test
    public void test_file_utils() {

        final String USER_DIR = System.getProperty("user.dir");
        System.out.println("User directory: " + USER_DIR);

        Path fullFilePath = FileUtils.getLocalPath(
                ResourceDirectories.Resource.name(),
                ResourceDirectories.Fundamentals.name(),
                ResourceDirectories.Bank.name(),
                "employees.csv");

        System.out.println(fullFilePath);

        // prints user.dir
        // System.out.println(getLocalPath());

        System.out.println(Paths.get(
                "C:\\Users\\dan.rusu.IN"));
    }
}
