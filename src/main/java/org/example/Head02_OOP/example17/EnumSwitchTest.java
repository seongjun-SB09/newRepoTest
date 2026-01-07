package org.example.Head02_OOP.example17;

public class EnumSwitchTest {
    public enum OrderStatus {
        ORDERED, READY, DELIVERED
    }

    public static void printStatus(OrderStatus status) {
        switch (status) {
            case ORDERED:
                System.out.println("주문됨");
                break;
            case READY:
                System.out.println("준비 완료");
                break;
            case DELIVERED:
                System.out.println("배달 완료");
                break;
        }
    }

    public static void main(String[] args) {
        printStatus(OrderStatus.READY);
    }
}
