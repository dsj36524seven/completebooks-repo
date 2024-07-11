package com.packt.java.chapter15;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class AnyMatch {

    public static void main(String[] args) {

        boolean matched = Stream.of(6, 3, 8, 12, 3, 9).anyMatch((e) -> { return e > 10; });
        System.out.println(matched);

        boolean matchFound = DoubleStream.of(10.2, 9.1, 8.3)
                .anyMatch((e) -> {return e > 10.1; });
        System.out.println(matchFound);

    }

}
