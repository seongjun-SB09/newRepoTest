package org.example.Head03_JCF.example05;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExampleLambda {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 100);
        scores.put("Yun", 90);
        scores.put("Lee", 100);

        Function<Map.Entry<String, Integer>, String> entryToString= new Function<Map.Entry<String, Integer>, String>() {
            @Override
            public String apply(Map.Entry<String, Integer> entry) {
                return entry.getKey() + ": " + entry.getValue();
            }
        };

        // 람다 사용
        scores.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(result -> System.out.println("Student Info: " + result));

    }
}
