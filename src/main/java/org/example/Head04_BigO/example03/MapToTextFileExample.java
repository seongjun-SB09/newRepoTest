package org.example.Head04_BigO.example03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToTextFileExample {
    public static void main(String[] args) {

        // 메모리에 있는 Map 데이터 (상품명과 재고)
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("banana", 20);
        stockMap.put("cherry", 30);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("stock.txt"))) {
            // Map의 각 엔트리를 간단히 "key value" 형태로 한 줄씩 출력
            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {
                bw.write(entry.getKey() + " " + entry.getValue()); // 공백으로 구분
                bw.newLine();

                // 더 안전한 형식
                // bw.write(entry.getKey() + "=" + entry.getValue());
                // JSON 형식
                // bw.write("\"" + entry.getKey() + "\":" + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

