package org.example.Head03_JCF.example03;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class FilterMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Yun", 75);
        scores.put("Lee", 90);

        //익명 클래스 활용 Predicate > 점수 80점 이상인지 판별
        Predicate<Map.Entry<String, Integer>> highScore = new Predicate<Map.Entry<String, Integer>>() {
            @Override
            public boolean test(Map.Entry<String, Integer> entry) {
                return entry.getValue() >= 80;
            }
        };

        //
        scores.entrySet().stream()
                .filter(highScore)
                .forEach(entry ->
                        System.out.println("High Scores: " + entry.getKey() + " => " + entry.getValue()));
    }
}
