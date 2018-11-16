package fundamentals.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public interface FileUtils {


    static Path getLocalPath(String... more) {

        return Paths.get(
                System.getProperty("user.dir"),
                more);
    }


    static List<String> fileLinesToList(String... more) throws IOException {

        Path fileFullPath = getLocalPath(more);

        return Files.readAllLines(fileFullPath);
    }


    static List<String> extractNonEmptyLines(List<String> linesList) {

        List<String> nonEmptyLinesList = new ArrayList<>();

        for (String line : linesList) {

            if (false == line.isEmpty()) {
                nonEmptyLinesList.add(line);
            }
        }

        return nonEmptyLinesList;
    }

}
