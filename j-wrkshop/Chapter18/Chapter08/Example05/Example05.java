import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Example05 {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("user.home");

        List<Path> subDirectories = Files.walk(Paths.get(pathString), 5)
            .filter(Files::isDirectory)
            .collect(Collectors.toList());

        for (int i = 0; i < 20; i++ ) {
            Path filePath = subDirectories.get(i);
            String fileType = Files.isDirectory(filePath) ? "Dir" : "Fil";
            System.out.println(fileType + " " + filePath);
        }
    }
}
