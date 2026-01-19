package org.example.Head04_BigO.example01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // key-value 저장소 생성
        Map<String, Integer> map = new HashMap<>();

        // 데이터 저장
        map.put("apple", 1000); // apple -> hash -> 저장
        map.put("banana", 1500); // banana -> 다른 위치
        map.put("apple", 1200); // 같은 key -> 값 덮어쓰기

        // 값 조회, O(1)
        System.out.println(map.get("apple"));         // 1200

        // Key 존재 확인
        System.out.println(map.containsKey("banana")); // true

    }
}

// 빈도수 카운터
// Map<String, Integer> wordCount = new HashMap<>();
// for(String word : words) {
//		wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
// }
