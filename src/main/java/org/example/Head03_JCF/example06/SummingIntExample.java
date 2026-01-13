package org.example.Head03_JCF.example06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntExample {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(5, 12, 44, 13);
        List<Double> doubles = Arrays.asList(2.2, 3.3, 2.1, 5.9);
        List<Long> longs = Arrays.asList(1L, 2L, 3L);


        int intSum = ints.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        Double doubleSum = doubles.stream()
                .collect(Collectors.summingDouble(Double::doubleValue));
        Long longSum = longs.stream()
                .collect(Collectors.summingLong(Long::longValue));

        System.out.println("intSum = " + intSum);
        System.out.println("doubleSum = " + doubleSum);
        System.out.println("longSum = " + longSum);
    }
}
