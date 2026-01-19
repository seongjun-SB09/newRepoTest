package org.example.Head04_BigO.example01;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        // 양방향 큐 생성
        Deque<Integer> deque = new LinkedList<>();

        // 앞쪽에 추가
        deque.addFirst(1); // [1]

        // 뒤쪽에 추가
        deque.addLast(2); // [1, 2]
        deque.addLast(3); // [1, 2, 3]

        // 양쪽에서 제거
        System.out.println(deque.removeFirst()); // 1
        System.out.println(deque.removeLast());  // 3
    }
}

// 최근 N개 항목 유지
// Deque<String> recentItems = new LinkedList<>();
// recentItems.addFirst(newItem);
// if(recentItems.size() > 10) {
// 		recentItems.removeLast(); // 오래된 것 제거
// }
