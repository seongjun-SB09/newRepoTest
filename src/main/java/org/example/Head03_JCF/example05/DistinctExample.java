package org.example.Head03_JCF.example05;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Yun", "Lee", "Park");

        names.stream()
                .distinct()
                .forEach(name -> System.out.println("DistinctExample :" + name));
    }
}
