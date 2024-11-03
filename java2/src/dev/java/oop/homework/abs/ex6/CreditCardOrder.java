package dev.java.oop.homework.abs.ex6;

// 신용카드 결제 클래스
public class CreditCardOrder extends OrderProcessor {
    @Override
    public void makePayment() {
        System.out.println("신용카드로 결제합니다.");
    }
}
