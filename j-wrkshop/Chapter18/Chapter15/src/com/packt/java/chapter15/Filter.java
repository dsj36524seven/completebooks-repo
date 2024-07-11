package com.packt.java.chapter15;

import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5, 6)
                .filter(i -> i > 3)
                .forEach(System.out::println);


        Stream.of("Start", "stop", "brand", "Stand")
                .filter(i -> i.startsWith("st"))
                .forEach(System.out::println);

        Stream.of("Start", "stop", "brand", "Stand")
                .filter(i -> i.toLowerCase().startsWith("st"))
                .forEach(System.out::println);







    }

}
