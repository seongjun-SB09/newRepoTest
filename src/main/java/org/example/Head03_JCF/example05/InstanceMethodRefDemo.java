package org.example.Head03_JCF.example05;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefDemo {
    public void printString(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        InstanceMethodRefDemo demo = new InstanceMethodRefDemo();
        List<String> list = Arrays.asList("Apple", "Banana", "Kiwi");

        // 람다
        // list.forEach(s -> demo.printString(s));

        // 인스턴스 메서드 참조
        list.forEach(demo::printString);
    }
}
