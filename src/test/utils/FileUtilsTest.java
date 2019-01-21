package test.utils;

import main.utils.FileUtils;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static main.fundamentalsCoding.bank.ResourceDirectory.*;

public class FileUtilsTest {


    @Test
    public void test_file_utils() {

        final String USER_DIR = System.getProperty("user.dir");
        System.out.println("User directory: " + USER_DIR);

        Path fullFilePath = FileUtils.getLocalPath(
                RESOURCE,
                FUNDAMENTALS,
                BANK).resolve("employees.csv");

        System.out.println(fullFilePath);

        // prints user.dir
        // System.out.println(getLocalPath());

        System.out.println(Paths.get(
                "C:\\Users\\dan.rusu.IN"));
    }
}
