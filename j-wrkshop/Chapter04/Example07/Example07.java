import java.util.*;

public class Example07 {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[] {3, 25, 2, 79, 2};

        Set mySet = new HashSet();

        Collections.addAll(mySet, myArray);

        System.out.println(mySet);
        System.out.println("----------------");


        Set myLinkedHashSet  = new LinkedHashSet();
        Collections.addAll(myLinkedHashSet, myArray);
        System.out.println(myLinkedHashSet);
        System.out.println("----------------");

    }
}
