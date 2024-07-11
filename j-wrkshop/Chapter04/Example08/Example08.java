import java.util.*;

public class Example08 {
    public static void main(String[] args) {
        Integer[] numbers1 = new Integer[] {3, 25, 2, 79, 2};
        Integer[] numbers2 = new Integer[] {7, 12, 14, 79};

        Set set1 = new HashSet();
        Collections.addAll(set1, numbers1);
        System.out.println("set1 : "+set1);

        Set set2 = new HashSet();
        Collections.addAll(set2, numbers2);
        System.out.println("set2 : "+set2);


        set1.addAll(set2);
        System.out.println("Unsorted - union of set2 into set1 : "+ set1);
        System.out.println("--------------");

        Set myTreeSet = new TreeSet<>();
        myTreeSet.addAll(set1);
        System.out.println("TreeSet - sorted set1 : " +myTreeSet);
        System.out.println("--------------");

    }
}
