import java.io.Console;
import java.util.*;

public class AnalyzeInput02_a {
    public static void main(String[] args) {
        ArrayList <String> text = new ArrayList <String> ();
        Console cons;
        String line = "";

        while (!line.equals("*")
                && (cons = System.console()) != null
                && (line = cons.readLine()) != null) {
            List <String> lineList = new ArrayList <String> (Arrays.
asList(line.split(" ")));
            text.addAll(lineList);
        }

        System.out.println("You typed: " + text);
        System.out.println("Word count: " + text.size());

        Set<String> textSet = new HashSet<>();
        textSet.addAll(text);
        Iterator iterator =textSet.iterator();


        Map map = new HashMap();
        while(iterator.hasNext()) {
            //point to the next element
            String s = (String) iterator.next();
            // get the amount of times this word shows up in the text
            int freq = Collections.frequency(text, s);
            System.out.println(s + " appears " + freq + " times ");

            // now add items to the map
            map.put(s, freq);
        }
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        System.out.println(treeMap);
    }
}

