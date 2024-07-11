package com.packt.java.chapter15;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Average {

    public static void main(String[] args) {

        OptionalDouble avg = IntStream.of(6, 3, 8, 12, 3, 9).average();
        System.out.println(avg);

        OptionalDouble avg2 = LongStream.of(66456, 3346346, 834636, 1234636,34633, 9).average();
        System.out.println(avg2);

        OptionalDouble avg3 = DoubleStream.of(6.5, 3.1, 8.4, 12.9, 3.1, 9.2).average();
        System.out.println(avg3);

    }

}
