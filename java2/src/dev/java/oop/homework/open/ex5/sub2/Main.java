package dev.java.oop.homework.open.ex5.sub2;

class Vehicle {
    void move() {
        System.out.println("vehicle move");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car move");
    }
}

class Bicycle extends Vehicle {
    void move() {
        System.out.println("Bicycle move");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        car.move();
        bicycle.move();
    }
}
