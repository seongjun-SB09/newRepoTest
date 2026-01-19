package org.example.Head04_BigO.example03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextFIleToMapExample {
    public static void main(String[] args) {
        // 파일에서 읽어 올 데이터를 담을 Map
        Map<String, Integer> loadedMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("stock.txt"))) {
            String line;

            //int lineNumber = 0; // 디버깅용 줄 번호

            while ((line = br.readLine()) != null) {
                // "key value" 구조로 split
                String[] tokens = line.split(" "); // 공백을 구분자로 사용
                String key = tokens[0];
                int value = Integer.parseInt(tokens[1]);
                loadedMap.put(key, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("로드된 맵: " + loadedMap);

    }
}

