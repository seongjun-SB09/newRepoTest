package org.example.Head04_BigO.example03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TextFileToListExample {
    public static void main(String[] args) {
        // 파일에서 읽어 올 데이터를 담을 리스트
        List<String> loadedItems = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("items.txt"))) {
            String line;

            // 파일의 각 줄을 읽어서 리스트에 추가
            while ((line = br.readLine()) != null) {

                // 빈 줄은 무시
                if(!line.trim().isEmpty()) {
                    loadedItems.add(line);
                }
                // 주석 무시
                if(line.startsWith("#")) continue;

                // 잘못된 데이터인지 체크 -> 메서드 직접 구현해야 함
                //if(!isValidData(line)) continue;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("로드된 리스트: " + loadedItems);

    }
}

