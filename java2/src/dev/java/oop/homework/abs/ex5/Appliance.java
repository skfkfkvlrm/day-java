package dev.java.oop.homework.abs.ex5;

public abstract class Appliance {
    protected boolean isOn = false;

    // 전원 켜기
    public void turnOn() {
        isOn = true;
        System.out.println(getClass().getSimpleName() + " 전원이 켜졌습니다.");
    }

    // 전원 끄기
    public void turnOff() {
        isOn = false;
        System.out.println(getClass().getSimpleName() + " 전원이 꺼졌습니다.");
    }

    // 추상 메서드: 기능 수행
    public abstract void performFunction();
}
