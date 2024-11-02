package dev.java.oop.abs;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal deer = new Deer();

        lion.eat();
        deer.eat();

        Circle circle = new Circle();
        circle.setColor("red");
        circle.draw();
    }
}
