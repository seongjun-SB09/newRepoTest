package org.example.Head02_OOP.example14;

public class MainTest {
    public static void main(String[] args) {

        // 정적 출력
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.printValues();

        // 비정적 내부 출력
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printInstanceValue();

    }
}
