package com.packt.java.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {

    public static void main(String[] args) {


        List<String> list = new ArrayList();
        list =
        List.of("one", "two", "three", "four", "five")
                .stream()
                .filter(e ->  e.endsWith("e"))
                .collect(Collectors.toList());

        System.out.println(list);
    }

}
