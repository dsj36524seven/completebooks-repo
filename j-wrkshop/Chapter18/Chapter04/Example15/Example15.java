import java.util.*;

public class Example15 {
    public static void main(String[] args) {
        Map map = new HashMap();

        // deprecated
//        map.put("number", new Integer(1));
//        map.put("text", new String("hello"));
//        map.put("decimal", new Double(5.7));

        map.put("number", Integer.valueOf(1));
        map.put("text", new String("hello"));
        map.put("decimal", Double.valueOf(5.7));


        System.out.println(map.get("text"));

        if (!map.containsKey("byte")) {
            System.out.println("There are no bytes here!");
        }
        if (map.containsValue(5.7)) {
            System.out.println("Decimal found :" +map.get("decimal"));
        }

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
}
