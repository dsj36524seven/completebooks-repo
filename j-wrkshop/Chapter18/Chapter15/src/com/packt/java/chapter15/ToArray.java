package com.packt.java.chapter15;

import java.util.stream.Stream;

public class ToArray {

    public static void main(String[] args) {

        Object[] array = Stream.of(1, 4, 6, 2, 3, 7, 0).toArray();
        for (Object o : array) {
            System.out.print((Integer) o);

        }
        System.out.println();

       Integer[] array2 = Stream.of(1, 4, 6, 2, 3, 7, 1).toArray(Integer[]::new);
        for (Integer e:array2
             ) {
            System.out.print(e);

        }
        System.out.println();

        Integer[] array3 = Stream.of(1, 4, 6, 2, 3, 7, 2).toArray(elements -> new Integer[elements]);
        for (Integer e:array3
        ) {
            System.out.print(e);

        }
        System.out.println();

    }

}
