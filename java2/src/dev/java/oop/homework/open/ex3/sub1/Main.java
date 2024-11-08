package dev.java.oop.homework.open.ex3.sub1;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("삼성", "I7-11700K","32GB");
        System.out.println("brand: " + computer.brand + " " + "cpu: " + computer.cpu+ " " + "ram: " + computer.ram);
    }
}
