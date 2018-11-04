package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface FileUtils {



    public static Path getLocalPath(String... more) {

        return Paths.get(
                System.getProperty("user.dir"),
                more);
    }


    public static List<String> fileLinesToList(String... more) throws IOException {

        Path employeesFullPath = getLocalPath(more);

        List<String> fileLines = Files.readAllLines(employeesFullPath);

        return fileLines;

        // oneline
        //return   Files.readAllLines(getLocalPath(more));
    }


    public static List<String> extractNonEmptyLines(List<String> linesList){

        List<String> nonEmptyLinesList = new ArrayList<>();

        for(String line : linesList){

            if(false == line.isEmpty()){
                nonEmptyLinesList.add(line);
            }
        }

        return nonEmptyLinesList;
    }
}
