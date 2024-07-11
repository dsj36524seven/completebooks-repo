import java.util.*;

public class Example06 {
    public static void main(String[] args) {
        String[] myArray = new String[] {"3", "25", "2", "79", "2"};

        Set mySet = new HashSet();

        Collections.addAll(mySet, myArray);

        System.out.println(mySet);
        System.out.println("----------------");
        System.out.println();

        String[] myArray2 = new String[] {"welcome", "to", "the", "jungle"};
        Set myTreeSet = new TreeSet();
        Collections.addAll(myTreeSet, myArray2);
        System.out.println(myTreeSet);
        System.out.println("----------------");
        System.out.println();






    }
}
