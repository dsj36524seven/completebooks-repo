import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalyzeInput01 {
    public static void main(String[] args) {

        ArrayList<String> text = new ArrayList<>();

        Console console;
        String line = "";
        while (!line.equals('*')
                && (console = System.console()) != null
                && (line = console.readLine()) != null) {

            /* having all the data stored in this way allows for the use of a lot of the
             methods available in the collections framework ... operations with the data */

            List<String> lineList = new ArrayList<>(Arrays.asList(line.split(" ")));
            text.addAll(lineList);
        }
        System.out.println("You typed: " + line);
        System.out.println("Word count : " + text.size());
    }
}
