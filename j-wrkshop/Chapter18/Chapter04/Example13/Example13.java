import java.util.*;

public class Example13 {
    public static void main(String[] args) {
        List list = new ArrayList();

        // add a node
        list.add(35);
        list.add(19);
        list.add(11);
        list.add(83);
        list.add(7);
        list.add(71);
        list.add(83);
        System.out.println(list);

        // find the last occurrence of a node
        int index = list.lastIndexOf(83);
        System.out.println("Before: find 83 at: " + index);


        //removing a node
        list.remove(index - 1);
        System.out.println(list);
        // find the last occurrence of a node
        index = list.lastIndexOf(83);
        System.out.println("After: find 83 at: " + index);

        // change the value of a node
        list.set(index -1, 99);
        System.out.println(list);
        // find the last occurrence of a node
        index = list.lastIndexOf(83);
        System.out.println("After: list.set 83 is now at:  " + index);

        // removing all nodes
        list.clear();
        System.out.println(list);





    }
}
