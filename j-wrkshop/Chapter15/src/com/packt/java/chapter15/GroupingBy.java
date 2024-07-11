package com.packt.java.chapter15;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {

    public static void main(String[] args) {

        Map<String, List<Car>> grouped = Stream.of(
                        new Car("Toyota", 92),
                        new Car("Kia", 104),
                        new Car("Huyndai", 89),
                        new Car("Toyota", 116),
                        new Car("Mercedes", 209))
                .collect(Collectors.groupingBy(Car::getBrand));
        System.out.println(grouped);
        System.out.println();


        Map<String, Set<Car>> grouped2 = Stream.of(
                        new Car("Toyota", 92),
                        new Car("Kia", 104),
                        new Car("Huyndai", 89),
                        new Car("Toyota", 116),
                        new Car("Mercedes", 209))
                .collect(Collectors.groupingBy(Car::getBrand, Collectors.toSet()));
        System.out.println(grouped2);

        System.out.println();


        Map<String, Optional<Car>> grouped3 = Stream.of(
                new Car("Toyota", 92),
                new Car("Kia", 104),
                new Car("Huyndai", 89),
                new Car("Toyota", 116),
                new Car("Mercedes", 209))
                .collect(Collectors.groupingBy(Car::getBrand, Collectors.reducing(
                        ( carA, carB) -> {
                            if (carA.enginePower > carB.enginePower) {
                                return carA;
                            }
                            return carB;
                        })));
        System.out.println(grouped3);

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
