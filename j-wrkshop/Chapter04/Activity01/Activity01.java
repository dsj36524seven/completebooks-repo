import java.util.Arrays;

public class Activity01 {
    public static void main(String[] args) {

        String[] text = {"So", "many", "books", "so", "little", "time"};
        String toSearch = "nope";
        // String toSearch2 = "so";
        int occurrence = -1;

        for(int i = 0; i < 5; i++) {
            if (text[i].compareToIgnoreCase(toSearch) == 0) {
                System.out.println("Located sequence "+ "\'"+toSearch+ "\' at index : " + i);
                occurrence++;
            } 
        }

        if (occurrence > -1) {
            occurrence++;
            System.out.println("Found : " + occurrence + " occurrences of "+ "\'"+toSearch+"\'");
        } else {
            System.out.println("\'"+toSearch+ "\' - sequence not in array !!");
        }

    }
}
