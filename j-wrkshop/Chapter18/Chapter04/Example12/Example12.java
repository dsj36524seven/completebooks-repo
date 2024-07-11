import java.util.*;

public class Example12 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(35);
        list.add(19);
        list.add(11);
        list.add(83);
        list.add(7);
        list.add(19);

        System.out.println(list);
        int index = list.indexOf(19);
        System.out.println("What index is the value 19 held in ?  : " + index);

        System.out.println("What is the value held in the index ? : " + list.get(index));

        // returns -1 if lastIndexOf not found !!
        int index2 = list.lastIndexOf(21);
        //int index2 = list.lastIndexOf(19);
        System.out.println("Method lastIndexOf - Return the index of last occurrence of a value : " + index2);

    }
}
