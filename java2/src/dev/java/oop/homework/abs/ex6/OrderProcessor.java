package dev.java.oop.homework.abs.ex6;

public abstract class OrderProcessor {
    // 주문 처리 전체 흐름
    public void processOrder() {
        selectItem();
        makePayment();
        if (isGift()) {
            wrapGift();
        }
        shipItem();
    }

    // 공통 구현 메서드
    public void selectItem() {
        System.out.println("상품을 선택했습니다.");
    }

    // 추상 메서드
    public abstract void makePayment();

    // 후크 메서드 (필요에 따라 오버라이드)
    public boolean isGift() {
        return false;
    }

    // 공통 구현 메서드
    public void wrapGift() {
        System.out.println("선물 포장을 합니다.");
    }

    // 공통 구현 메서드
    public void shipItem() {
        System.out.println("상품을 배송합니다.");
    }
}
