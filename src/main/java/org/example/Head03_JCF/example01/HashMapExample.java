package org.example.Head03_JCF.example01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        //key - value : add
        scores.put("KIM", 90);
        scores.put("YUN", 94);
        scores.put("LEE", 92);
        System.out.println("After put: " + scores);

        //기존 키에 다른 값 할당
        scores.put("LEE", 82);
        System.out.println("After updating put: " + scores);

        //특정 키 값 조회
        int kimScore = scores.get("KIM");
        System.out.println("Kim`s score: " + kimScore);

        //키 존재 여부
        System.out.println("Contains 'Yun' ? " + scores.containsKey("YUN"));

        //remove
        scores.remove("LEE");
        System.out.println("After remove: " + scores);

        //모든 키 조회
        System.out.println("All keys: " + scores.keySet());

    }
}
