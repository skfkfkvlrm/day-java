package dev.java.oop.homework.abs.ex5;

// 사용 예시
public class Main {
    public static void main(String[] args) {
        Appliance fridge = new Refrigerator();
        fridge.turnOn();
        fridge.performFunction();

        Appliance washer = new WashingMachine();
        washer.performFunction();
        washer.turnOn();
        washer.performFunction();
    }
}
