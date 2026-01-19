package org.example.Head04_BigO.example03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListToTextFileExample {
    public static void main(String[] args) {

        // 메모리에 있는 리스트 데이터
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        // 리스트를 파일로 저장
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("items.txt"))) {
            // 리스트의 각 요소를 한 줄씩 파일에 쓰는
            for (String item : items) {
                bw.write(item);
                bw.newLine(); // 줄바꿈
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
