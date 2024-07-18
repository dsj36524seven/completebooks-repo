package modern.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<String> melons = Arrays.asList("Gac", "Cantaloupe", "Hemi",
                "Gac", "Gac", "Hemi", "Cantaloupe", "Horned", "Hemi", "Hemi");

        Optional<String> anyMelon = melons.stream()                
                .findAny();

        if (!anyMelon.isEmpty()) {
            System.out.println("findAny melon: " + anyMelon.get());
        } else {
            System.out.println("No melon was found");
        }
        
        String anyApollo = melons.stream()
                .filter(m -> m.equals("Apollo"))
                .findAny()
                .orElse("nope");
        System.out.println("findAny Apollo? " + anyApollo);


        Optional<String> firstMelon = melons.stream()
                .findFirst();

        if (!firstMelon.isEmpty()) {
            System.out.println("findFirst melon: " + firstMelon.get());
        } else {
            System.out.println("No melon was found");
        }        

        String firstApollo = melons.stream()
                .filter(m -> m.equals("Apollo"))
                .findFirst()
                .orElse("nope");
        System.out.println("findFirst Apollo? " + firstApollo);

        List<Integer> ints = Arrays.asList(4, 8, 4, 5, 5, 7);

        int result = ints.stream()
                .map(x -> x * x - 1)     // 15, 63, 15, 24, 24, 48
                .filter(x -> x % 2 == 0) // 24, 24, 48
                .findFirst()             // 24
                .orElse(-1);

        System.out.println("findFirst OrElse Result: " + result);


        // ------ findAny ---------


        List<Integer> ints2 = Arrays.asList(4, 8, 4, 5, 5, 7);

        int result2 = ints2.stream()
                .map(x -> x * x - 1)     // 15, 63, 15, 24, 24, 48
                .filter(x -> x % 3 == 0) // 15, 63, 15, 24, 24, 48
                .findAny()
                .orElse(-1);

        System.out.println("findFirst orElse Result 2: " + result2);

    }

}
