package com.packt.java.chapter15;

import java.util.stream.Stream;

public class Peek {

    public static void main(String[] args) {

        long count = Stream.of(6, 5, 3, 8, 1, 9, 2, 4, 7, 0)
                .peek((i) -> { System.out.print(i); })
                .filter((i) -> { return i < 5; })
                .peek((i) -> { System.out.print(i); })
                .map((i) -> { return String.valueOf(i); })
                //.peek((p) -> { System.out.print(p); })
                .count();
        System.out.println();
        System.out.println("total elements:  "+count);
        System.out.println();


        long sum = Stream.of(new MyItem(1), new MyItem(2), new MyItem(3))
                .peek((item) -> {
                    item.value = 4;
                })
                .mapToInt((item) -> { return item.value; })
                .sum();
        System.out.println(sum);
        System.out.println("mutated each item value = 4 --- 3 items x value = 12");
    }

private static class MyItem {
    int value;
    public MyItem(int value) {
        this.value = value;
    }
}

}
