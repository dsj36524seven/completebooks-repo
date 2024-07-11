import java.util.Arrays;

public class Example04 {
    public static void main(String[] args) {
        String[] text = {"love","is", "in", "the", "air"};

        int search = Arrays.binarySearch(text, "is");
        System.out.println(search);
        System.out.println();

        String[] text2 = {"hello", "mother", "welcome", "father", };
        Arrays.sort(text2);
        for (String word: text2) {
            System.out.println(word);
        }

        search = Arrays.binarySearch(text2, "mother");
        System.out.println(search);
    }
}
