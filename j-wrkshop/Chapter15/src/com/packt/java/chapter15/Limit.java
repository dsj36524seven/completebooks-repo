package com.packt.java.chapter15;

import java.util.stream.Stream;

public class Limit {

    public static void main(String[] args) {

        // order of stream intermediate operations matters !!!

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .unordered()
                .parallel()
                .limit(5)
                .skip(2)
                .forEach((i) -> { System.out.println(i); });

        System.out.println();


        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .unordered()
                .parallel()
                .skip(2)
                .limit(5)
                .forEach((i) -> { System.out.println(i); });

    }

}
