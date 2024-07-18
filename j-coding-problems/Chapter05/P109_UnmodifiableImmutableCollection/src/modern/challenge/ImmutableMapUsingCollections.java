package modern.challenge;

import java.util.Collections;
import java.util.Map;

import static java.util.Map.entry;

public class ImmutableMapUsingCollections {

    public static Map<Integer, MutableMelon> getEmptyMap() {
        return Collections.emptyMap();
    }


    //
    // unmodifiable
    public static Map<Integer, MutableMelon> getMapOfSingletonMelonUnmodifiable(){
        return  Collections.singletonMap(1, new MutableMelon("Gac", 1200));
    }


    // immutable
    public static Map<Integer, ImmutableMelon> getMapOfSingletonMelonImmutable() {
        return  Collections.singletonMap(1, new ImmutableMelon("Gag", 1200));
    }



    // examples using .ofEntries() method to create unmodifiable/immutable maps

    private static Map<Integer, MutableMelon> mapOfMutableMelon =
            Map.ofEntries(entry(1, new MutableMelon("Apollo", 3000)),
            entry(2, new MutableMelon("Jade Dew", 3500)),
            entry(3, new MutableMelon("Cantaloupe", 1500)));



    private static Map<Integer, ImmutableMelon> mapOfImmutableMelon =
            Map.ofEntries(entry(1, new ImmutableMelon("Apollo", 3000)),
            entry(2, new ImmutableMelon("Jade Dew", 3500)),
            entry(3, new ImmutableMelon("Cantaloupe", 1500)));


    public static Map<Integer, ImmutableMelon> copyOfMapImmutableMelon () {
        return Map.copyOf(mapOfImmutableMelon);
    }

    public static Map<Integer, MutableMelon> copyOfMapMutableMelon () {
        return Map.copyOf(mapOfMutableMelon);
    }





}
