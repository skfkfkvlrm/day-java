package dev.java.oop.homework.open.ex7.sub1;

public class Main {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine();
        Appliance refrigerator = new Refrigerator();

        washingMachine.turnOn();
        washingMachine.turnOff();
        refrigerator.turnOn();
        refrigerator.turnOff();
    }
}
