package org.example.Head03_JCF.example05;

import java.util.Arrays;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 3, 6, 8);

        numbers.stream()
                .sorted() // 오름차순 정렬
                .forEach(num -> System.out.print(num + " "));
    }
}
