package dev.java.oop.homework.open.ex5.sub2;

class Vehicle {
    //접근제어자 추가.
    public void move() {
        System.out.println("vehicle move");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car move");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle move");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle;

        Vehicle car = new Car();
        car.move();

        Vehicle bicycle = new Bicycle();
        bicycle.move();
    }
}
