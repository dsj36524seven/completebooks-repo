package modern.challenge;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // String array
        String[] arr = {"One", "Two", "Three", "Four", "Five"};

        // array to Stream
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);
//-----------
        System.out.println();
        Stream<String> stream2 = Arrays.stream(arr, 0, 2);
        System.out.println(stream2.count());
        System.out.println();
// -------
        Stream<String> stream3 = Arrays.asList(arr).stream();
        stream3.filter(s -> s.length() > 3).forEach(System.out::println);
        System.out.println();
// -------
        Stream<String> stream4 = Arrays.asList(arr).subList(0, 2).stream();
        System.out.println(stream4.findAny().get().toUpperCase());
        System.out.println();
// -------
        Stream<String> stream5 = Stream.of(arr);
        Stream<String> stream6 = Stream.of("One", "Two", "Three");

        // Stream to array

        Stream<String> stream7 = Arrays.stream(arr);
        String[] array7 = stream7.toArray(String[]::new);
        System.out.println("Arr7 -> length of first element : " +array7[0].length());
        System.out.println();

        // integers array
        int[] integers = {2, 3, 4, 1};
        Integer[] boxedInt = {2, 3, 4, 1};

        IntStream intStream1 = Arrays.stream(integers);
        IntStream intStream2 = IntStream.of(integers);
        IntStream intStream3 = IntStream.range(0, integers.length);
        IntStream intStream4 = IntStream.rangeClosed(0, integers.length);
        Stream<Integer> intStream5 = Stream.of(boxedInt);

        int[] intArray1 = intStream1.toArray();
        int[] intArray2 = intStream5.mapToInt(i -> i).toArray();
    }
}
