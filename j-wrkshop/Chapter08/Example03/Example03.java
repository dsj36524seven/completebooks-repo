import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example03 {
    public static void main(String[] args) throws IOException {
        // String pathString = System.getProperty("java.io.tmpdir");
        String pathString = System.getProperty("user.home");

        Path path = Paths.get(pathString);
        // Stream<Path> fileNames = Files.list(path);
        Stream<Path> fileNames = Files.list(path).filter(Files::isDirectory);

        //fileNames.limit(5).forEach(System.out::println);
        fileNames.limit(5).forEach((item) -> {
            System.out.println(item.toString());
            try{
                Stream<Path> filenames2 = Files.list(item).filter(Files::isDirectory);
                filenames2.forEach(System.out::println);
            } catch (IOException ioe) {}
        });
    }
}
