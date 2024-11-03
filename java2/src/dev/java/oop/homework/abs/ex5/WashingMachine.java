package dev.java.oop.homework.abs.ex5;

// 세탁기 클래스
public class WashingMachine extends Appliance {
    @Override
    public void performFunction() {
        if (isOn) {
            System.out.println("세탁기가 세탁을 시작합니다.");
        } else {
            System.out.println("세탁기 전원이 꺼져 있습니다.");
        }
    }
}
