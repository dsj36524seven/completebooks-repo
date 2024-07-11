package com.packt.java.chapter15;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningBy {

    public static void main(String[] args) {

Map<Boolean, List<Car>> partitioned = Stream.of(
        new Car("Toyota", 92),
        new Car("Kia", 104),
        new Car("Huyndai", 89),
        new Car("Toyota", 116),
        new Car("Mercedes", 209))
        .collect(Collectors.partitioningBy((car) -> { return car.enginePower > 100; }, Collectors.toList()));
        for (Map.Entry<Boolean, List<Car>> entry : partitioned.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString()); // output still objects :-(
        }

        // System.out.println(partitioned); <-- lists objects

        System.out.println();

Map<Boolean, Set<Car>> partitioned2 = Stream.of(
        new Car("Toyota", 92),
        new Car("Kia", 104),
        new Car("Huyndai", 89),
        new Car("Toyota", 116),
        new Car("Mercedes", 209))
        .collect(Collectors.partitioningBy((car) -> { return car.enginePower > 100; }, Collectors.toSet()));

        partitioned2.keySet().forEach(k -> System.out.println(k + " : " + partitioned2.get(k))); // output still objects :-(
        partitioned2.values().forEach(v -> System.out.println("value : " + v )); // output still objects :-(

        // System.out.println(partitioned2); <-- lists objects

        partitioned2.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue())); // output still objects :-(

    }

private static class Car {
    String brand;
    long enginePower;
    Car(String brand, long enginePower) {
        this.brand = brand;
        this.enginePower = enginePower;
    }

    public String getBrand() {
        return brand;
    }
}

}
