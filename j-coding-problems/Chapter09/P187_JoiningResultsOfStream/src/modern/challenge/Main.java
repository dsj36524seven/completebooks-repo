package modern.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        List<Melon> melons = Arrays.asList(new Melon("Crenshaw", 2000),
                new Melon("Hemi", 1600), new Melon("Gac", 3000),
                new Melon("Apollo", 2000), new Melon("Horned", 1700),
                new Melon("Gac", 3000), new Melon("Cantaloupe", 2600)
        );

        String melonNameWithoutOptionalProperties = melons.stream()
                .map(Melon::getType)
                .distinct()
                .sorted()
                .collect(Collectors.joining());

        System.out.println("Collectors.joining without any optional properties\n\t"+melonNameWithoutOptionalProperties);


        String melonNames = melons.stream()
                .map(Melon::getType)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", ", "Available melons: ", " Thank you!"));
        System.out.println("\n");
        System.out.println("Collectors.joining WITH optional properties\n\t");
        
        System.out.println("Melon names:\n" + melonNames);
    }
    
}
