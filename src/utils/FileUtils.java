package utils;

import fundamentals.bank.ResourceDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public interface FileUtils {


    static Path getLocalPath(String... morePaths) {

        return Paths.get(
                System.getProperty("user.dir"),
                morePaths);
    }


    static Path getLocalPath(ResourceDirectories... moreDirs) {

        return Paths.get(

                System.getProperty("user.dir"),

                List.of(moreDirs)
                        .stream()
                        .map(resDir -> resDir.name())
                        .collect(Collectors.toList())
                        .toArray(new String[0]));
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


    public static <T> void write(
            Path outFilePath,
            T objectToWrite) throws Exception {

        final File outFile = outFilePath.toFile();

        // try with resources
        // all resources (FileOutputStream, ObjectOutputStream) will be closed when leaving the try/catch
        // resourced must implement Closeable
        try (
            // Throweable <- Exception <- IOException <- FileNotFoundException
            FileOutputStream fos = new FileOutputStream(outFile);

            // Throweable <- Exception <- IOException
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ){

            // object -> ObjectOutputStream -> FileOutputStream -> outFile
            oos.writeObject(objectToWrite);

        } catch (IOException e) {
            throw new Exception("Could not write to file " + outFilePath, e);
        }



        /*try(

        ){
            oos.writeObject(objectToWrite);
        }

        catch (IOException e){
            throw new Exception("Could not write to file " + outFilePath, e);
        }*/
    }


    public static <T> T read(Path inFilePath, T returnedObject) throws Exception {

        try (
                FileInputStream fis = new FileInputStream(inFilePath.toFile());
                ObjectInputStream ois = new ObjectInputStream(fis);

        ) {
            // file -> FileInputStream -> ObjectInputStream -> returnedObject
            return (T) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new Exception("Could not read from file " + inFilePath, e);
        }
    }

}
