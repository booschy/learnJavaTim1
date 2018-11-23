package utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public interface FileUtils {


    static Path getLocalPath(String... morePaths) {

        return Paths.get(
                System.getProperty("user.dir"),
                morePaths);
    }


    static List<String> fileLinesToList(String... morePaths) throws IOException {

        Path fileFullPath = getLocalPath(morePaths);

        return Files.readAllLines(fileFullPath);
    }


    static List<String> fileLinesToList(Path fileRelativePath) throws IOException {

        return Files.readAllLines(getLocalPath(fileRelativePath.toString()));
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


    public static <T> void write(Path outFilePath, T objectToWrite) throws Exception {

        try(
                FileOutputStream fos = new FileOutputStream(outFilePath.toFile());
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ){
            oos.writeObject(objectToWrite);
        }

        catch (IOException e){
            throw new Exception("Could not write to file " + outFilePath, e);
        }
    }


    public static <T> T read(Path inFilePath, T readObject) throws Exception {

        try (
                FileInputStream fis = new FileInputStream(inFilePath.toFile());
                ObjectInputStream ois = new ObjectInputStream(fis);

        ) {
            readObject = (T) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new Exception("Could not read from file " + inFilePath, e);
        }

        return readObject;
    }

}
