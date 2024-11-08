package dev.java.oop.homework.open.ex7.sub1;

public class WashingMachine extends Appliance {
    @Override
    void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
