package org.example.Head03_JCF.example05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ForEachVsForExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //전통 for문
        System.out.println("=== Using for loop ===");
        for (int i = 1; i <numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                continue; // 홀수 건너뛰기
            }
            System.out.println("Even number: " + numbers.get(i));
        }

        //향상된 for문
        System.out.println("=== Using enhanced for ===");
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                continue;
            }
            System.out.println("Even number: " + num);
        }

        //stream forEach
        System.out.println("=== Using Stream filter + forEach ===");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println("Even number: " + n));
    }
}
