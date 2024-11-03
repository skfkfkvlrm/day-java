package dev.java.oop.homework.abs.ex5;

// 냉장고 클래스
public class Refrigerator extends Appliance {
    @Override
    public void performFunction() {
        if (isOn) {
            System.out.println("냉장고가 냉각을 시작합니다.");
        } else {
            System.out.println("냉장고 전원이 꺼져 있습니다.");
        }
    }
}
