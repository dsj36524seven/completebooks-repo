package com.packt.java.chapter15;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirst {

    public static void main(String[] args) {

        Optional firstElement = Stream.of().findFirst();
        System.out.println(firstElement);


        Optional firstElementTake2 = Stream.of("will", "select", "the", "first", "element")
                .findFirst();
        System.out.println(firstElementTake2);

    }

}
