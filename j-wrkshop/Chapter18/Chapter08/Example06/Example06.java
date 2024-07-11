import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Example06 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javaTempExample06/";
        Path pathDirectory = Paths.get(pathString);
        if(Files.exists(pathDirectory)) {
            System.out.println("WARNING: directory exists already at: " + pathString);
        } else {
            try {
                // Create the directory
                Files.createDirectories(pathDirectory);
                System.out.println("New directory created at: " + pathString);
            } catch (IOException ioe) {
                System.out.println("Could not create the directory");
                System.out.println("EXCEPTION: " + ioe.getMessage());
            }
        }

        String fileName = "tempExample06.txt";
        Path pathFile = Paths.get(pathString + fileName);
        if(Files.exists(pathFile)) {
            System.out.println("WARNING: file exists already at: " + pathFile);
        } else {
            try {
                // Create the file
                Files.createFile(pathFile);
                System.out.println("New file created at: " + pathFile);
            } catch (IOException ioe) {
                System.out.println("Could not create the file");
                System.out.println("EXCEPTION: " + ioe.getMessage());
            }
        }


        try {
            Files.write(pathFile, Arrays.asList("hello mother, hello father"), StandardOpenOption.APPEND);
            System.out.println("Text added to the file : " + pathFile);
        } catch (IOException ioe) {
            throw new RuntimeException("EXCEPTION : " + ioe);
        }
    }
}
