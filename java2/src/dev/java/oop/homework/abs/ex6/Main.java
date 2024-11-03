package dev.java.oop.homework.abs.ex6;

// 사용 예시
public class Main {
    public static void main(String[] args) {
        OrderProcessor order1 = new CreditCardOrder();
        order1.processOrder();
        /*
        출력:
        상품을 선택했습니다.
        신용카드로 결제합니다.
        상품을 배송합니다.
        */

        OrderProcessor order2 = new PayPalOrder();
        order2.processOrder();
        /*
        출력:
        상품을 선택했습니다.
        PayPal로 결제합니다.
        선물 포장을 합니다.
        상품을 배송합니다.
        */
    }
}
