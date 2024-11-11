package dev.java.oop.homework.open.ex8.sub2;

public class Airplane implements Flyable {
    public void fly() {
        System.out.println("fly with engine");
    }
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("fly with wing");
    }
}

interface Flyable {
    public void fly();
}

class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();
        bird.fly();
        airplane.fly();
    }
}
