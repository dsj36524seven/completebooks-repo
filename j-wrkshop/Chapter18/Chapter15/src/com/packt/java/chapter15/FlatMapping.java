package com.packt.java.chapter15;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapping {

    public static void main(String[] args) {

        List<String> joined = List.of(
                Set.of("one", "two", "three"),
                Set.of("four", "five"),
                Set.of("six"),
                Set.of("six", "seven", "four")
        )
                .stream()
                .collect(Collectors.flatMapping(
                        (set) -> { return set.stream(); },
                        Collectors.toList())
                );
        System.out.println(joined);


        Set<String> joined2 = List.of(
                        Set.of("one", "two", "three"),
                        Set.of("four", "five"),
                        Set.of("six"),
                        Set.of("six", "seven", "four")
                )
                .stream()
                .collect(Collectors.flatMapping(
                        (set) -> { return set.stream(); },
                        Collectors.toSet())
                );
        System.out.println(joined2);


    }

}
