package dev.java.oop.homework.abs.ex6;

// 페이팔 결제 클래스
public class PayPalOrder extends OrderProcessor {
    @Override
    public void makePayment() {
        System.out.println("PayPal로 결제합니다.");
    }

    @Override
    public boolean isGift() {
        return true;
    }
}
