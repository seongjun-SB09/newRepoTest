package org.example.Head03_JCF.example05;

import java.util.Map;
import java.util.function.Function;

public class StaticMethodRefDemo {
    public static int doubleValue(int x) {
        return x * 2;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> f1 = StaticMethodRefDemo::doubleValue;
        System.out.println(f1.apply(10));
    }
}
