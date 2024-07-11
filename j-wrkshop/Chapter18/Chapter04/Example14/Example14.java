import java.util.*;

import static java.util.Collections.sort;

public class Example14 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("No");
        list.add("Matter");
        list.add("What");
        list.add("You");
        list.add("Do");

        System.out.println(list);

        // NB: sublist range is ([args1:inclusive], [args2:exclusive])


        list.subList(2,4).clear();

        System.out.println(list);


         List list1 = new ArrayList();
         List list2 = new ArrayList();
         list1.add("I ");
         list1.add("will ");
         list1.add("survive ");
         list1.add("no ");
         list1.add("matter ");
         list1.add("the ");
         list1.add("price ");
         System.out.println(list1);

         // subList removed items into list2
         list2 = list1.subList(0,2);
         System.out.println(list2);
         // use sublist to remove items from a list
         list1.subList(0, 2).clear();
         System.out.println(list1);

         // sort list
         Collections.sort(list);
         list.forEach(System.out::println);
         System.out.println();

         // shuffle list
         Collections.shuffle(list);
         list.forEach(System.out::println);

         // reverse list
        //Collections.reverse(list2);
        //list2.forEach(System.out::println);

        // addAll into list
        //Collections.addAll(list, list1, list2);
       // list.forEach(System.out::println);


        //rotate list
        //System.out.println("Before rotate : "+list2);
       // Collections.rotate(list2, -3);
       // System.out.println("After rotate : " + list2);


    }
}
