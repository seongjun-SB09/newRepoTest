package org.example.Head03_JCF.example05;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        Map<String, String> scores = new HashMap<>();
        scores.put("Kim", "aaa");
        scores.put("Yun", "fff");
        scores.put("Lee", "ddd");

        Function<Map.Entry<String, String>, String> entryToString = new Function<Map.Entry<String, String>, String>() {
            @Override
            public String apply(Map.Entry<String, String> entry) {
                return entry.getKey() + ": " + entry.getValue();
            }
        };
        // 익명 클래스 사용
        scores.entrySet().stream()
                .map(entryToString)
                .forEach(result -> System.out.println("Student Info: " + result));

    }
}