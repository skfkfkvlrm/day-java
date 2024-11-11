package dev.java.oop.homework.open.ex7.sub1;

public abstract class Appliance {
    public abstract void turnOn();
    public abstract void turnOff();
}

class WashingMachine extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("세탁기의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("세탁기의 전원을 끕니다.");
    }
}

class Refrigerator extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("냉장고의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("냉장고의 전원을 끕니다.");
    }
}

class Main {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine();
        Appliance refrigerator = new Refrigerator();

        washingMachine.turnOn();
        washingMachine.turnOff();
        refrigerator.turnOn();
        refrigerator.turnOff();
    }
}