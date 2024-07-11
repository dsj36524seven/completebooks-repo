package com.packt.java.chapter15;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Max {

    public static void main(String[] args) {

        Optional max = Stream.of(6, 3, 8, 12, 3, 9).max((a, b) -> { return a - b;});
        System.out.println(max);

        Optional myMax = Stream.of(6, 5, 4, 3, 2)
                .max((a, b) -> {return  a - b;});
        System.out.println(myMax);


    }

}
