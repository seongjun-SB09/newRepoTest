package org.example.Head02_OOP.example17;

public class SwitchEnumDemo {
    public static void main(String[] args) {
        PaymentMethod method = PaymentMethod.CREDIT_CARD;


        switch (method) {
            case CREDIT_CARD:
                System.out.println("신용카드 결제 선택: " + method.getDisplayName());
                break;
            case ACCOUNT_TRANSFER:
                System.out.println("계좌이체 결제 선택: " + method.getDisplayName());
                break;
            case MOBILE_PAYMENT:
                System.out.println("모바일 결제 선택: " + method.getDisplayName());
                break;
        }
    }
}
