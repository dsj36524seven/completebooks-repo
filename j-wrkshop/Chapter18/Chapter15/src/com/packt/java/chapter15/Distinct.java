package com.packt.java.chapter15;

import java.util.stream.Stream;

public class Distinct {

    public static void main(String[] args) {

        Stream.of(1, 2, 2, 2, 2, 3)
                .distinct()
                .forEach((i) -> { System.out.print(i); });

        System.out.println();

        Stream.of("a", "a", "b", "b", "c", "c")
                .distinct()
                .forEach((i) -> { System.out.print(i); });

    }

}
