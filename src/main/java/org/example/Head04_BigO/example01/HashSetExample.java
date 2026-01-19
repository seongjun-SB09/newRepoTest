package org.example.Head04_BigO.example01;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //요소 추가
        set.add("apple");
        set.add("banana");
        set.add("apple");

        System.out.println(set.contains("banana"));

        System.out.println(set.size());
    }
}
