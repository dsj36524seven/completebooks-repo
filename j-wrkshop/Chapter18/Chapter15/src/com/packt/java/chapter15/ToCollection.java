package com.packt.java.chapter15;

import java.util.*;
import java.util.stream.Collectors;

public class ToCollection {

    public static void main(String[] args) {


    TreeSet treeSet;
    treeSet = List.of("one", "two", "three", "four", "five", "one")
                .stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);


    HashSet hashSet;
        hashSet = List.of("one", "two", "three", "four", "five", "one")
                .stream()
                .sorted()
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(hashSet);





    }

}
