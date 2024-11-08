package dev.java.oop.homework.abs.ex10;

// 구체 클래스
public class Airplane extends AirVehicle {
    @Override
    public void move() {
        System.out.println("비행기가 활주로를 이동합니다.");
    }

    @Override
    public void fly() {
        System.out.println("비행기가 하늘을 납니다.");
    }
}
