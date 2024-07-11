package com.packt.java.chapter15;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Min {

    public static void main(String[] args) {

        Optional min = Stream.of(6, 3, 8, 12, 3, 9).min((a, b) -> { return a - b;});
        System.out.println(min);

        Optional minValue = Stream.of(21, 22, 23, 24, 25).min((a, b) -> {
            return a - b; });
        System.out.println(minValue);

        


    }

}
