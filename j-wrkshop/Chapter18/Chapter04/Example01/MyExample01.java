import java.util.Arrays;

public class MyExample01 {
    public static void main(String[] args) {
        String[] text = new String[] { "spam", "more", "buy" };

        Arrays.sort(text);

        System.out.println(Arrays.toString(text));

        for (int i = 0; i < text.length; i++)
            System.out.print(text[i] + " ");

        System.out.println();

        int[] numbers = new int[5];
        Arrays.fill(numbers, 0);
        System.out.print(Arrays.toString(numbers));

        



    }
}
