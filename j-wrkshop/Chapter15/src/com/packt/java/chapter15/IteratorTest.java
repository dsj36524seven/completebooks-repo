package com.packt.java.chapter15;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IteratorTest {

    public static void main(String[] args) {

        Iterator<Integer> iterator = Stream.of(1, 2, 3, 4, 5, 6)
                .iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(next);
        }

        System.out.println();

        PrimitiveIterator.OfInt iterator2 = IntStream.of(6, 5, 4, 3, 2, 1)
                .iterator();
        while (iterator2.hasNext()) {
            Integer next = iterator2.next();
            System.out.print(next);
        }

    }

}
