package dev.java.oop.homework.open.ex8.sub1;

public interface Chargeable {
    void charge(int amount);
}

class ElectricCar implements Chargeable {
    public int amount;

    @Override
    public void charge(int amount) {
        this.amount = amount;
        System.out.println("ElectricCar Charged " + amount + " %");
    }
}

class Smartphone implements Chargeable {
    public int amount;

    @Override
    public void charge(int amount) {
        this.amount = amount;
        System.out.println("Smartphone Charged " + amount + " %");
    }
}

class Main {
    public static void main(String[] args) {
        Chargeable car = new ElectricCar();
        Chargeable phone = new Smartphone();

        car.charge(10);
        car.charge(60);

        phone.charge(20);
        phone.charge(80);
    }
}
