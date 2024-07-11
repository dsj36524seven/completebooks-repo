import java.util.*;
import java.util.stream.Stream;

public class Example05 {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[] {3, 25, 2, 79, 2};

        Set<Integer> mySet = new HashSet(Arrays.asList(myArray));

        System.out.println(mySet);

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        String[] myArray2 = new String[] {"welcome", "to", "the", "jungle", "to"};
        for (String word: myArray2) {
            System.out.println(word);
        }
        List<String> myListString2 = new ArrayList<>(Arrays.asList(myArray2));
        System.out.println(myListString2);

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        Arrays.sort(myArray2);

        Set mySet2 = new HashSet(Arrays.asList(myArray2));
        System.out.println("Count of elements in Set : "+mySet2.size());
        System.out.println(mySet2);
        // looping through works also
        for (Object word: mySet2) {
            System.out.println(word);
        }

        System.out.println();
        System.out.println("----------------");
        System.out.println();



    }
}
